package exam3;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;	//메뉴의 숫자 저장
		Controller controller = new Controller();
		
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 종료");
			System.out.println("-------");
			System.out.print("번호 입력 : ");
			num = scanner.nextInt();
			System.out.println();
			
			switch(num) {
			case 1: controller.input(); break;
			case 2: controller.output(); break;
			case 3: System.out.println("프로그램 종료");
			        System.exit(0);
			}
			System.out.println();
		}
	}
}
