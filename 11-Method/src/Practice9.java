import java.util.Scanner;

public class Practice9 {
	static String input_name() {
		Scanner sc = new Scanner(System.in);
		System.out.print("품명을 입력하시오 : ");
		return sc.next();
	}
	static int input_num(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.print(str + " 입력하시오 : ");
		return sc.nextInt();		
	}
	static int compute(int num, int price) {
		return num*price;
	}
	static void output(String name, int num, int price, int tot) {
		System.out.println();
		System.out.println("품명 : " + name);
		System.out.println("수량 : " + num);
		System.out.println("단가 : " + price);
		System.out.println("총액 : " + tot + "원");
	}
	
	public static void main(String[] args) {
		// 선언
		String name=" ";
		int num=0, price=0, tot=0;
		// 입력
		name = input_name();
		num = input_num("수량을");
		price = input_num("단가를");
		// 연산
		tot = compute(num, price);
		// 출력
		output(name, num, price, tot);
	}
}
