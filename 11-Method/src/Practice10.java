import java.util.Scanner;

public class Practice10 {
	static int input_jumsu(int[] a) {
		Scanner sc = new Scanner(System.in);
		int tot = 0;
		for(int i=0; i<a.length; i++) {
	         System.out.print((i+1) + "번 학생의 점수를 입력 : ");
	         a[i] = sc.nextInt();
	         tot += a[i];	         
	    }
		return tot;
	}
	static double calc_avg(int tot, int[] a) {
		return (double)tot/a.length;
	}
	static void output(int tot, double avg) {
		System.out.println();
		System.out.printf("총점 : %s, 평균 : %s", tot, avg);
	}
	public static void main(String[] args) {	      
	      // 선언
	      int[] a = new int[5];
	      int tot=0;
	      double avg=0;
	      // 입력 및 연산   input_jumsu
	      tot = input_jumsu(a);
	      // 연산    calc_avg
	      avg = calc_avg(tot, a);
	      // 출력    output
	      output(tot, avg);
	 }
}
