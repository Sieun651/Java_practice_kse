import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		// Scanner 사용준비
		Scanner sc = new Scanner(System.in);
		
		// 선언 + 입력
		System.out.print("첫 번째 수 = ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 수 = ");
		int num2 = sc.nextInt();
		
		String ph1 = "첫 번째 수(" + num1 + ")가 두 번째 수(" + num2 + ")보다 작은 수입니다.";
		String ph2 = "첫 번째 수(" + num1 + ")가 두 번째 수(" + num2 + ")보다 큰 수입니다.";
		String ph3 = "첫 번째 수(" + num1 + ")와 두 번째 수(" + num2 + ")는 같은 수입니다.";		
		
		// 연산 + 출력
		System.out.println();
		System.out.print(num1 > num2 ? ph2 : num1 == num2 ? ph3 : ph1);
		// System.out.print(num1 == num2 ? ph3 : num1 > num2 ? ph2 : ph1);
	}
}
