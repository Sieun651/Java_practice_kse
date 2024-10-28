
public class Exam1 {
	public static void main(String[] args) {
		// 정수 저장
		// 변수의 선언 : 변수 만들기
		int num1;
		// 변수에 데이터 저장
		num1 = 100;
		// 저장된 데이터 확인
		System.out.println(num1);
		System.out.println("----------");
		
		byte n1 = 100;
		System.out.println(n1);
		short n2 = 100;
		System.out.println(n2);
		int n3 = 100;
		System.out.println(n3);
		long n4 = 100;
		System.out.println(n4);
		// 정수 상수를 사용할 때 주의할 점
		// 4byte(약 -20억 ~ 약 +20억) 크기는 그냥 사용하지만, 4byte가 넘을 때는 숫자 뒤에 L을 붙여주어야함
		// L의 의미 => 8byte(약 -800경~+800경) 데이터로 처리하라는 뜻
		// java 에서는 약 800경 이상의 데이터는 하나의변수에 저장 못한다.
		long n5 = 1234567890123456789L;
		System.out.println(n5);
		System.out.println("----------");

		// 실수 저장
		double num2 = 3.141592;
		System.out.println(num2);
		// java에서의 실수 기본 데이터 크기는 8byte로, float에 저장시 f 추가
		float num3 = 3.141592f;
		System.out.println(num3);
		
		// 문자 저장
		char ch1 = 'A';
		System.out.println(ch1);
		
		// boolean 저장
		boolean b = true;
		System.out.println(b);
	}
}
