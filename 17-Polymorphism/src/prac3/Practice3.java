package prac3;

public class Practice3 {
	public static void main(String[] args) {		
		// 부모클래스 기준 사용법으로 작성
		Circle cir;
	      
	    cir = new CircleArea(10);
	    cir.compute();
	    cir.output();
	      
	      
	    cir = new CircleRound(10);
	    cir.compute();
	    cir.output();
	}
}
