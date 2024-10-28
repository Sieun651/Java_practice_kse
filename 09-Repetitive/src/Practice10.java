import java.util.Random;
import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int i=1;   //문제번호
		int a=0, b=0; //임의의 숫자 저장
		int res=0;  // 문제의 정답
		int cor=0;	//정답수
		int score=0; // 점수
		char gostop=0; //계속 여부 문자 저장
		
		while(true) {
			System.out.printf("[%s] ", i);
			a=random.nextInt(90)+10;
			System.out.print(a+" ");
			System.out.print("+ ");
			b=random.nextInt(90)+10;
			System.out.print(b+" ");
			System.out.print("= ");
			res = sc.nextInt();
			
			if(res == (a+b)) {
				System.out.print("딩동뎅");
				i++;
				cor++;
				score += 20;
				System.out.println();System.out.println();
			} else {
				System.out.println("틀렷따...");
				System.out.println();
				System.out.printf("[%s] %s + %s = ", i, a, b);
				res = sc.nextInt();
				if(res == (a+b)) {
					System.out.print("딩동뎅\n\n");
					i++;
					cor++;
					score += 20;
				} else {	
					System.out.printf("틀렷따...     (정답 : %s)\n", a+b);
					i++;
					System.out.println();
				}					
			}
			if(i>5) {
			System.out.printf("당신은 총 %s문제를 맞추어서 %s점 입니다.", cor, score);
			System.out.print("\ncontinue(y/n) : ");
			gostop = sc.next().charAt(0);
			if(gostop == 'y') {
			i=1; cor=0; score=0;}
			if(gostop == 'n') {
				System.out.print("\n프로그램을 종료합니다."); break;
			} 
			System.out.println();
		  }		
	   }
	}
}
// System.exit(0);