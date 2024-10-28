import java.util.Scanner;

class Triangle {
	Scanner sc = new Scanner(System.in);
	int base, height;					//전역변수
	void setTriangle(int b, int h) {	//지역변수
		base=b;
		height=h;
	}
	void setTriangle(){
		System.out.print("밑변 : ");
		base = sc.nextInt();
		System.out.print("높이 : ");
		height = sc.nextInt();
	}
	int getArea() {
		return base*height/2;
	}
	void output(){
		System.out.println("삼각형의 넓이 : " + getArea());
	}
}

public class Practice1 {
	public static void main(String[] args) {
		System.out.println("*** 삼각형 넓이 구하기 ***");
		Triangle t = new Triangle();
		t.setTriangle();
		t.output();
	}
}
