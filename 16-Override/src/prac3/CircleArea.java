package prac3;

public class CircleArea extends Circle {
	
	public CircleArea(int r) {
		super(r);
	}
	
	public void compute() {
		size = r*r*pi;
	}
	
	public void output() {
		System.out.println("원의 넓이 : " + size);
	}
}
