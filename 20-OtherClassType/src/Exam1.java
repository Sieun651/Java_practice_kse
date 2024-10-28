class Outer1 {
	int x = 10;		//멤버변수
	Inner1 inner1 = new Inner1();		//멤버클래스 선언 및 객체생성
	void ex() {		//멤버함수
		inner1.output();
	}
	class Inner1 {	//멤버클래스
		int y=20;
		void output() {
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
	}
}

public class Exam1 {
	public static void main(String[] args) {
		Outer1 outer1 = new Outer1();
		outer1.ex();
	}
}
