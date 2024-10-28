package prac1;

public class Pyramid extends DrawData {
	@Override
	public void draw() {
		for(int i=0; i<getHeight(); i++) {					//층
			for(int j=0; j<getHeight()-i; j++) {	//공백문자 출력(10,9,8,7,6,...)
				System.out.print(" ");
			}
			for(int j=0; j<i*2-1; j++) {				//문자출력(0,1,3,5,7,...)
				System.out.print(getOutchar());
			}
			System.out.println();
		}
	}
}
