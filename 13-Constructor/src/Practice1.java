
class Triangle {
	double base, height;
	
	Triangle() {		
	}
	Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	void setTriangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	double getArea() {
		return (double)base*height/2;
	}
}

public class Practice1 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.setTriangle(5,12);
		System.out.println("삼각형의 넓이 : " + t1.getArea());
		
		Triangle t2 = new Triangle(45, 7);
		System.out.println("삼각형의 넓이 : " + t2.getArea());
	}
}
