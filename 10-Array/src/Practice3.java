import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 선언
		int[] score = new int[5];
		int[] rank = new int[5];
		// 입력
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1)+"번 점수 입력 : ");
			score[i] = sc.nextInt();
			rank[i] = 1;   //rank 초기화
			}
		System.out.println();
		// 연산
		for(int i=0; i<score.length; i++) {			// 기준값
			for(int j=0; j<score.length; j++) {		// 비교값
				if(score[i]<score[j]) rank[i]++;
			}
		}
		// 출력
		System.out.println("*** 결과 ***");
		for(int i=0; i<score.length; i++) {
			System.out.printf("%s점 : %s등\n", score[i], rank[i]);
		}
	}
}
