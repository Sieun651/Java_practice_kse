package prac1;

import java.util.Scanner;

public class Practice1 {	
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		Shape shape = null;				
		int num;
		
		while(true) {
			System.out.println("1.사각형 2.원 3. 종료");
			System.out.print("select(1-3) : ");
			num = scanner.nextInt();
			shape = null;
			System.out.println();
						
			switch(num) {		
				case 1: shape = new Rectangle();
						shape.onDraw();
						shape.onDelete(); 
						System.out.println(); break;
				case 2: shape = new Circle();
						shape.onDraw();
						shape.onDelete(); 
						System.out.println(); break;
				case 3: System.out.print("종료");
						System.exit(0);		
				default: System.out.println("번호 입력이 잘못되었습니다.\n");
			}
		}
	}
}
// workspace 다른풀이 