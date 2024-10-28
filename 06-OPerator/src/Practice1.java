import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 입력 : ");
		int mon = sc.nextInt();
		int tou = mon / 1000;
		int hun = (mon % 1000) / 100;
		int ten = (mon % 100) / 10;
		int one = mon % 10;
		
		
		System.out.println();
		System.out.println("금액 : " + mon + "원");
		System.out.println("천원 : " + tou + "장");
		System.out.println("백원 : " + hun + "개");
		System.out.println("십원 : " + ten + "개");
		System.out.println("일원 : " + one + "개");
	}
	
}
