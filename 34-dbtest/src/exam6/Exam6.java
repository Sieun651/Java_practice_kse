package exam6;

import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dbtest dbtest = new DbtestImpl();
		int num = 0;
		
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 전체 출력");
			System.out.println("3. 이름 검색");
			System.out.println("4. 나이 수정");
			System.out.println("5. 삭제");
			System.out.println("6. 종료");
			System.out.println("----------------------");
			System.out.print("번호 : ");
			num = sc.nextInt();
			System.out.println();
			
			switch(num) {
			case 1: dbtest.input(); break;
			case 2: dbtest.printlAll(); break;
			case 3: dbtest.searchName(); break;
			case 4: dbtest.modifyAge(); break;
			case 5: dbtest.delete(); break;
			case 6: dbtest.endPgm(); break;
			}
			System.out.println();
		}
		
	}
}
