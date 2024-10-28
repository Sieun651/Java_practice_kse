// 화면을 지우고 추가해서 변경
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Swing26 extends JFrame implements ActionListener {
	Container container = getContentPane();
	JButton button1 = new JButton("버튼1");
	JButton button2 = new JButton("버튼2");
		
	public Swing26() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing26");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);	
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("Center", button1);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			container.remove(button1);		// 1.기존 컴포넌트 없애기
			container.invalidate(); 		// 2. 화면 무효화
			container.add("Center", button2);	// 3. 새로운 컴포넌트 추가
			container.revalidate(); 		// 4. 화면 유효화
			container.repaint();			// 5. 화면 갱신
		} else if(e.getSource() == button2) {
			container.remove(button2);		// 기존 컴포넌트 없애기
			container.invalidate(); 		// 화면 무효화
			container.add("Center", button1);	// 새로운 컴포넌트 추가
			container.revalidate(); 		// 화면 유효화
			container.repaint();			// 화면 갱신
		}
	}
}

public class Exam26 {
	public static void main(String[] args) {
		new Swing26();
	}
}
