// 이벤트.상속
// 다형성
//(이벤트 처리 클래스(113p 객체정의유형 4번))

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Event4 extends Frame {
	Button button = new Button("OK");
	Button button2 = new Button("CANCEL");		//버튼 1개 추가
	
	public Event4() {
		//Frame 기본 설정
		setSize(300, 200);
		setTitle("Event");
		setLocation(800, 500);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		// layout 설정
		setLayout(null);
		add(button);
		add(button2);
		//버튼설정
		button.setBackground(Color.YELLOW);
		button.setBounds(100, 95, 80, 30);	
		
		button2.setBackground(Color.GREEN);
		button2.setBounds(200, 95, 80, 30);
	}
	// 버튼 이벤트 설정
	private void start() {
		ActionListener a1 = new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		};
		WindowAdapter w1 = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		button.addActionListener(a1);
		this.addWindowListener(w1);
	}
}

public class Exam4 {
	public static void main(String[] args) {
		new Event4();
	}
}
