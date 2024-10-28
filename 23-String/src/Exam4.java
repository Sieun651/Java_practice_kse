
public class Exam4 {
	public static void main(String[] args) {
		int a = 5;
		double b = 3.14;
		char c = 'A';
		boolean d = true;		
		
		String str_a = String.valueOf(a);
		String str_b = String.valueOf(b);
		String str_c = String.valueOf(c);
		String str_d = String.valueOf(d);
		
		System.out.println(str_a); // 결과값이 문자열인지 정수인지는 알 수 없음
		System.out.println(str_b);
		System.out.println(str_c);
		System.out.println(str_d);
		
		System.out.println("---------------------------");
		System.out.println(String.valueOf(a) instanceof String); //값이 String이면 true 출력		
	}
}
