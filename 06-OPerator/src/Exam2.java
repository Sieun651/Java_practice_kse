
public class Exam2 {
	public static void main(String[] args) {
		/** 정수의 나눗셈 */
		// 연산 결과는 정수(몫)
		System.out.println(7 / 3);	
		
		/** 실수의 나눗셈 */
		System.out.println(7.0 / 3.0);
		
		/** 정수와 실수의 나눗셈 */
		// 실수로 계산됨(실수가 섞여있으면 실수로 계산됨)
		System.out.println(7.0 / 3);
		
		/** 0으로 나누기 */
		//System.out.println(7 / 0);	  // 정수 0으로 나누면 에러 발생
		System.out.println(7/0.0);		  // 실수 0.0으로 나누면 무한대(Infinity) 발생		
	}
}
