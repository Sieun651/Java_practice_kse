import java.util.Scanner;

class Score {
	Scanner scanner = new Scanner(System.in);
	int num;
	String name;
	int kor, eng, mat, tot, avg;
	
	void set() {		// void set(Score this) <<원래 이렇게 생김
		System.out.println(this);
		System.out.print("학번 : ");
		this.num = scanner.nextInt();
		System.out.print("이름 : ");
		this.name = scanner.next();
		System.out.print("국어 : ");
		this.kor = scanner.nextInt();
		System.out.print("영어 : ");
		this.eng = scanner.nextInt();
		System.out.print("수학 : ");
		this.mat = scanner.nextInt();
		this.tot = this.kor + this.eng + this.mat;
		this.avg = this.tot / 3;
	}
	void print() {		// void print(Score this)
		System.out.println(this);
		System.out.println("학번\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\t %s\n",
				this.num, this.name, this.kor, this.eng, this.mat, this.tot, this.avg);
	}
}
public class Exam6 {
	public static void main(String[] args) {
		Score score1 = new Score();
		Score score2 = new Score();
		
		System.out.println("score1 : " + score1);
		System.out.println("score2 : " + score2);
		
		score1.set();		//score1.set(score1)
		score2.set();		//score2.set(score2)
		score1.print();		//score1.print(score1)
		score2.print();		//score2.print(score2)
	}
}
