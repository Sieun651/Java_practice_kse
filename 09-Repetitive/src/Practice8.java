import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String str = " ";
		
		while(true) {
			System.out.println("***************");
			System.out.println("1. 입력");
			System.out.println("2. 검색");
			System.out.println("3. 삭제");
			System.out.println("4. 종료");
			System.out.println("***************");
			System.out.print("번호 선택 : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1: str="입력"; break;
			case 2: str="검색"; break;
			case 3: str="삭제"; break;
			case 4: str="종료"; break;
			}
						System.out.println();
			if(num<=3) {
			System.out.printf("%s를 선택하였습니다.\n", str);
			}
			if(num==4) {
				System.out.printf("프로그램을 %s합니다.", str);
				break;
			}
			System.out.println();
		}
	}
}
// System.exit(0);    프로그램을 종료시키라는 명령어 // 대신 return; 을 사용해도 됨
// 여러가지 방법의 풀이(workspace 참고 

