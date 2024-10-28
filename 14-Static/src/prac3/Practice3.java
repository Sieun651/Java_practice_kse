package prac3;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Customer customer = new Customer();
		int num;
				
		while(true) {
			System.out.println("------------");
			System.out.println("1. 입력");		
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 이름검색");
			System.out.println("5. 종료");
			System.out.println("------------");
			System.out.print("번호 : ");
			num = scanner.nextInt();
		
			if(num>=1 && num<=5) {
				switch(num) {
				case 1: customer.input(); break;
				case 2: customer.output(); break;
				case 3: customer.fix(); break;
				case 4: customer.search(); break;
				case 5: System.out.println("프로그램 종료");
						System.exit(0);
				}			
			} else System.out.println("번호입력이 잘못되었습니다.");
		}
	}
}
