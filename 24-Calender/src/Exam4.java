import java.util.Calendar;

public class Exam4 {
	public static void main(String[] args) {
		// 요일수: 오늘이 이번주의 몇번째 날인지를 나타내는 데이터
		// => 일(=1), 월(=2), ... , 토(=7)
		// 만년달력에 필요한 데이터 : 해달 월의 1일이 무슨 요일인지를 아는 것
		Calendar calendar = Calendar.getInstance();
		int dayNum = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일수 : " + dayNum);
		
		String[] day_name = {"일", "월", "화", "수", "목", "금", "토"};
		// 요일수는 1부터 시작되고, 배열은 0부터 인덱스가 시작되기 때문에, 1을 뺸다.
		System.out.println("오늘은 " + day_name[dayNum-1] + "요일 입니다.");
		
		// 2024.4.1로 날짜를 설정
		calendar.set(2024, 3, 1);
		DatePrinter.printDateTime(calendar);
		dayNum = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("1일은 " + day_name[dayNum-1] +"요일 입니다.");
	}
}
