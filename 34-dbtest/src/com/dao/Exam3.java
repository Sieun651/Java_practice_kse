package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class SelectText {
	// 1. Driver 등록 확인
	public SelectText() {
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
	public void selectArticle() {
		String sql = "select * from dbtest";
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
				System.out.printf("%s\t %s\t %s\t %s\n", name, age, height, logtime);
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
	}
	
	
}

public class Exam3 {
	public static void main(String[] args) {
		SelectText selectText = new SelectText();
		selectText.selectArticle();
	}
}
