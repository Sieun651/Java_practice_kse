
public class Practice7 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {				//층
			for(int j=4; j>=i; j--) {			//공백문자 출력
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i-1); j++) {			//별 출력
				System.out.print("*");				//1 3 5 7 9 를 만드는게 핵심	
			}
			
			System.out.println();				//1줄넘김
		}
	}
}
