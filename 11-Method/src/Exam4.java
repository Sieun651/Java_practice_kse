
public class Exam4 {
	static int sum(int from, int to) {
		int tot=0;
		for(int i=from; i<=to; i++) {
			tot += i;
		}
		return tot;
	}
	public static void main(String[] args) {
		System.out.println(sum(1, 10));
		System.out.println(sum(5, 10));
	}
}
