package prac1;

public class Practice1 {
	public static void main(String[] args) {
		Circle circleArea = new Circle() {
			@Override
			public void compute() {
				setSize(getR()*getR()*getPI());
			}
			@Override
			public void output() {
				System.out.println("원의 넓이 : " + getSize());
			}
		};
		circleArea.setR(10);
		circleArea.compute();
		circleArea.output();
		System.out.println("-------------------");
		
		Circle circleRound = new Circle() {
			@Override
			public void compute() {
				setSize(getR()*2*getPI());
			}
			@Override
			public void output() {
				System.out.println("원의 둘레 : " + getSize());
			}
		};
		circleRound.setR(10);
		circleRound.compute();
		circleRound.output();
	}
}
