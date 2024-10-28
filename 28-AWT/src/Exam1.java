// Frame 클래스 >> 도화지의 역할(윈도우 창 1개) >> 멤버변수

import java.awt.Frame;

public class Exam1 {
	public static void main(String[] args) {
		Frame f  = new Frame();			//다른클래스의 사용 - 멤버변수로 포함시켜서 사용
		// 윈도우 크기 설정
		f.setSize(300, 200);
		// 제목 설정
		f.setTitle("Java Form 1");
		// 모니터에서 위치 설정
		f.setLocation(200,100);
		// 윈도우 창 보이기
		f.setVisible(true);		//false면 안보임
	}
}
