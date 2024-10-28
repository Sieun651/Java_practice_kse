import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 선언
		int size=0, sum=0, max=0, min=0;
		int[] ar = null;
		// 입력
		System.out.print("배열 크기 : ");
		size = sc.nextInt();
		// (배열만들기)
		ar = new int[size];
		// 입력계속(for문 사용 가능)
		for(int i=0; i<ar.length; i++) {
			System.out.printf("ar[%s] : ", i);
			ar[i] = sc.nextInt();
		}
		
		for(int i=0; i<ar.length; i++) {
			sum += ar[i];
		}
		max = ar[0];
		for(int i=0; i<ar.length; i++) {
			if(max<ar[i]) max=ar[i];
		}
		min = ar[0];
		for(int i=0; i<ar.length; i++) {
			if(min>ar[i]) min=ar[i];
		}		
		
		System.out.println();
		for(int i=0; i<ar.length; i++) {
			System.out.printf("%s ", ar[i]);			
		}
		System.out.println();
		System.out.println("합 = " + sum);
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
		
				
	}
}