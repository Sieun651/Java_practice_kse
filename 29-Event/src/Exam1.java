// 이벤트.상속
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Listener 또는 Adapter를 상속받은 임의의 클래스를 생성
//(이벤트 처리 클래스(분리)(113p 객체정의유형 1번))
		//자식					//부모
class ActionDefine implements ActionListener {

	@Override					//핸들러(마우스클릭,키보드입력 등으로 실행됨)
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
}

class Event1 extends Frame {
	Button button = new Button("확인");
	ActionDefine ad = new ActionDefine();
	
	public Event1() {
		//Frame 기본 설정
		setSize(300, 200);
		setTitle("Event");
		setLocation(800,400);
		
		init();
		start();
		
		setVisible(true);
	}

	private void init() {
		// layout 설정
		setLayout(null);
		add(button);
		// button 설정
		button.setBackground(Color.YELLOW);		//컬러 대문자 소문자 차이 없음
		button.setBounds(110, 95, 80, 30);
	}
	private void start() {		//버튼(컴포넌트)에 이벤트 처리 클래스 등록
		button.addActionListener(ad);
	}
}

public class Exam1 {
	public static void main(String[] args) {
		new Event1();
	}
}
