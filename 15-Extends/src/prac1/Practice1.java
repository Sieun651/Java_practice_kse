package prac1;

public class Practice1 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		r.setArea(10.5, 20.5);
		t.setArea(5.0, 9.0);
		
		System.out.println("사각형의 넓이 : " + r.getArea());
		System.out.println("삼각형의 넓이 : " + t.getArea());
		
		System.out.println(r.toString());
	}
}
