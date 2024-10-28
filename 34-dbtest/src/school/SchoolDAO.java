package school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SchoolDAO {
	
	public SchoolDAO() {
		// 1. 드라이버 등록
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
		
	// 2. db 접속함수
	public Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "C##dbexam";
		String password = "m1234";
				
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 접속 성공 : Connection 객체, 접속 실패 : null 리턴
		return conn;
	}
	
	// 3. sql 작업
	// 3.1 insert
	public int insertInfo(SchoolDTO dto) {
		String sql = "insert into school values (?, ?, ?)";
		int result = 0;
		// 1) db접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		try {
			// 2) sql 작업
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getValue());
			pstmt.setInt(3, dto.getCode());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3) db 접속 끊기
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	// 3.2 select
	// 3.2.1. 전체검색
	public List<SchoolDTO> selectAll() {
		String sql = "select * from school";
		List<SchoolDTO> list = new ArrayList<SchoolDTO>();
		// 1) db접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 2) sql 작업
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString("name");
				String value = rs.getString("value");
				int code = rs.getInt("code");
				
				SchoolDTO dto = new SchoolDTO(name, value, code);
				
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3) db 접속 끊기
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	// 3.2 select
	// 3.2.2. 이름검색
	public List<SchoolDTO> selectName(String name) {
		String sql = "select * from school where name like ?";
		List<SchoolDTO> list = new ArrayList<SchoolDTO>();
		// 1) db접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 2) sql 작업
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+name+"%");
			rs = pstmt.executeQuery();
				while(rs.next()) {
					String name2 = rs.getString("name");
					String value = rs.getString("value");
					int code = rs.getInt("code");
					
					SchoolDTO dto = new SchoolDTO(name2, value, code);
					
					list.add(dto);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3) db 접속 끊기
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	// 3.3 delete
	public int deleteArticle(String name) {
		String sql = "delete school where name=?";
		int result = 0;
		// 1) db접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		
		try {
			// 2) sql 작업
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3) db 접속 끊기
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	

}
