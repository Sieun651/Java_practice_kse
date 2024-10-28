// workspace 다른풀이
package school;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SchoolController schoolController = new SchoolController();
		int num = 0;
		
		while(true) {
			System.out.println("*****************");
			System.out.println("  관리");
			System.out.println("*****************");
			System.out.println(" 1. 입력");
			System.out.println(" 2. 검색");
			System.out.println(" 3. 삭제");
			System.out.println(" 4. 종료");
			System.out.println("*****************");
			System.out.print(" 번호선택 : ");
			num = sc.nextInt();			
			System.out.println();
			
			switch(num) {		
				case 1: schoolController.input(); break;
				case 2: schoolController.search(); break;
				case 3: schoolController.delete(); break;
				case 4: System.out.println("프로그램 종료");
						System.exit(0);
			}
		}
	}
}
