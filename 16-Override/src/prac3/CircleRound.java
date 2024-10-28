package prac3;

public class CircleRound extends Circle {
	
	public CircleRound(int r) {
		super(r);
	}
	public void compute() {
		size = r*2*pi;
	}
	public void output() {
		System.out.println("원의 둘레 : " + size);
	}
}
