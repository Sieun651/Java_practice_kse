class AAA {
	int x;
	void ex() {
		
	}
	@Override
	public String toString() {
		return "AAA [x=" + x + "]";		//Object 클래스의 toString() 메소드는 기본적으로 오버라이드를 많이 한다.
	}
	
}
public class Test {
	public static void main(String[] args) {
		AAA aa = new AAA();
		System.out.println(aa);
		System.out.println(aa.toString());
	}
}
