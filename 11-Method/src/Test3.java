import java.util.Scanner;

public class Test3 {
	// 선언 (데이터이기 때문에 함수 밖에서 선언 가능함)
    static int kor, eng, tot;
    static double avg;
    
	static char grade() {
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }

   static int input(String subject) {
         Scanner sc = new Scanner(System.in);
         System.out.print(subject + " 점수 입력: ");
         int jumsu = sc.nextInt();
         return jumsu;
   }
   static void calc_tot() {
      tot = kor + eng;
   }
   static void calc_avg() {
      avg = (double) tot / 2;
   }
   static void output() {
      System.out.println(grade() + "학점입니다.");
   }
   public static void main(String[] args) {
      
      // 입력
      kor = input("국어");
      eng = input("영어");
      // 연산
      calc_tot();
      calc_avg();
       // 출력
       output();
   }
}
/*
 static char grade(double avg) {
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }

   static int input(String subject) {
         Scanner sc = new Scanner(System.in);
         System.out.print(subject + " 점수 입력: ");
         int jumsu = sc.nextInt();
         return jumsu;
   }
   static int calc_tot(int kor, int eng) {
      return kor + eng;
   }
   static double calc_avg(int tot) {
      return (double) tot / 2;
   }
   static void output(double avg) {
      System.out.println(grade(avg) + "학점입니다.");
   }
   public static void main(String[] args) {
      // 선언
      int kor, eng, tot;
      double avg;
      // 입력
      kor = input("국어");
      eng = input("영어");
      // 연산
      tot = calc_tot(kor, eng);
       avg = calc_avg(tot);
       // 출력
       output(avg);
   }
   */
