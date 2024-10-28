package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class DeleteTest {
	// 1. Driver 등록 확인
	DeleteTest() {
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
	// 3. sql 처리
	public int deleteArtkcle(String name) {
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

public class Exam5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 이름 입력 : ");
		String name = sc.next();
		
		DeleteTest deleteTest = new DeleteTest();
		int result = deleteTest.deleteArtkcle(name);
		
		if(result > 0) System.out.println("삭제 성공");
		else System.out.println("삭제 실패");
	}
}
