import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int[] score = new int[5];
		int tot=0;
		double avr=0;
				
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1)+"번 학생의 점수를 입력 : ");
			score[i] = sc.nextInt();
			tot += score[i];
		}
		avr = (double)tot/score.length;
		System.out.printf("총점: %s, 평균: %s", tot, avr);		
	}
}
