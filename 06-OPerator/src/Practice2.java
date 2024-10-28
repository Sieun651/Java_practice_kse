import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		// Scanner 사용 준비
		Scanner sc = new Scanner(System.in);
		
		// 선언 + 입력
		/* int money = 0; (변수의 초기화, 권장사항)
		 * int t = 0
		 * int h = 0
		 * int te = 0
		 * int o = 0*/
		
		System.out.print("금액 입력 : ");
		int mon = sc.nextInt();
		
		// 연산
		int t = mon / 1000;
		int h = (mon % 1000)/100;
		int te = (mon % 100)/10;
		int o = mon % 10;
		// 나머지값을 선언해서 구하는 방법도 있음(선생님 workspace 참고)
		
		System.out.println();
		
		// 출력
		System.out.println("금액 : " + mon + "원");
		System.out.println("천원 : " + t + "장");
		System.out.println("백원 : " + h + "개");
		System.out.println("십원 : " + te + "개");
		System.out.println("일원 : " + o + "개");
		//System.out.printf("금액 : %d원\n", mon);
	}
}
