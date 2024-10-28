
public class Exam1 {
	public static void main(String[] args) {
		// 1. 자식 클래스 기준 사용 (기본 사용법)
		Army army = new Army("육군");
		Navy navy = new Navy("해군");
		AirForce airForce = new AirForce("해군");
		
		army.move();
		army.attack();
		
		navy.move();
		navy.attack();
		
		airForce.move();
		airForce.attack();
		System.out.println("------------------------");
		
		// 2. 부모 클래스 기준 사용 (다형성)
		Unit[] units = new Unit[3];
		units[0] = new Army("육군");
		units[1] = new Navy("해군");
		units[2] = new AirForce("공군");
		
		for(int i=0; i<units.length; i++) {
			units[i].move();
			units[i].attack();
		}		
	}
}
