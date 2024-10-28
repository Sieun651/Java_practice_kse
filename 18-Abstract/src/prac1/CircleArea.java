package prac1;

public class CircleArea extends Circle {

	public CircleArea(int r) {
		super(r);
	}

	@Override
	public void compute() {
		setSize(getR()*getR()*getPI());
	}

	@Override
	public void output() {
		System.out.println("원의넓이 : " + getSize());
	}
	
}
