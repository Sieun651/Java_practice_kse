import java.util.Scanner;

public class Practice4 {
	static double input_num(char num){
		Scanner sc = new Scanner(System.in);
		System.out.print(num + " 번째 수 : ");
		return sc.nextDouble();
	}
	static char input_op(){
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자 : ");
		return sc.next().charAt(0);
	}
	static double calc(char op, double num1, double num2){
		double result = 0;
		switch(op) {
		  case '+': result = num1 + num2; break;
	      case '-': result = num1 - num2; break;
	      case '*': result = num1 * num2; break;
	      case '/': result = num1 / num2; break;
		}
		return result;
	}
	static void output(double num1, char op, double num2, double result){
		System.out.printf("%s %s %s = %s", num1, op, num2, result);
	}
	public static void main(String[] args) {	      

	      // 선언
	      double num1 = 0, num2 = 0, result = 0;
	      char op = 0;

	      // 입력
	      num1=input_num('첫');
	      num2=input_num('두');
	      op = input_op();

	      System.out.println();
	      
	      if(op=='+' || op=='-' || op=='*' || op=='/' ) {

	      // 연산
	      result = calc(op, num1, num2);
	     	      
	      // 출력
	      // %s : 문자열, 또는 다른 데이터를 삽입시킬 때 사용해도 됨
	      output(num1, op, num2, result);       
	      } else {
	    	  System.out.println("연산자 입력이 잘못되었습니다.");
	      }
	}
}
//아래를 위처럼 수정
/*
 * import java.util.Scanner;

   public class Practice4 {
   
   static double input_num(String str) {
      Scanner sc = new Scanner(System.in);
      System.out.print(str+ " 번째 수 : ");
      double num = sc.nextDouble();
      return num;
   }
   
   static char input_op() {
      Scanner sc = new Scanner(System.in);
      System.out.print("연산자 : ");
      return sc.next().charAt(0);
   }
   
   static double calc(char op,double num1,double num2) {
      double result = 0;
      switch(op) {
      case '+' :result = num1 + num2;break;
      case '-' :result = num1 - num2;break;
      case '*' :result = num1 * num2;break;
      case '/' :result = num1 / num2;break;
      }
      return result;
   }
   
   public static void main(String[] args) {

         // 선언
         double num1 = 0, num2 = 0, result = 0;
         char op = 0;

         // 입력
         num1 = input_num("첫");
         num2 = input_num("두");
    
         op = input_op();

         System.out.println();

         // 연산
         
         result = calc(op,num1,num2);
         
         // 출력
         if(op != 'E') {
            // %s : 문자열, 또는 다른 데이터를 삽입시킬 때 사용해도 됨
            System.out.printf("%s %s %s = %s", num1, op, num2, result);
         } else {
            System.out.println("연산자 입력이 잘못되었습니다.");
         }
      }
}
   
   */

