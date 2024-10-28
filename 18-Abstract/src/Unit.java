// 추상 메소드를 가진 클래스는 반드시 abstract를 클래스명 앞에 추가해서 사용해야 한다.
// 추상 클래스
// => new로 객체를 생성할 수 없는 클래스
// => 상속되어야만 사용할 수 있는 클래스
// => 추상 클래스를 상속받은 클래스는 반드시 추상메소드를 구현해야 한다.
public abstract class Unit {
	private String name;
	
	public Unit(String name) {
		this.name = name;
	}
	
	// 함수의 선언 : 중괄호가 없는 형태의 함수
	// 추상 메소드 
	public abstract void attack();
	public abstract void move();

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}
