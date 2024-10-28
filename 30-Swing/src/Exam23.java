import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;

class Swing23 extends JFrame {
	Container container = getContentPane();
	JLabel label = new JLabel("Test");
	JButton buttonup = new JButton("위 버튼");
	JButton buttondown = new JButton("아래 버튼");
	JButton buttonLeft = new JButton("좌측 버튼");
	
	JSplitPane splitPane1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
						true, buttonup, buttondown);
	JSplitPane splitPane2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
						true, buttonLeft, splitPane1);
	
	public Swing23() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing23");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);	
		
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", label);
		container.add("Center", splitPane2);
		// 아래의 컴포넌트를 다른 컴포넌트로 변경
		JButton buttonDown2 = new JButton("아래2 버튼");
		splitPane1.setBottomComponent(buttonDown2);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam23 {
	public static void main(String[] args) {
		new Swing23();
	}
}
