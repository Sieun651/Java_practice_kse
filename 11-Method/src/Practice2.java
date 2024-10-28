import java.util.Scanner;

public class Practice2 {
	static char grade(double avg) {
		if(avg>=90 && avg<=100) {
			return 'A';
		} else if(avg>=80 && avg<90) {
			return 'B';
		} else if(avg>=70 && avg<80) {
			return 'C';
		} else if(avg>=60 && avg<70) {
			return 'D';
		} else return 'F';
	}
	static int input(String subject) {
		Scanner sc = new Scanner(System.in);
		System.out.print(subject + "점수 입력 : ");
		int score = sc.nextInt();
		return score ;
	}
	static int calc_tot(int kor, int eng) {
		return kor + eng;
	}
	static double calc_avg(int tot) {
		return (double)tot/2;		
	}
	static void output(double avg) {
		System.out.println(grade(avg) + "학점입니다.");
	}
	
	public static void main(String[] args) {		
		//선언
		int kor, eng, tot;
		double avg;
		//입력
		kor = input("국어");
		eng = input("영어");		
		//연산
		tot = calc_tot(kor, eng);
		avg = calc_avg(tot);
		//출력
		output(avg);
	}
}
// 문제 풀고 한블럭씩 함수로 옮기는 연습
