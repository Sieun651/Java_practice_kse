
public class Test1 {
	// 결과 자료형 : 컴퓨터에게 리턴값의 자료형을 알려주는 것
				// 매개변수 : 다른 함수에서 전달된 데이터를 저장하는 변수
	static int plus(int x, int y) {   	// 연산기능의 함수(플러스)
		return x+y;		// return : 호출 된 곳으로 즉시 되돌아가라는 명령어
	}		// 결과값(리턴값)			만일, 결과값이 있으면 그 값을 가지고 되돌아감
	
	static void output(int a) { // 리턴값이 없을 때 void 사용
		System.out.println(a); //output함수의 a
		return;		// 함수의 마지막 줄에 있는 리턴값이 없는 return은 생략가능함
	}
	
	public static void main(String[] args) {
		// 선언
		int a=0; //메인함수 안의 a
		// 입력
		
		// 연산
		a = plus(5,7);		// 함수의 호출 : 함수의 사용법
							//			   소괄호안에 데이터가 있을 경우,
							//			   그 데이터를 가지고 함수로 이동함
		// 출력
		System.out.println(a);
		output(a); 
		
		//(return);  //메인함수의 리턴 생략(리턴값없기때문)(void main)
	}
}
