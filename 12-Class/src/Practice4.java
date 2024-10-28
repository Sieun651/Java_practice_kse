import java.util.Scanner;

class Sub4 {
	Scanner sc = new Scanner(System.in);
	int a, b;
	//입력
	void input() {		
	    System.out.print("정수 입력: ");
	    a = sc.nextInt();
	    System.out.print("정수 입력: ");
	    b = sc.nextInt(); 	    
	}
	//연산
	boolean doubleNum() {
		if (a % b == 0) return true;
	    else return false;
	}
	//출력
	void output() {
		if (doubleNum())
	       System.out.println(a + "(은)는 " + b + "의 배수입니다.");
	    else
	       System.out.println(a + "(은)는 " + b + "의 배수가 아닙니다.");
	}	
}
public class Practice4 {
	public static void main(String[] args) { 
		//선언
		Sub4 sub4 = new Sub4();
		//입력
		sub4.input();
	    //출력
		sub4.output();
	}
}
/* 아래에서 위로 변경
static boolean doubleNum(int a, int b) {
if (a % b == 0) return true;
else return false;
}
static int input() {
Scanner sc = new Scanner(System.in);
System.out.print("정수 입력: ");
int a = sc.nextInt();
return a;
}
static void output(int a, int b) {
if (doubleNum(a, b))
   System.out.println(a + "(은)는 " + b + "의 배수입니다.");
else
   System.out.println(a + "(은)는 " + b + "의 배수가 아닙니다.");
}
public static void main(String[] args) {      
// 선언
int a=0, b=0;
// 입력
a=input();
 b=input();
// 출력
 output(a, b);
}
*/