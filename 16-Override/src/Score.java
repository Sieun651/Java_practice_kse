
public class Score {
	String name;
	int kor, eng, mat;
	int tot;
	double avg;
	
	public Score(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public int calc_tot() {
		tot = kor + eng + mat;
		return tot;
	}
		
	public double calc_avg() {
		avg = (double)tot / 3;
		return avg;
	}
	
	public void output_result() {
		System.out.printf("이름 : %s, 총점 : %s, 평균 : %s\n", name, calc_tot(), calc_avg());
	}
}
