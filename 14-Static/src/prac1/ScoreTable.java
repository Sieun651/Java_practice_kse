package prac1;
// 1세트의 데이터를 처리하는 클래스
public class ScoreTable {
	private String name;		//이름
	private int sol;			//맞은수
	private int score;			//점수 = 맞은수*배점
	private static int s=20;	//배점(20)
	
	public ScoreTable() {		
	}
	
	public ScoreTable(String name, int sol) {
		this.name = name;
		this.sol = sol;
		calcScore();	//(or)	// score변수 초기화를 위해 생성자에서의 호출
	}	

	public void calcScore() {
		score = sol * ScoreTable.s;		//스태틱변수는 같은 클래스 안에서 사용시 클래스명 생략가능
	}									// 하지만 쓰는 것을 권장함
	
	public void printView() {
		// calcScore();		//(or)
		System.out.println(name + "\t" + score);
	}
	
}
