
public class Calc {
	// singleton 패턴 시작
	private static Calc instance;
	
	public static Calc getInstance() {
		if(instance == null) instance = new Calc();
		return instance;
	}
	// 생성자가 private이기 때문에 클래스 밖에서는 new로 객체 생성을 할 수 없다.
	private Calc() {}	
	// singleton 패턴 끝
	
	public void plus(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x+y);
	}
	public void minus(int x, int y) {
		System.out.printf("%d - %d = %d\n", x, y, x-y);
	}
}
