import java.util.Scanner;

class AAA2 {
	Scanner scanner = new Scanner(System.in);
	// 선언
	int a, b, c;
	
	// 입력
	void input() {
		System.out.print("정수 입력 : ");
		a = scanner.nextInt();
		System.out.print("정수 입력 : ");
		b = scanner.nextInt();
	}
		
	// 연산
	void plus() {
		c = a + b;
	}
	
	// 출력
	void output() {
		System.out.println();
		System.out.printf("%d + %d = %d\n", a, b, c);
	}
}
public class Test2 {
	public static void main(String[] args) {
		AAA2 aaa2 = new AAA2();
		aaa2.input();
		aaa2.plus();
		aaa2.output();
	}
}
