import java.util.Scanner;

public class Practice9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, mon=0, tot=0;

		
		
		while(true) {
			System.out.println("1.입금 2.출금 3.잔고 4.종료");
			System.out.print("번호 선택: ");
			num = sc.nextInt();
			
			tot = tot +=(mon);		//문제가 있음
			
			if (num==4) {  		//while 문 탈출명령코드로, switch 위쪽에 넣는게 좋음
				System.out.print("\n프로그램을 종료합니다."); 
				break;
			}
			switch(num) {
			case 1: System.out.print("입금액 : ");
			mon = sc.nextInt(); break;
			case 2: System.out.print("출금액 : "); 
			mon = sc.nextInt(); break;
			case 3: System.out.printf("잔고액 : %s\n", tot); break;
			default: System.out.println("\n*번호는 1~4 사이로 입력해주세요*"); 
			} 
			System.out.println();
			
			}
		
		
	}
}
