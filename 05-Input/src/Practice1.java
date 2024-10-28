import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		// 사용준비
		Scanner sc = new Scanner(System.in);
		
		// 선언 + 입력
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("실수 입력 : ");
		double b = sc.nextDouble();
		
		System.out.print("문자 입력 : ");
		char c = sc.next().charAt(0);
		
		System.out.print("boolean 입력 : ");
		boolean d = sc.nextBoolean();
		
		System.out.print("문자열 입력 : ");
		String e = sc.next();
		
		System.out.println();
		
		// 출력
		System.out.println("--- 결과확인 ---");
		System.out.println("정수 : " + a);
		System.out.println("실수 : " + b);
		System.out.println("문자 : " + c);
		System.out.println("boolean : " + d);
		System.out.println("문자열 : " + e);	
		
	}

}
