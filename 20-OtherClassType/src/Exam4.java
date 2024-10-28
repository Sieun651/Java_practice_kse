interface Inner4_1 {
	public void test4();
}

class Inner4_2 {
	public void output() {
		System.out.println("test");
	}
}
public class Exam4 {
	public static void main(String[] args) {
		Inner4_1 inner4_1 = new Inner4_1() {
			public void test4() {
				System.out.println("test");
			}
		};
		inner4_1.test4();
		System.out.println("-------------------");
		
		Inner4_2 inner4_2 = new Inner4_2() {
			public void output() {
				System.out.println("테스트 입니다.");
			}
		};
		inner4_2.output();
	}
}
