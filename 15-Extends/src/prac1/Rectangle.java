package prac1;

public class Rectangle extends Area {
	public double getArea() {			
		return getBase()*getHeight();	// 상속받더라도 private 변수를 직접 사용할 수는 없음
	}									// getter setter 사용
	
	
}
