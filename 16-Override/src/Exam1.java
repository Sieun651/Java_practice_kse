
public class Exam1 {
	public static void main(String[] args) {
		Score score = new Score("홍길동", 90, 80, 70);
		score.output_result();
		System.out.println("----------------------------------");
		
		Score2 score2 = new Score2("김철수", 91, 83, 71, 61, 51);
		score2.output_result();
	}
}
