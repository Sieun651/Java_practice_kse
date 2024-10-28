package prac1;

public class Practice1 {
	public static void main(String[] args) {
		
		ScoreTable[] st = new ScoreTable[3];
		st[0] = new ScoreTable("민들레", 5);
		st[1] = new ScoreTable("진달래", 3);
		st[2] = new ScoreTable("개나리", 0);
		
		System.out.println("이름" + "\t" + "점수");
		System.out.println("------------");
		for(int i=0; i<st.length; i++) {
			st[i].printView();
		}
	}
}
