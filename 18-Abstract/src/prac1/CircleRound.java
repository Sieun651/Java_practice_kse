package prac1;

public class CircleRound extends Circle {

	public CircleRound(int r) {
		super(r);
	}

	@Override
	public void compute() {
		setSize(getR()*2*getPI());
	}

	@Override
	public void output() {
		System.out.println("원의둘레 : " + getSize());
	}
	
}
