package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class UpdateTest {
	// 1. Driver 등록 확인
	public UpdateTest() {
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
		// 접속 성공 : Connection 객체, 접속 실패 : null 리턴
		return conn;
	}
	// 3. sql 처리
	public int updateArticle(String name) {
		String sql = "update dbtest set age=age+1 where name=?";
		int result = 0;
		// 1) db 접속하기
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		try {
			// 2) sql 작업
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
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
}

public class Exam4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 이름 입력 : ");
		String name = sc.next();
		
		UpdateTest updateTest = new UpdateTest();
		int result = updateTest.updateArticle(name);
		
		if(result > 0) System.out.println("수정 성공");
		else System.out.println("수정 실패");
		
	}
}
