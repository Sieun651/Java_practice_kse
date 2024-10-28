
public class Practice5 {
	public static void main(String[] args) {
		/* 기본적인 프로그램의 구조(각 단계는 결합되어 진행될 수도 있음)
		// 선언 : 변수 만들기
		
		// 입력 : 변수에 데이터 저장하기
		
		// 연산 : 변수에 저장된 데이터 가공하기
		
		// 출력 : 변수에 저장된 데이터 또는 결과값 확인 */
		//------------------------------------------
		// 선언과 입력의 결합
		String name = "이효리";
		String department = "개발부";
		String position = "대리";
		int sal = 1500000;
		
		// 해당 practice는 연산과정은 없음
		
		// 출력
		System.out.println("이름 : "+ name);
		System.out.printf("부서 : %s\n", department);
		System.out.print("직위 : " + position + "\n급여 : " + sal + "원");	
	}
}