import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		// 임의의 정수 만들기
		Random random = new Random();
		
		// 0~9 사이의 정수1개 만들기
		int num = random.nextInt(10);
		System.out.println(num);
		
		//10~99사이의 정수 1개 만들기
		int num2 = random.nextInt(90) + 10; //0~89+10 => 10~99
		System.out.println(num2);
		
		// A~Z : 65~90
		//System.out.println((int)'A');   => 65
		//System.out.println((int)'Z');   => 90
		char ch = (char)(random.nextInt(26) + 65);     // 0~25 + 65 => 65~90
		System.out.println(ch);
	}
}
