// 논리연산자
// -> 수학의 교집합, 합집합, 여집합을 명령어로 만든 것
// -> 왼쪽 오른쪽 데이터가 boolean 데이터를 사용함
/**  [진리표]
 				    (and)	(or)	(not)
     x      y		x&&y	x||y	!x
     true	true	true	true	false
     true	false	false	true	false
     false	true	false	true	true
     false	false	false	false	true
 */
public class Exam7 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 7;
		
		System.out.println(num1 > num2 && num1 < num2); // false&&true -> false
		System.out.println(num1 > num2 || num1 < num2); // false||true -> true
		System.out.println(num1 > num2); 				// 			      false
		System.out.println(!(num1 > num2)); 			// 				  true
	}
}
