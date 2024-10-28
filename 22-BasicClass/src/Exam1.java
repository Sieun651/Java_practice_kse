
public class Exam1 {
	public static void main(String[] args) {
		// 1. 정수 데이터 저장
		int a = 5;
		System.out.println(a);
		
		Integer b = 7;				// 객체생성(new) 생략가능
		System.out.println(b);
		System.out.println(b.toString());
		
		Integer c = new Integer(9);
		System.out.println(c);
		
		Object object = b; //object 에 저장하기 위해서 클래스 사용
		System.out.println(object);
		
		Integer d = (Integer)object;	//자식클래스에 부모클래스 대입을 위한 형변환
		System.out.println(d);
		
		// 2. 숫자로 구성된 문자열 데이터를 정수로 변환
		String str_a = "127";
		int aa = Integer.parseInt(str_a);	// 정수로 구성된 문자열을 정수로 변경하는 함수
		System.out.println(str_a + 100);	// "127" + 100 -> "127100"
		System.out.println(aa + 100);		//  127 + 100 -> 227
	}
}
