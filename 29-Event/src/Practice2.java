import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Ev extends Frame {
	Button button1 = new Button("버튼1");
	Button button2 = new Button("버튼2");
	
	public Ev() {
		setSize(300, 200);
		setTitle("Event 클래스 이용");
		setLocation(800, 500);
		init();
		start();
		setVisible(true);
		
	}

	private void init() {
		setLayout(null);
		add(button1);
		add(button2);
		
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.GREEN);
		button1.setBounds(88, 95, 60, 25);
		button2.setBounds(152, 95, 60, 25);
	}
	// 공통된 작업을 할 때는 약식상속 보다는 정식상속을 받아 사용하는 것이 좋음
	private void start() {
		button1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {	
				System.exit(0);
			}
		});
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

public class Practice2 {
	public static void main(String[] args) {
		new Ev();
	}
}
