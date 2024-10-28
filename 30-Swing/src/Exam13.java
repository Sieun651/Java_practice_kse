import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

class Swing13 extends JFrame {
	Container container = getContentPane();
	JPanel panel = new JPanel();
	// JInternalFrame(title, resizable, closable, maximizable, iconifiable);
	JInternalFrame internalFrame = new JInternalFrame("제목", true, true, true, true);
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	
	public Swing13() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing13");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);	
		}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("West", button1);
		container.add("Center", panel);
		container.add("South", button2);
		// panel 구성
		panel.setLayout(new BorderLayout());
		panel.add("Center", internalFrame);
		// internalFrame 구성
		internalFrame.setVisible(true);
		
		Container container_inter = internalFrame.getContentPane();
		container_inter.setLayout(new FlowLayout());
		container_inter.add(new JButton("3"));
		container_inter.add(new JButton("4"));
		internalFrame.setFrameIcon(new ImageIcon("img/cat.gif"));
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam13 {
	public static void main(String[] args) {
		new Swing13();
	}
}
