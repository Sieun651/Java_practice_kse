import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 선언
		   double num1=0, num2-0, result=0; 
		   char yeon = 0;
		 */
		System.out.print("첫 번째 수 : ");
		double num1 = sc.nextDouble();
		System.out.print("두 번째 수 : ");
		double num2 = sc.nextDouble();
		System.out.print("연산자 : ");
		char yeon = sc.next().charAt(0);
		double res = 0;
		
		// 연산
		switch(yeon) {
		case '+': res = num1 + num2; break;
		case '-': res = num1 - num2; break;
		case '*': res = num1 * num2; break;
		case '/': res = num1 / num2; break;
		default: res = 'E';
		}
		System.out.println("res:"+res);
		
		// 출력
		System.out.println();
		if(res != 'E') {
		System.out.printf("%s %s %s = %s", num1, yeon, num2, res);
		// %s : 문자열, 또는 다른 데이터를 삽입시킬 때 사용해도 됨
		} else {
			System.out.println("연산자 입력이 잘못되었습니다.");
		}
}
}
