import java.util.Scanner;

class AAA {
	Scanner sc = new Scanner(System.in);
	// 선언
	int a, b, c;
	
	// 입력
	void input() {
		System.out.print("정수 입력 : ");
		a = sc.nextInt();
		System.out.print("정수 입력 : ");
		b = sc.nextInt();
	}
	// 연산
	void plus() {
		c = a + b;
	}
	// 출력
	void output() {
		System.out.printf("%d + %d = %d\n", a, b, c);
	}		
}

public class Test1 {	
	
	public static void main(String[] args) {	
		AAA aa = new AAA();
		aa.input();
		aa.plus();
		aa.output();		
	}
}
