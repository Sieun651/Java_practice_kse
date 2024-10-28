// 이벤트.상속
// 무명클래스 이용
//(이벤트 처리 클래스(113p 객체정의유형 3번))
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Event3 extends Frame {
	Button button = new Button("OK");
	
	public Event3() {
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
		//버튼설정
		button.setBackground(Color.YELLOW);
		button.setBounds(110, 95, 80, 30);		
	}
	// 버튼 이벤트 설정
	private void start() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}					
		});		
		// Frame 창의 x버튼 종료처리 설정
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
public class Exam3 {
	public static void main(String[] args) {
		new Event3();
	}
}
