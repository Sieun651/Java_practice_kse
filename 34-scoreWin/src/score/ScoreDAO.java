package score;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ScoreDAO {	
	// 1. 드라이버 등록 확인
	public ScoreDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
	}
	
	// 2. db 접속 함수
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
		return conn;
	}
	
	// 0. 학번 중복검사
	public boolean isExist(String hak) {		
		String sql = "select * from score where hak=?";
		boolean result = false;
		// db 접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;		
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, hak);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = true; 
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	// 1. 입력
	public int insertDB(ScoreDTO dto) {
		String sql = "insert into score values (?, ?, ?, ?, ?, ?, ?)";
		int result = 0;
		// db 접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		
		// sql 작업
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getHak());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMat());
			pstmt.setInt(6, dto.getTot());
			pstmt.setDouble(7, dto.getAvg());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return result;
	}
	
	// 2. 전체 출력
	public List<ScoreDTO> printDB() {
		List<ScoreDTO> list = new ArrayList<ScoreDTO>();
		String sql = "select * from score order by avg desc";
		// db 접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String hak = rs.getString("hak");
				String name = rs.getString("name");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				int mat = rs.getInt("mat");
				int tot = rs.getInt("tot");
				double avg = rs.getDouble("avg");
				
				ScoreDTO dto = new ScoreDTO(hak, name, kor, eng, mat, tot, avg);
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	// 3. 학번 검색
	public List<ScoreDTO> searchHakDB(ScoreDTO dto) {
		List<ScoreDTO> list = new ArrayList<ScoreDTO>();
		String sql = "select * from score where hak like ?";
		// db 접속
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + dto.getHak() + "%");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String hak = rs.getString("hak");
				String name = rs.getString("name");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				int mat = rs.getInt("mat");
				int tot = rs.getInt("tot");
				double avg = rs.getDouble("avg");
				
				
				ScoreDTO dto1 = new ScoreDTO(hak, name, kor, eng, mat, tot, avg);
				list.add(dto1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	// 4. 이름 검색
		public List<ScoreDTO> searchNameDB(ScoreDTO dto) {
			List<ScoreDTO> list = new ArrayList<ScoreDTO>();
			String sql = "select * from score where name like ?";
			// db 접속
			Connection conn = getConnection();
			PreparedStatement pstmt = null;
			ResultSet rs = null;			
			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "%" + dto.getName() + "%");
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					String hak = rs.getString("hak");
					String name = rs.getString("name");
					int kor = rs.getInt("kor");
					int eng = rs.getInt("eng");
					int mat = rs.getInt("mat");
					int tot = rs.getInt("tot");
					double avg = rs.getDouble("avg");
					
					ScoreDTO dto2 = new ScoreDTO(hak, name, kor, eng, mat, tot, avg);
					list.add(dto2);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return list;
		}
}










