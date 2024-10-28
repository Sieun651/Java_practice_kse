// 복습
public class Practice4 {
	public static void main(String[] args) throws Exception {
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
			// 데이터 확인(테스트용)
			System.out.println(i + ", " + sum);
			System.in.read(); // 화면을 멈추는 용도로 사용
			System.in.read(); // 화면을 멈추는 용도로 사용
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	}
}
