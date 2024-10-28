//workspace
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

class Swing19 extends JFrame {
	Container container = getContentPane();
	// 가로로 배치되는 툴바
	JToolBar toolBar = new JToolBar(JToolBar.HORIZONTAL);
	JButton button1 = new JButton(new ImageIcon("img/middle.gif"));
	JButton button2 = new JButton(new ImageIcon("img/left.gif"));
	
	public Swing19() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing19");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);	
		}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", toolBar);
		// toolBar 구성
		toolBar.setRollover(true);	//마우스를 올렸을 때 활성화
		toolBar.add(button1);
		toolBar.addSeparator();
		toolBar.add(button2);
	}

	private void start() {
		// x버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam19 {
	public static void main(String[] args) {
		new Swing19();
	}
}
