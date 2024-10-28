package prac1;

public class DrawData {
	private int height;
	private char outchar;
	
	// 1. 상속받는 클래스에게 기능을 제시하는 것
	// 2. 사용하려고 하는 자식클래스의 함수가 부모클래스에 있어야 함
	public void draw() {		
	}
	
	// getter setter
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public char getOutchar() {
		return outchar;
	}
	public void setOutchar(char outchar) {
		this.outchar = outchar;
	}	
}
