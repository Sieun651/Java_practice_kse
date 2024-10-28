
public class Exam3 {
	public static void main(String[] args) {
		int num1 = 100;
		System.out.println(num1);
		
		num1 = num1 +100;
		System.out.println(num1);
		
		num1 += 100;				// num1 = num1 +100; 와 같은 것임
		System.out.println(num1);
		
		num1 -= 100;				// num1 = num1 - 100; 과 같음
		System.out.println(num1);
		
		num1 *= 2;					// num1 = num1 * 100; 과 같음
		System.out.println(num1);
		
		num1 /= 100;				// num1 = num1 / 100; 과 같음
		System.out.println(num1);
		
		num1 %= 5;					// num1 = num1 % 100; 과 같음
		System.out.println(num1);
	}
}
