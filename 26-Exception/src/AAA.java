
public class AAA {
	// 예외 전가 : 이 함수를 사용한 곳에서 예외처리를 하라고 예외를 전달시키는 것
	void ex() throws Exception {
		String year2 = "뭘까요?";
		int age2 = 2024 - Integer.parseInt(year2);
		System.out.println(age2 + "살 입니다.");
	}
}
