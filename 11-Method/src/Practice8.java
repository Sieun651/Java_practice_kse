import java.util.Scanner;

public class Practice8 {
	static int input_menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.입금 2.출금 3.잔고 4.종료");
        System.out.print("번호 선택 : ");
        return sc.nextInt();
	}
	static int in_money(int balance) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입금액 : ");
		int money = sc.nextInt();
		balance += money;
		return balance;
	}
	static int out_money(int balance) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출금액 : ");
        int money = sc.nextInt();  
        balance -= money;
		return balance;
	}
	static void print_balance(int balance) {
		System.out.printf("잔고 : %s\n", balance);
	}
	static void end_pgm() {
		System.out.println("프로그램을 종료합니다.");
        System.exit(0);
	}
	public static void main(String[] args) {	      

	      // 선언
	      int num = 0; // 번호 입력
	      int money = 0; // 금액
	      int balance = 0; // 잔고

	      while (true) {
	         // input_menu
	         num=input_menu();	         
	         
	         if (num==1) {  // in_money	            
	            balance=in_money(balance);	            
	         } else if(num==2) { // out_money
	            balance=out_money(balance);
	            balance -= money;
	         } else if(num==3) { // print_balance
	            print_balance(balance);
	         } else if (num==4) { // end_pgm
	            end_pgm();
	         } else {
	            System.out.println("번호는 1~4 사이로 입력해 주세요.");
	         }
	         
	         System.out.println();
	      }
	   }
}

//아래를 위처럼 수정
/*
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// 선언
int num = 0; // 번호 입력
int money = 0; // 금액
int balance = 0; // 잔고

while (true) {
   // input_menu
   System.out.println("1.입금 2.출금 3.잔고 4.종료");
   System.out.print("번호 선택 : ");
   num = sc.nextInt();
   
   if (num==1) {  // in_money
      System.out.print("입금액 : ");
       money = sc.nextInt();
       balance += money;
   } else if(num==2) { // out_money
      System.out.print("출금액 : ");
      money = sc.nextInt();
      balance -= money;
   } else if(num==3) { // print_balance
      System.out.printf("잔고 : %s\n", balance);
   } else if (num==4) { // end_pgm
         System.out.println("프로그램을 종료합니다.");
         break;  // while 종료
     } else {
        System.out.println("번호는 1~4 사이로 입력해 주세요.");
     }
   
   System.out.println();
}
}
*/