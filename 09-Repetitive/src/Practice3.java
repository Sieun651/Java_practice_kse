import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 선언
		int dan = 0;
		String str = " ";  //계속여부저장, "y" 또는 다른 문자열
	
		while(true) {
			//입력
			System.out.print("몇 단을 출력할지 입력하세요 : ");
			dan = sc.nextInt();
			
			System.out.println();
			
			for(int i=1; i<=9; i++) {
				System.out.printf("%s * %s = %s\n", dan, i, dan*i);
			}
			//입력
			System.out.println();
			System.out.print("계속할지 선택하세요 (y:계속): ");
			str = sc.next();
			
			if(!str.equals("y")) {
				System.out.println("종료");
				break;
			}
		}		
		
	}
			
	}

/*		Scanner sc = new Scanner(System.in);
		int num = 0;
		int i = 1;
		char y = 0;
	
		System.out.print("몇 단을 출력할지 입력하세요 : ");
		num = sc.nextInt();
		
		while(true) {
			
			System.out.printf("%s * %s = %s\n", num, i, num*i);
			i++;
			if(i>9) break;
			
		}
		System.out.print("계속할지 선택하세요 (y:계속): ");
	}
}
*/