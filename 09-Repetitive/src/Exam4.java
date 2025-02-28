
public class Exam4 {
	public static void main(String[] args) {
		// for문 대신 사용하는 while문
		// 1~10 합 구하기
		
		int sum=0;
		int i=1;		//초기값
		
		// 조건식 자리에 true를 사용할 경우에는 반드시 탈출코드가 있어야 함
		// 조건식 자리에 true를 사용하면, 조건식을 유연하게 위치시켜서 사용할 수 있음
		while(true) {
			if(i>10) break; // 탈출코드
			sum += i;
			i++;		//증감식
		}
		System.out.println(sum);
	}
}

