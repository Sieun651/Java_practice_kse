import java.util.Scanner;

public class Practice6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간고사를 입력하시요 : ");
		int mex = sc.nextInt();
		System.out.print("기말고사를 입력하시오 : ");
		int lex = sc.nextInt();
		System.out.print("과제점수를 입력하시오 : ");
		int work = sc.nextInt();
		System.out.print("출석점수를 입력하시오 : ");
		int cul = sc.nextInt();
		
		System.out.println();
		
		double score = ((mex + lex)/2.0)*0.6 + work*0.2 + cul*0.2;
		char grade = ' ';
		String str = " ";
		
		if(score >= 90 && score <= 100) grade = 'A';
		else if (score >= 80) grade = 'B';
		else if (score >= 70) grade = 'C';
		else if (score >= 60) grade = 'D';
		else grade = 'F';
		
		if(score >= 80 && score <= 100) str = "excellent";
		else if (score >= 60) str = "good";
		else str = "poor";
		
		System.out.printf("성적 = %.2f\n", score);
		System.out.println("학점 = " + grade);
		System.out.println("평가 = " + str);
	}
}
//다른방법풀이(workspace 확인) 2024.03.27