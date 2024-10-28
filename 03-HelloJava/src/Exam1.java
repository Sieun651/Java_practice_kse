// 1줄 주석
/* 여러줄 주석 */
/** 여러줄 주석 */

/* 프로그램 소스의 최소 단위 = class
 * 프로그램 시작 클래스 (메인 클래스) => public class 클래스이름
 * "메인(public)" 클래스 이름은 반드시 파일명과 일치해야 한다.
 * 클래스 이름은 영어/숫자/언더바(_)만 사용해야 한다.
 * 클래스 이름의 첫글자는 반드시 알파벳으로 시작해야 한다.  
 * 클래스 이름의 첫글자는 대문자로 시작한다(가독성을 위한 강력한 권장사항).
 */
public class Exam1 {
	/** 메인 함수
	 *   -> 프로그램의 시작점
	 *   -> 자바는 메인함수에 있는 명령어들만 실행시킴
	 */
	public static void main(String[] args) {
		// ;(세미콜론)까지가 명령어 1개
		System.out.println("Hello World");
		
		// 출력 명령어(데이터를 콘솔창에 출력하는 명령어)
		/** println(데이터) : 데이터를 출력하고 1줄 넘김을 함 */
		System.out.println(5);	 			// 정수
		System.out.println(7.7);			// 실수
		System.out.println('A');			// 문자
		System.out.println("abc");			// 문자열
		System.out.println(true);			// boolean 값
		System.out.println("---------");	//보기좋으라고밑줄출력
		
		/** print(데이터) : 데이터를 출력하고 1줄 넘김 없음 */
		//  => 공백문자와 같이 출력하던지, 줄넘김 문자와 같이 출력하는 경우가 많음
		System.out.print(5);	 			// 정수
		System.out.print(7.7);				// 실수
		System.out.print('A');				// 문자
		System.out.print("abc");			// 문자열
		System.out.print(true);				// boolean 값
		System.out.println("---------");	// 보기좋으라고밑줄출력
		
		// 데이터 + 문자열 : 결합된 문자열이 만들어짐
		// 5 + " " => "5 "
		System.out.print(5+" ");	 		// 정수
		System.out.print(7.7+" ");			// 실수
		System.out.print('A'+" ");			// 문자
		System.out.print("abc"+" ");		// 문자열
		System.out.print(true+" ");			// boolean 값
		System.out.println("---------");	// 보기좋으라고밑줄출력
		
		// 줄넘김 문자 : \n (프로그램에서 사용하는 특수문자)
		// 데이터 + 문자열 : 결합된 문자열이 만들어짐
		// 5 + "\n" => "5\n"
		System.out.print(5+"\n");	 		// 정수
		System.out.print(7.7+"\n");			// 실수
		System.out.print('A'+"\n");			// 문자
		System.out.print("abc"+"\n");		// 문자열
		System.out.print(true+"\n");		// boolean 값
		System.out.println("---------");	// 보기좋으라고밑줄출력
		
		/** printf("서식문자", 데이터) */
		// 문자열 안에 데이터를 삽입해서 출력하고자 할 때 사용
		// %d : 정수 1개 삽입
		// %f : 실수 1개 삽입
		// %c : 문자 1개 삽입
		// %s : 문자열 1개 삽입
		// %b : boolean값 1개 삽입
		System.out.printf("정수 : %d\n", 5);			// "정수 : 5\n"
		System.out.printf("실수 : %f\n", 7.7);		// "실수 : 7.7\n"
		// 실수는 기본 소수점 6자리까지 출력됨
		System.out.printf("문자 : %c\n", 'A');		// "문자 : A\n"
		System.out.printf("문자열 : %s\n", "abc");	// "문자열 : abc\n"
		System.out.printf("boolean : %b\n", true);	// "boolean : true\n
		System.out.println("---------");			// 보기 좋으라고 밑줄 출력
		
		// 출력 자리수 지정
		// %5d : 5자리 확보 후 정수 1개 삽입
		// %5.2f : 5자리 확보 후 실수 1개 삽입, 소수점은 2째 자리까지 표시
		// %5c : 5자리 확보 후 문자 1개 삽입
		// %5s : 5자리 확보 후 문자열 1개 삽입
		// %5b : 5자리 확보 후 boolean값 1개 삽입
		System.out.printf("정수 : %5d:\n", 5);			// "정수 : 5\n"
		System.out.printf("실수 : %5.2f:\n", 7.7);		// "실수 : 7.7\n"
		System.out.printf("문자 : %5c:\n", 'A');			// "문자 : A\n"
		System.out.printf("문자열 : %5s:\n", "abc");		// "문자열 : abc\n"
		System.out.printf("boolean : %5b:\n", true);	// "boolean : true\n
		System.out.println("---------");				// 보기 좋으라고 밑줄 출력
		
		System.out.printf("정수 : %10d:\n", 5);			// "정수 : 5\n"
		System.out.printf("실수 : %10.2f:\n", 7.7);		// "실수 : 7.7\n"
		System.out.printf("문자 : %10c:\n", 'A');		// "문자 : A\n"
		System.out.printf("문자열 : %10s:\n", "abc");		// "문자열 : abc\n"
		System.out.printf("boolean : %10b:\n", true);	// "boolean : true\n
		System.out.println("---------");				// 보기 좋으라고 밑줄 출력
	}	
}
