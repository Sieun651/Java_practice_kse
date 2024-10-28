package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class InsertTest {
	// 1. Driver 등록 확인
	public InsertTest() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 등록 실패");
			//e.printStackTrace();
		}
	}
	
	// 2. DB 접속
	// Connection : oracle DB와의 접속을 관리하는 클래스
	public Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "C##dbexam";
		String password = "m1234";
		
		try {
			// db에 접속을 시도하여, 성공하면 Connection 객체 리턴, 실패하면 null 리턴
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("db 접속 성공");
		} catch (SQLException e) {
			System.out.println("db 접속 실패");
			//e.printStackTrace();
		}
		return conn;
	}
	
	// 3. CRUD 작업 = SQL 작업
	// => insert 작업
	public int insertArticle(String name, int age, double height) {
		String sql = "insert into dbtest values (?, ?, ?, sysdate)";
		int result = 0;	//결과를 저장할 변수
		// 1) db에 접속하기
		Connection conn = getConnection();
		PreparedStatement pstmt = null;		// sql문을 관리하기 편하게 하기위해 만들어진 클래스
											// ?를 통해서 관리
		try {
			// 2) sql 작업
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, height);
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
}

public class Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		InsertTest insertTest = new InsertTest();
		int result = insertTest.insertArticle(name, age, height);
		
		if(result > 0) System.out.println("저장 성공");
		else System.out.println("저장 실패");
	}
}
