import java.util.Scanner;

class Gugudan {
	//선언
	int start, end;
	//입력
	void setGugudan(int s, int e) {
		start=s;
		end=e;	
	}
	//연산+출력
	void dispGugudan() {
		for (int i=start; i<=end; i++) {		//단
			for(int j=1; j<=9; j++) {			//1~9
				System.out.printf("%s*%s= %2s ", i, j, i*j);
				if(j==9) System.out.println();	//줄넘김
			}		
		}	
	}
}
public class Practice2 {
	public static void main(String[] args) {
		Gugudan g1 = new Gugudan();
		Scanner sc = new Scanner(System.in);
		int s, e;
		
		System.out.print("시작단 : ");
		s = sc.nextInt();	
		System.out.print("끝단 : ");
		e = sc.nextInt();
		
		g1.setGugudan(s,e);
		g1.dispGugudan();				
	}
}
