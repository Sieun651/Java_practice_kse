import java.util.Random;
import java.util.Scanner;

class PlusGame5 {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	int num1, num2, answer, cnt, score;
	int i = 1;
	char g_s;

	public void r_number() {
		num1 = random.nextInt(90) + 10; // 랜덤번호생성
		num2 = random.nextInt(90) + 10;
	}
	public void end_g() {
		System.out.println("\n프로그램을 종료합니다."); 
		 System.exit(0);
	}
	public void coin() {
		System.out.print("continue(y/n) : ");
		g_s = scanner.next().charAt(0);
		
		switch(g_s) {
		case 'y': cnt=0; i=1; score=0; System.out.println(); break;
		case 'n': end_g();
		}			
	}
	public void result() {
		System.out.println(); 
		System.out.printf("당신은 총 %s문제를 맞추어서 %s점 입니다.", cnt, score);
	}

	public void start_g() {
		while (true) {
			r_number();
			System.out.printf("[%s] %s + %s = ", i, num1, num2);
			answer = scanner.nextInt();
			if (answer == num1 + num2) {
				System.out.println("딩동뎅");
				cnt++; i++; score += 20;
				System.out.println();
			} else {
				System.out.println("틀렷따...");			
				System.out.printf("[%s] %s + %s = ", i, num1, num2);
				answer = scanner.nextInt();
				if (answer == num1 + num2) {
				System.out.println("딩동뎅");
				cnt++; i++; score += 20;
				System.out.println();
				} else {
					System.out.printf("틀렷따...    (정답 : %s)\n", num1+num2);	
					i++;
				} 
			} 
			if(i>5) {
				result();
				coin();			
			}
		}
	}	
}

public class Practice5 {
	public static void main(String[] args) {
		PlusGame5 plusGame5 = new PlusGame5();
		
		plusGame5.start_g();
	}
}
// workspace 확인