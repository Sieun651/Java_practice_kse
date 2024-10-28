
public class Exam2 {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {          // 단 : 2~9
			for(int j=1; j<=9; j++) {	   // 1~9
				System.out.printf("%d*%d=%2d ", i, j, i*j);
			}
			System.out.println();
		}
	}
}
