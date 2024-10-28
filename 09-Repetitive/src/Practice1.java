import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1=0, cnt=0;
		
		System.out.print("1~100 사이의 배수를 구할 숫자 입력 : ");
		n1 = sc.nextInt();
		
		for(int i=1; i<=100; i++) {
			if(i%n1 == 0) {
				System.out.print(i + " ");
				cnt++;
			}
		}
		System.out.println();
		System.out.printf("1~100 사이의 %d의 배수 개수 = %d", n1, cnt);
}
}
