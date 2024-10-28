import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

class Swing4 extends JFrame {
	// Frame
	Container container = getContentPane();
	// North
	JPanel panel_N = new JPanel();
	JLabel label = new JLabel("BorderLayout", JLabel.CENTER);
	// West
	JPanel panel_W = new JPanel();
	JButton button_add = new JButton("Add");
	// Center
	JPanel panel_C = new JPanel();
	JButton button1 = new JButton("인사과");
	JButton button2 = new JButton("총무과");
	JButton button3 = new JButton("사무과");
	JButton button4 = new JButton("경리과");
	// East
	JPanel panel_E = new JPanel();
	JButton button_com = new JButton("컴퓨터");
	JButton button_phone = new JButton("핸드폰");
	JButton button_glasses = new JButton("안경");
	// South
	JPanel panel_S = new JPanel();
	
	
	public Swing4() {
		// Frame 기본 설정
		setSize(500, 300);
		setTitle("Swing04");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new BorderLayout());
		// North
		container.add("North", panel_N);
		panel_N.setBorder(new TitledBorder("Title Label"));
		panel_N.add(label);	
		/* 폰트 설정 */
		label.setFont(new Font("궁서체", Font.BOLD, 20));
		// West
		container.add("West", panel_W);
		panel_W.setBorder(new TitledBorder("West"));
		panel_W.add(button_add);
		// Center
		container.add("Center", panel_C);
		panel_C.setBorder(new TitledBorder("Center"));
		panel_C.add(button1);
		panel_C.add(button2);
		panel_C.add(button3);
		panel_C.add(button4);
		// East
		container.add("East", panel_E);		
		panel_E.setLayout(new GridLayout(3, 1));
		panel_E.setBorder(new TitledBorder("East"));
		panel_E.add(button_com);
		panel_E.add(button_phone);
		panel_E.add(button_glasses);
		// South
		container.add("South", panel_S);
		panel_S.setBorder(new TitledBorder("South"));
	}

	private void start() {
		// x 버튼 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam04 {
	public static void main(String[] args) {
		new Swing4();
	}
}
