package prac3;

public class Circle {
	protected int r;						 //반지름
	protected double size;				 //넓이
	protected final double pi=3.141592;	  		
	
	public Circle(int r) {
		this.r = r;
	}
	
	//상속하는 클래스에게 기능을 제시하는 역할
	public void compute() {		
	}
	
	public void output() {		
	}
}
