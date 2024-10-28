class Outer2 {
	static int x = 20;		//static변수
	
	static class inner2 {	//static클래스
		int y = 30;
		void outpu () {
			System.out.println("x = " + Outer2.x);	//클래스명.변수명
			System.out.println("y = " + y);
		}
	}
}

public class Exam2 {
	public static void main(String[] args) {
		Outer2.inner2 inner2 = new Outer2.inner2();		//클래스명.클래스명
		inner2.outpu();
	}
}
