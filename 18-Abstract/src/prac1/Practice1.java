package prac1;

public class Practice1 {
	public static void main(String[] args) {
		// 자식클래스 기준
		CircleArea circleArea = new CircleArea(10);
		CircleRound circleRound = new CircleRound(10);
		
		circleArea.compute();
		circleArea.output();
		circleRound.compute();
		circleRound.output();
		
		System.out.println("------------------");
		
		// 부모클래스 기준(다형성)
		Circle circle1 = new CircleArea(10);
		Circle circle2 = new CircleRound(10);
		
		circle1.compute();
		circle1.output();
		circle2.compute();
		circle2.output();
	}
}
