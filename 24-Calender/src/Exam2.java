import java.util.Calendar;

public class Exam2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		DatePrinter.printDateTime(calendar);
		
		// 특정 날짜로 설정 => 1개씩
		calendar.set(Calendar.YEAR, 2020);
		calendar.set(Calendar.MONTH, 4);	// 0이 1월이기 때문에, 4는 5월을 의미함
		calendar.set(Calendar.DAY_OF_MONTH, 5);
		calendar.set(Calendar.HOUR_OF_DAY, 5);
		calendar.set(Calendar.MINUTE, 5);
		calendar.set(Calendar.SECOND, 5);
		DatePrinter.printDateTime(calendar);
		
		// 특정 날짜로 설정 => 년월일
		calendar.set(1998, 7, 10);
		DatePrinter.printDateTime(calendar);
		
		// 특정 날짜로 설정 => 년월일시분초
		calendar.set(2025, 0, 1, 1, 1, 1);
		DatePrinter.printDateTime(calendar);
		
	}
}
