
public class Exam6 {
	// 예외 전가된 함수를 사용할 경우에는
	// 1. 예외 처리를 하거나
	public static void main(String[] args) {
		AAA aa = new AAA();
				
		try {
			aa.ex();
		} catch(Exception e) {
			System.out.println("에러가 발생했습니다.");
			System.out.println("원인 : " + e.getMessage());
			//e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
	// 2. 다시 예외 전가를 시킴 (권장되지 않음)
//	public static void main(String[] args) throws Exception {
//		AAA aa = new AAA();

//		aa.ex();
//		
//		System.out.println("프로그램 종료");
//	}
}
