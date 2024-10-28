
public class Exam3 {
	public static void main(String[] args) {
		// for문 대신 사용하는 while문
		// 1~10 합 구하기
		
		int sum=0;
		int i=1;		//초기값
		
		while(i<=10) {
			sum += i;
			i++;		//증감식
		}
		System.out.println(sum);
	}
}
