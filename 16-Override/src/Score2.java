
public class Score2 extends Score {
	int mus, com;	// 음악, 컴퓨터 과목 추가
	
	public Score2(String name, int kor, int eng, int mat, int mus, int com) {
		super(name, kor, eng, mat);
		this.mus = mus;
		this.com = com;
	}
	
	@Override
	public int calc_tot() {
		tot = super.calc_tot() + mus + com;
		return tot;
	}
	
	@Override
	public double calc_avg() {
		avg = (double)tot / 5;
		return avg;
	}
	
	@Override
	public void output_result() {
		System.out.printf("이름 : %s, 총점 : %s, 평균 : %s\n", name, calc_tot(), calc_avg());
	}
}
