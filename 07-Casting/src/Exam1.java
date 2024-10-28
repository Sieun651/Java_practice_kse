
public class Exam1 {
	public static void main(String[] args) {
		short s = 100;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("----------------");
		
		char ch = 'a';
		int num = ch;
		System.out.println("ch = " + ch);
		System.out.println("num = " + num);
		
		System.out.println((int)'가');
		
		/*
		 * * 자동 형변환(= 자료형 변환)
  			=> 데이터의 형태가 다를 경우, 자동적으로 자료형을 통일시키는 것
  			=> 작은 형태의 데이터가 큰 형태의 데이터로 자동적으로 바뀌는 것

		   * 강제 형변환(= 자료형 변환)
  			=> 강제로 데이터의 형태를 바꾸는 것
  			=> 데이터의 손상이 발생할 수 있음
  			=> (자료형) : 형변환 연산자 또는 cast 연산자
       		2 + (int)3.0 => 2+3 => 5 (소수점 아래는 버림)
		 */
		
	}
}
