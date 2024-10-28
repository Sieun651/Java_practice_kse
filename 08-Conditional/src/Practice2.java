import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("국어점수 입력: ");
		int kor = sc.nextInt();
		
		System.out.print("영어점수 입력: ");
		int eng = sc.nextInt();
		
		int tot = kor + eng;
		double avr = (double)tot/2;
		
		System.out.println();
		System.out.println("총점 = " + tot);
		System.out.printf("평균 = %.1f\n", avr);
		if(avr >= 90) {
			System.out.println("학점 = A");
		} else if(avr >= 80) {
			System.out.println("학점 = B");
		} else if(avr >= 70) {
			System.out.println("학점 = C");
		} else if(avr >= 60) {
			System.out.println("학점 = D");
		} else {
			System.out.println("학점 = F");
		}
	}
}
// 다른방법풀이(workspace 확인) 2024.03.27