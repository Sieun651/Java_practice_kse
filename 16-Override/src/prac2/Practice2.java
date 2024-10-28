package prac2;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Test2[] op = new Test2[2];
		
		for(int i=0; i<op.length; i++) {
			op[i] = new Test2();				// 객체 1개 생성
			op[i].input();						// 상품 1개 데이터 저장
			System.out.println();
			op[i].setProcess();					// 총액
			Sales.setCnt(op[i].qty + Sales.getCnt());	// 총 상품수 계산
		}
		
		System.out.print("할인율 : ");
		Sales.setDiscount(scanner.nextDouble());
		System.out.println();
		
		System.out.println("[[판매가]]");
		for(int i=0; i<op.length; i++) {
			op[i].getDisplay();
		}
		System.out.println();
		System.out.println("판매건수 : " + Sales.getCnt());

	}	
}
