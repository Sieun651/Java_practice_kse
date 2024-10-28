import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int tot = 0, mon=0, day=0, ttt=0;
		
		System.out.println("*** 일수 구하기 ***");
		System.out.print("월 : ");
		mon = sc.nextInt();
		System.out.print("일 : ");
		day = sc.nextInt();
		
		for(int i=0; i<(mon-1); i++) {
			tot += months[i]; 
			
		}
		ttt = tot+day;
		System.out.printf("1월1일부터 %s월%s일까지는 %s일 입니다.", mon, day, ttt);
	}
}
