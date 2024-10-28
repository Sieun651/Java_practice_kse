
public class Exam6 {
	// c언어 : 함수명은 중복되면 안됨
	// => 호출된 함수를 찾을 때, 함수명만 가지고 함수를 찾아서 실행시킴
	int plus_int_int(int x, int y) {
		return x+y;
	}
	double plus_int_double(int x, double y) {
		return x+y;
	}
	double plus_double_int(double x, int y) {
		return x+y;
	}
	double plus_double_double(double x, double y) {
		return x+y;
	}
	// java : 매개변수의 자료형과 개수가 다를 경우에는 함수명을 똑같이 사용해도 됨
	// => 호출된 함수를 찾을 때, 함수명과 매개변수의 자료형을 가지고 함수를 찾아서 실행시킴
	// => "함수의 오버로딩" 이라고 함
	static int plus(int x, int y) {
		return x+y;
	}
	static double plus(int x, double y) {
		return x+y;
	}
	static double plus(double x, int y) {
		return x+y;
	}
	static double plus(double x, double y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		System.out.println(plus(5,7));		// plus(int, int)
		System.out.println(plus(5,7.7));	// plus(int, double)
		System.out.println(plus(5.5,7));	// plus(double, int)
		System.out.println(plus(5.5,7.7));	// plus(double, double)
	}
}
