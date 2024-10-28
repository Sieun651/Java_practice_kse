
public class Exam1 {
	public static void main(String[] args) {
		int[] hong;
		hong = new int[3];
		hong[0] = 75;
		hong[1] = 82;
		hong[2] = 95;
		
		int[] kim = new int[3];
		kim[0] = 88;
		kim[1] = 64;
		kim[2] = 70;
		
		int[] lee = {100, 95, 90};
		
		// 총점 구하기
		int sum1=0, sum2=0, sum3=0;
		
		for(int i=0; i<hong.length; i++) {
			sum1 += hong[i];
		}
		for(int i=0; i<kim.length; i++) {
			sum2 += kim[i];
		}
		for(int i=0; i<lee.length; i++) {
			sum3 += lee[i];
		}
		// 출력(평균)
		System.out.println("홍길동 = " + sum1 / hong.length);
		System.out.println("김철수 = " + sum2 / kim.length);
		System.out.println("이영희 = " + sum3 / lee.length);
	}
}
