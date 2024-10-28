import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class P_p3 extends Frame {
	Button button1 = new Button("Test");
	Button button2 = new Button("Test1");
	Button button3 = new Button("Test2");
	Panel panel_south = new Panel();
	Panel panel_s_right = new Panel();
	
	public P_p3() {
		// Frame 기본 설정
		setSize(300, 200);
		setLocation(700, 400);
		
		init();
		start();
		setVisible(true);		
	}

	private void init() {
		// Frame layout 설정 (top-down 방식)
		setLayout(new BorderLayout());	// 기본값이 Border 레이아웃이기 때문에 생략 가능함
		add("South", panel_south);
		// panel_south 설정
		panel_south.setLayout(new GridLayout(1, 2, 2, 0));
		panel_south.add(button1);
		panel_south.add(panel_s_right);
		// panel_s_right 설정		
		panel_s_right.setLayout(new GridLayout(2, 1, 0, 1));
		panel_s_right.add(button2);
		panel_s_right.add(button3);
		// button 설정
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.MAGENTA);
		button3.setBackground(Color.GREEN);
	}
	private void start() {
		// x버튼
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

public class Practice3 {
	public static void main(String[] args) {
		new P_p3();
	}
}
