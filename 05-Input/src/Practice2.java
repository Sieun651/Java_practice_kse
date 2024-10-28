import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		// 사용준비
		Scanner sc = new Scanner(System.in);
		
		// 선언 + 입력
		System.out.println("--입력--");
		System.out.println("****삼각형의 넓이 구하기****");
		
		System.out.print("밑변 : ");
		double width = sc.nextDouble();
		
		System.out.print("높이 : ");
		double height = sc.nextDouble();
		
		System.out.println();
		
		// 연산
		double area = (width * height)/2;
		
		// 출력
		System.out.println("--출력--");
		System.out.printf("넓이 : %.2f", area);
	}
}
