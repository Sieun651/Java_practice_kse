
public class Exam6 {
	public static void main(String[] args) {
		 // 1~10 사이의 홀수의 합 구하기
		 int sum = 0;
		 
		 // continue
		 // => for : 증감식으로 이동
		 // => while : 조건식으로 이동
		 for(int i=1; i<=10; i++) {
			 if(i%2 == 0) continue;  //if의 조건식이 참이면 continue가 작동하여 증감식으로 이동
			 sum += i;
		 }
		 System.out.println("sum = " + sum);
	}
}
