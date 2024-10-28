
public class Exam3 {
	public static void main(String[] args) {
		String year1 = "2000";
		int age1 = 2024 - Integer.parseInt(year1);
		System.out.println(age1 + "살 입니다.");
		System.out.println("----------------");
		
		try {
			String year2 = "뭘까요?";
			int age2 = 2024 - Integer.parseInt(year2);
			System.out.println(age2 + "살 입니다.");
		} catch(NumberFormatException e) {
			System.out.println("문자열을 정수로 변경할 수 없습니다.");
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
		System.out.println("----------------");
		
		System.out.println("프로그램 종료");
	}
}
