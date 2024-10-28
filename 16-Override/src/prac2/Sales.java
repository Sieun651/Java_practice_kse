package prac2;

import java.util.Scanner;

public class Sales {
	Scanner scanner = new Scanner(System.in);
	protected String article;			//품목
	protected int qty;				//수량
	protected int cost;				//단가
	private static int cnt;			//판매건수
	private static double discount;	// 할인율
	
	public void input() {
		System.out.print("품목 : ");
		article = scanner.next();
		System.out.print("수량 : ");
		qty = scanner.nextInt();
		System.out.print("단가 : ");
		cost = scanner.nextInt();		
	}
	
	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		Sales.cnt = cnt;
	}

	public static double getDiscount() {
		return discount;
	}

	public static void setDiscount(double discount) {
		Sales.discount = discount;
	}	
}
