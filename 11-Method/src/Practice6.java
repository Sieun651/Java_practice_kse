import java.util.Scanner;

public class Practice6 {
	static int input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("1~100 사이의 배수를 구할 숫자 입력 : ");
	    return sc.nextInt();
	}
	static int print_baesu_cnt(int n1){
		int cnt=0;
		for (int i=1; i <= 100; i++) {
	         if(i % n1 == 0) {
	            System.out.print(i + " ");
	            cnt++;	            
	         }
		}
		return cnt;
	}
	static void print_cnt(int n1, int cnt){
		System.out.println();
	    System.out.printf("1~100 사이의 %d의 배수 개수 = %d", n1, cnt);
	}
	
	public static void main(String[] args) {
	    //선언
	    int n1 = 0, cnt = 0;
	    //입력
	    n1=input();
	    System.out.println();
	    //연산 + 출력
	    cnt = print_baesu_cnt(n1);	      
	    //출력
	    print_cnt(n1, cnt);	      
	   }
}

//아래를 위처럼 수정
/*
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int n1 = 0, cnt = 0;

System.out.print("1~100 사이의 배수를 구할 숫자 입력 : ");
n1 = sc.nextInt();
System.out.println();

for (int i=1; i <= 100; i++) {
   if(i % n1 == 0) {
      System.out.print(i + " ");
      cnt++;            
   }         
}

System.out.println();
System.out.printf("1~100 사이의 %d의 배수 개수 = %d", n1, cnt);
}
*/