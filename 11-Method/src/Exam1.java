
public class Exam1 {
	static void star(int n) {
		for(int i=1; i<=n; i++) {
			System.out.print("*");
		}
		System.out.println();  	// 1줄 넘김
	}
	public static void main(String[] args) {
		star(2);
		star(5);
	}
}
