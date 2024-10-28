import java.util.Scanner;

public class Practice7 {
	static int input_dan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단을 출력할지 입력하세요 : ");
        return sc.nextInt();
	}
	static void print_dan(int dan) {
		for(int i=1; i<=9; i++) {
        System.out.println(dan + " * " + i + " = " + dan*i);
        }
	}
	static String input_continue() {
		Scanner sc = new Scanner(System.in);
		System.out.print("계속할지 선택하세요 (y:계속): ");
        return sc.next();
	}
	static void end_pgm(String str) {
		if(!str.equals("y")) {
            System.out.println("종료");
            System.exit(0); // 함수 안에서 프로그램 종료 명령시 무조건 exit사용
		} 
	}
		
	public static void main(String[] args) {	      

	      // 선언
	      int dan = 0;
	      String str = "";  // 계속 여부 저장, "y" 또는 다른 문자열
	      
	      while(true) {
	         // 입력 input_dan
	         dan=input_dan();
	         System.out.println();
	         // 연산 + 출력  print_dan
	         print_dan(dan);
	         System.out.println();
	         // 입력 input_continue
	         str=input_continue();
	         // end_pgm
	         end_pgm(str);
	         System.out.println();
	      }      
	}
}

//아래를 위처럼 수정
/*
import java.util.Scanner;

public class Practice7 {
   static int input_dan() {
      Scanner sc = new Scanner(System.in);
      System.out.print("몇 단을 출력할지 입력하세요 : ");
        int dan = sc.nextInt();
        return dan;
   }
   static void print_dan(int dan) {
       for(int i=1; i<=9; i++) {
           System.out.println(dan + " * " + i + " = " + dan*i);
       }
       System.out.println();
   }
   static String input_continue() {
      Scanner sc = new Scanner(System.in);
       System.out.print("계속할지 선택하세요 (y:계속): ");
       String str = sc.next();
       return str;
   }
   static void end_pgm(String str) {
       if(!str.equals("y")) {
          System.out.println("종료");
          System.exit(0); 
       }
   }
   public static void main(String[] args) {
      // 선언
      int dan = 0;
      String str = "";  // 계속 여부 저장, "y" 또는 다른 문자열
      
      while(true) {
         // 입력 input_dan
         dan = input_dan();
         // 연산 + 출력  
           print_dan(dan);
         // 입력 
           str = input_continue();
           // end_pgm
           end_pgm(str);           
           System.out.println();
      }      
   }
}
*/