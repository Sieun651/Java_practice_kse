// 노트참고
package customer2;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Customer customer = new CustomerImpl();
		int num=0;
		
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 고객번호검색");
			System.out.println("4. 이름검색");
			System.out.println("5. 전화번호검색");
			System.out.println("6. 이름 내림차순 정력");
			System.out.println("7. 고객번호 오름차순 정렬");
			System.out.println("8. 파일저장");//
			System.out.println("9. 파일읽기");//
			System.out.println("10. 종료");//
			System.out.println("-----------------------");
			System.out.print("번호 : ");
			num = scanner.nextInt();
			System.out.println();
			
			switch(num) {
			case 1: customer.input(); break;
			case 2: customer.output(); break;
			case 3: customer.searchCus_Num(); break;
			case 4: customer.searchName(); break;
			case 5: customer.searchPhone(); break;
			case 6: customer.descSortName(); break;
			case 7: customer.ascSortCus_Num(); break;
			case 8: customer.file_save(); break;//
			case 9: customer.file_read(); break;//
			case 10: System.out.println("종료합니다.");//
					System.exit(0);		
			default: System.out.println("번호 입력이 잘못되었습니다.\n"); break;
			}
			System.out.println();
		}
		
	}
}
