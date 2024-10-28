import java.util.Scanner;

public class Practice7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간고사를 입력하시요 : ");
		int mid = sc.nextInt();
		System.out.print("기말고사를 입력하시요 : ");
		int last = sc.nextInt();
		System.out.print("과제점수를 입력하시요 : ");
		int work = sc.nextInt();
		System.out.print("출석점수를 입력하시요 : ");
		int cul = sc.nextInt();
		char grade = 0;
		String pp = " ";
		
		double score = (mid+last)/2.0*0.6 + work*0.2 + cul*0.2;
		//double score = ((double)(mid+last)/2)*0.6 + work*0.2 + cul*0.2;
		
		switch((int)score/10) {
		case 10:
		case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		default: grade = 'F';
		}
		
		switch(grade) {
		case 'A':
		case 'B': pp = "excellent"; break;
		case 'C':
		case 'D': pp = "good"; break;
		case 'F': pp = "poor";
		}
		
		System.out.println();
		System.out.printf("성적 = %.2f\n", score);
		System.out.println("학점 = " + grade);
		System.out.println("평가 = " + pp);
	}
}
