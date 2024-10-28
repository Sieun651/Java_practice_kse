package com.dao;

public class Exam1 {
	public static void main(String[] args) {
		try {
			// 프로젝트 내에 클래스가 존재하는지 검사하는 함수
			// 존재하지 않으면 예외를 발생시킴
			// ojdbc8.jar 라이브러리가 등록되었는지 검사
			Class.forName("oracle.jdbc.driver.OracleDriver");	// ojdbc8.jar에 있는 클래스임
			System.out.println("드라이버 등록 성공"); 
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 등록 실패");
			//e.printStackTrace();
		}
	}
}
