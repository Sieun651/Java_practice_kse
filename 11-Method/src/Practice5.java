import java.util.Scanner;

public class Practice5 {
	
   static double input(String str){
	   Scanner sc = new Scanner(System.in);
	   System.out.print(str+" 점수를 입력하시오 : ");
	   return sc.nextDouble();
   }
   static double calc_avg(double mid_exam, double final_exam) {
	   return (mid_exam + final_exam) / 2;
   }
   static double calc_final_score(double avg, double task, double attendace) {
	   return avg * 0.6 + task * 0.2 + attendace * 0.2;
   }
   static String calc_grade(double final_score) {
	   String grade = " ";
	   if (final_score >= 90 && final_score <= 100) {
	         grade = "A";
	      } else if (final_score >= 80) {
	         grade = "B";
	      } else if (final_score >= 70) {
	         grade = "C";
	      } else if (final_score >= 60) {
	         grade = "D";
	      } else {
	         grade = "F";
	      }
	   return grade;
   }
   static String get_review(String grade){
	   String review = " ";
	   if (grade.equals("A") || grade.equals("B")) {
	         review = "excellent";
	      } else if (grade.equals("C") || grade.equals("D")) {
	         review = "good";
	      } else if (grade.equals("F")) {
	         review = "poor";
	      }
	   return review;
   }
   static void output(double final_score, String grade, String review) {
	   System.out.printf("성적 : %.2f\n",final_score);
	   System.out.printf("학점 : %s\n",grade);
	   System.out.printf("평가 : %s\n",review);
   }
   
   public static void main(String[] args) {      
      // 선언
      double mid_exam = 0, final_exam = 0, task = 0;
      double attendace = 0, avg = 0, final_score = 0;
      String grade = "", review = "";

      // 입력
      mid_exam = input("중간고사");
      final_exam = input("기말고사");
      task = input("과제");
      attendace = input("출석");
      System.out.println();

      // 연산
      avg = calc_avg(mid_exam, final_exam);
      final_score = calc_final_score(avg, task, attendace);      
      grade = calc_grade(final_score);
      review = get_review(grade);    

      // 출력
      output(final_score, grade, review);      
   }
}

//아래를 위처럼 수정
/*
   import java.util.Scanner;

   public class Practice5 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      // 선언
      double mid_exam = 0, final_exam = 0, task = 0;
      double attendace = 0, avg = 0, final_score = 0;
      String grade = "", review = "";

      // 입력
      System.out.print("중간고사 점수를 입력하시오 : ");
      mid_exam = in.nextDouble();

      System.out.print("기말고사 점수를 입력하시오 : ");
      final_exam = in.nextDouble();

      System.out.print("과제 점수를 입력하시오 : ");
      task = in.nextDouble();

      System.out.print("출석 점수를 입력하시오 : ");
      attendace = in.nextDouble();
      System.out.println();

      // 연산
      avg = (mid_exam + final_exam) / 2;
      final_score = (avg * 0.6 + task * 0.2 + attendace * 0.2);

      if (final_score >= 90 && final_score <= 100) {
         grade = "A";
      } else if (final_score >= 80) {
         grade = "B";
      } else if (final_score >= 70) {
         grade = "C";
      } else if (final_score >= 60) {
         grade = "D";
      } else {
         grade = "F";
      }

      if (grade.equals("A") || grade.equals("B")) {
         review = "excellent";
      } else if (grade.equals("C") || grade.equals("D")) {
         review = "good";
      } else if (grade.equals("F")) {
         review = "poor";
      }

      // 출력
      System.out.printf("성적 : %.2f\n",final_score);
      System.out.printf("학점 : %s\n",grade);
      System.out.printf("평가 : %s\n",review);
   }
 */