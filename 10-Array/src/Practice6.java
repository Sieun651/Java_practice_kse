import java.util.Scanner;

public class Practice6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 선언
		boolean[] park = new boolean[5];
		int num = 0;		// 메뉴번호
		int where = 0;		// 위치값
		
		while(true) {
			System.out.println("***************");
			System.out.println("1. 입차");
			System.out.println("2. 출차");
			System.out.println("3. 리스트");
			System.out.println("4. 종료");
			System.out.println("***************");
			System.out.print("메뉴 : ");
			num = sc.nextInt();
			System.out.println();
			
			switch(num) {
			case 1: System.out.print("위치 입력 : ");
					where = sc.nextInt();
					if(park[where-1]==false) {				//주차가능
						park[where-1] = true;
						System.out.println("주차되었습니다.");
					} else {System.out.println("이미 주차되어있습니다.");} break;
			
			case 2: System.out.print("위치 입력 : ");
					where = sc.nextInt();
					if(park[where-1]==true) {
						park[where-1] = false;
						System.out.println("출차되었습니다.");
					} else {System.out.println("주차되어 있지않습니다.");} break;
			
			case 3: for(int i=0; i<park.length; i++) {
					System.out.printf("%s위치 : %s\n", i+1, park[i]);   //배열은 0부터 시작하는게 좋음
			} break;
			
			case 4: System.out.println("프로그램 종료"); 
					System.exit(0);				// 강제종료명령어
			} 
			System.out.println();
			
			} 
	}
}
