
class Living {
	void live() { System.out.println("살아있다.");}
	void breath() {System.out.println("Living : 산소로 호흡한다.");} // 자식클래스의 함수가 부모클래스에도 있어야함
}
class Animal extends Living {
	void breath() {System.out.println("Animal : 산소로 호흡한다.");}
	void move() {System.out.println("움직인다.");}
}
class Mammalia extends Animal {
	void bringingUp() {System.out.println("젖으로 새끼를 양육한다.");}
	void walk() {System.out.println("네발로 걷는다.");}
}

public class Exam1 {
	public static void main(String[] args) {
		Living r1 = new Living();
		Living r2 = new Animal();
		Living r3 = new Mammalia();
		r1.live();	//부모(함수발동)
		r2.live();	//부모(함수확인) -> 자식(Animal)(함수없음) -> 부모(함수발동)
		r3.live();	//부모(함수확인) -> 자식(Mammalia)(함수없음) -> 부모(함수발동)
		
		r2.breath(); 	// 자식클래스의 함수가 부모클래스에도 있어야함
		
		
		// Mammalia r4 = new Living();				//자식은 부모를 품을 수 없다.
		// Mammalia r4 = (Mammalia)new Living();	//형변환필요
	
	}
}
