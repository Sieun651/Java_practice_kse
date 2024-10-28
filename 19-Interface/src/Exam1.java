
public class Exam1 {
	public static void main(String[] args) {	
		// 자식 클래스 기준 사용법
		Character character = new Character("주인공");
		
		character.walk();
		character.run();
		character.attack();
		character.shield();
		character.pickup();
		
		System.out.println("----------------------");
		
		Monster monster = new Monster("악당");
		
		monster.walk();
		monster.run();
		monster.attack();
		monster.shield();
		
		System.out.println("----------------------");
		
		// 부모 클래스 기준 사용법
		// => 부모 클래스가 가지고 있는 함수만 사용시키고 싶을 때
		Fight fight = new Character("주인공");
		
		fight.attack();
		fight.shield();
	}
}
