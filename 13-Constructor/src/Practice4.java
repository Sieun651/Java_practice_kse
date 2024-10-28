import java.util.Scanner;

class Score4 {
	Scanner scanner = new Scanner(System.in);
	private int mid, last, work, chul;
	private double score;
	private String grade, pyeong;
	
	public void input() {
		System.out.print("중간고사를 입력하시오 : ");
		mid = scanner.nextInt();
		System.out.print("기말고사를 입력하시오 : ");
		last = scanner.nextInt();
		System.out.print("과제점수를 입력하시오 : ");
		work = scanner.nextInt();
		System.out.print("출석점수를 입력하시오 : ");
		chul = scanner.nextInt();
	}
	public void score() {
		score = (double)(mid+last)/2*0.6 + work*0.2 + chul*0.2;
	}
	public void grade() {
		if(score>=90 && score<=100) grade="A";
		else if(score>=80 && score<90) grade="B";
		else if(score>=70 && score<80) grade="C";
		else if(score>=60 && score<70) grade="D";
		else if(score>=0 && score<60) grade="F";
	}
	public void pyeong() {
		if(grade.equals("A") || grade.equals("B")) pyeong="excellent";
		else if(grade.equals("C") || grade.equals("D")) pyeong="good";
		else if(grade.equals("F")) pyeong="poor";
				
	}
	public void output() {
		score();
		grade();
		pyeong();
		System.out.println();
		System.out.printf("성적 = %.2f\n", score);
		System.out.println("학점 = " + grade);
		System.out.println("평가 = " + pyeong);
	}
	
}

public class Practice4 {
	public static void main(String[] args) {
		//선언
		Score4 score4 = new Score4();
		//입력
		score4.input();
		//연산+출력
		score4.output();
	}
}
