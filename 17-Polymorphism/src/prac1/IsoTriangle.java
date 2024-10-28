package prac1;

public class IsoTriangle extends DrawData {
	@Override
	public void draw() {
		for(int i=0; i<getHeight(); i++) {		// 층
			for(int j=0; j<=i; j++) {			// 별의 개수
				System.out.print(getOutchar());
			}
			System.out.println();
		}
	}
}
