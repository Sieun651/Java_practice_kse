import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 선언 + 입력
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int mat = sc.nextInt();
		
		// 연산
		int avr = (kor + eng + mat)/3;
		
		// 연산 + 출력
		System.out.println();
		if(avr>=60 && kor>=40 && eng>=40 && mat>=40) {
			System.out.print("합격");		
		} else {
			System.out.print("불합격");
		}
	}
}
