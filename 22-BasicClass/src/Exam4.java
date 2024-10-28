import java.util.Random;

public class Exam4 {
	public static void main(String[] args) {
		Random random = new Random();
		String authNum = "";
		// 5자리 인증번호 만들기
		for(int i=0; i<5; i++) {
			authNum += random.nextInt(10);	// 0~9 사이의 정수 1개 생성
		}
		
		System.out.println("인증번호 = " + authNum);	
	}
}
