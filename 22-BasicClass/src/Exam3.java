
public class Exam3 {
	static int random(int min, int max) {
		return (int)(Math.random() * (max-min+1) + min);
	}
	public static void main(String[] args) {
		System.out.println(Math.random());	//0<= 실수 <1 사이의 실수 1개 생성하는 함수
		System.out.println(random(1,10));	//1~10 사이의 정수 1개 생성
	}
}
