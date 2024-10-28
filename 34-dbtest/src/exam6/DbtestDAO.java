    // db 연동 처리 클래스(CRUD 작업)
package exam6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbtestDAO {
	// 1. Driver 등록 확인
	public DbtestDAO() {
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
	// 3.1. insert
	public int insertArticle(DbtestDTO dto) {
		String sql = "insert into dbtest values (?, ?, ?, sysdate)";
		int result = 0;	//결과를 저장할 변수
		// 1) db에 접속하기
		Connection conn = getConnection();
		PreparedStatement pstmt = null;		// sql문을 관리하기 편하게 하기위해 만들어진 클래스
											// ?를 통해서 관리
		try {
			// 2) sql 작업
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setDouble(3, dto.getHeight());
			// executeUpdate();
			// 1) db에 sql문을 전송함	2) 응답이 올때까지 기다림 3) 그 결과값을 리턴
			// insert인 경우 성공시 result 에는 처리된 데이터의 개수가 저장됨
			result = pstmt.executeUpdate();	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3) 접속 끊기
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	// 3.2. select
	// 이름검색
	public DbtestDTO selectOne(String name) {
		String sql = "select * from dbtest where name=?";
		DbtestDTO dto = null;
		// 1) db 접속하기
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 2) sql 처리		
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  name);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new DbtestDTO();
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setHeight(rs.getDouble("height"));
				dto.setLogtime(rs.getString("logtime"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 3) db 접속 끊기
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
	
	
	// 전체검색
	public List<DbtestDTO> selectArticle() {
		String sql = "select * from dbtest";
		List<DbtestDTO> list = new ArrayList<DbtestDTO>();
		// 1) db 접속하기
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 2) sql 처리
			pstmt = conn.prepareStatement(sql);
			// 2-1) sql 전송, 2-2) 응답을 기다림, 2-3) 응답결과를 리턴함
			// => select일 경우에는 검색결과가 문자열로 리턴되어옴
			// 	  문자열에서 1줄씩 꺼내서 resultSet 객체에 저장하고 리턴함
			rs = pstmt.executeQuery();
			
			while(rs.next()) {	// 읽어올 1줄 데이터가 있으면 true
				String name = rs.getString("name");
				int age = rs.getInt("age");
				double height = rs.getDouble("height");
				String logtime = rs.getString("logtime");
				DbtestDTO dto = new DbtestDTO(name, age, height, logtime);
				// 리스트에 저장
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 3) db 접속 끊기
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
	// 3.3. update
	public int updateArticle(String name, int age) {
		String sql = "update dbtest set age=? where name=?";
		int result = 0;
		// 1) db 접속하기
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		try {
			// 2) sql 작업
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, age);
			pstmt.setString(2, name);			
			// 2-1) sql 전송, 2-2) 응답 대기, 2-3) 전달된 값을 리턴
			// => update일 경우, 처리된 데이터 개수 리턴
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3) db 접속끊기
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	// 3.4. delete
	public int deleteArticle(String name) {
		String sql = "delete dbtest where name=?";
		int result = 0;
		// 1) db 접속하기
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		
		try {
			// 2) SQL 작업
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			// 2-1) sql 전송, 2-2) 응답 대기, 2-3) 전달된 값을 리턴
			// => delete일 경우, 처리된 데이터 개수 리턴
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 3) db 접속끊기
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return result;
	}

}
