import java.util.Calendar;

public class Exam3 {
	public static void main(String[] args) {
		// 현재시간을 timestamp 값으로 읽어오기
		long ms1 = Calendar.getInstance().getTimeInMillis();
		System.out.println("파일 복사 시작 >> " + ms1);
		
		// try-catch : 예외처리 명령어
		try {						
			Thread.sleep(5000);		// 5000ms(5초)동안 잠시 멈춤
		} catch (Exception e) {
			e.printStackTrace();
		}
		long ms2 = Calendar.getInstance().getTimeInMillis();
		System.out.println("파일 복사 끝 >> " + ms2);
		
		System.out.println((ms2-ms1) + "ms 지났음");
	}
}
