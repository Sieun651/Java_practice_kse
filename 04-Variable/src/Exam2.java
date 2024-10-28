
public class Exam2 {
	public static void main(String[] args) {
		int width = 100;
		System.out.println("width = " + width);
		// final : 변수값 변경 금지 명령어
		final double pi = 3.14;
		System.out.println("pi = " + pi);
		System.out.println("-----------");
		
		// 데이터 변경하기
		width = 200;
		//pi = 6.28; (값 변경 못함)
		System.out.println("width = " + width);
		System.out.println("pi = " + pi);
	}
}
