
class Triangle3 {
	double base=5.0;
	double height=3.5;
	
	//입력
	void set(double b, double h ) {
		base = b;
		height = h;
	}
	
	double getArea() {					//삼각형의 넓이
		return base*height/2;
	}
	double getHypotenuse() {			//삼각형의 빗변구하기
		return Math.sqrt(base*base+height*height); //Math.sqrt => 루트함수
	}
	double getPerimeter() {				//삼각형의 둘레
		return base+height+getHypotenuse();
	}
	void output() {
		System.out.printf("삼각형의 넓이 : %.2f\n", getArea());
		System.out.printf("빗변길이 : %.2f\n", getHypotenuse());
		System.out.printf("둘레길이 : %.2f\n", getPerimeter());
	}
}

public class Practice3 {
	public static void main(String[] args) {	
		//선언
		Triangle3 ob = new Triangle3();
		//입력
		ob.set(10.5, 20.5);
		//연산
		//출력
		ob.output();
	}
}
