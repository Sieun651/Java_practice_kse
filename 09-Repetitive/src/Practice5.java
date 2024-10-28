
public class Practice5 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {			//층
			for(int j=1; j<=i; j++) {		//별의 개수
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
