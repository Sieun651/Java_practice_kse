import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		// 사용준비
		Scanner sc = new Scanner(System.in);
		
		// 선언(변수만들기) + 입력(변수에 데이터 저장하기)
		System.out.print("이름? ");
		String name = sc.next();
		
		System.out.print("국어? ");
		int kor = sc.nextInt();
		
		System.out.print("영어? ");
		int eng = sc.nextInt();
		
		System.out.print("수학? ");
		int mat = sc.nextInt();
		
		// 연산(변수에 저장된 데이터 가공하기)
		int tot = kor + eng + mat;
		
		System.out.println();
		
		// 출력(결과값 확인)
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + tot);
	}
}
