import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class Swing06 extends JFrame implements ActionListener {
	Container container = getContentPane();
	JRadioButton radioButton1 = new JRadioButton("여자", true);
	JRadioButton radioButton2 = new JRadioButton("남자");
	JRadioButton radioButton3 = new JRadioButton("청소년");
	JRadioButton radioButton4 = new JRadioButton("성인", true);
	
	ButtonGroup buttonGroup1 = new ButtonGroup();
	ButtonGroup buttonGroup2 = new ButtonGroup();
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	
	public Swing06() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing06");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new GridLayout(4, 1, 3, 3));
		container.add(panel1);
		container.add(panel2);
		
		// panel1
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel1.add(radioButton1);
		panel1.add(radioButton2);
		buttonGroup1.add(radioButton1);
		buttonGroup1.add(radioButton2);
		// panel2
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel2.add(radioButton3);
		panel2.add(radioButton4);
		buttonGroup2.add(radioButton3);
		buttonGroup2.add(radioButton4);
	}

	private void start() {
		// x 버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// radio 버튼 이벤트 설정
		radioButton1.addActionListener(this);
		radioButton2.addActionListener(this);
		radioButton3.addActionListener(this);
		radioButton4.addActionListener(this);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(radioButton1.isSelected()) System.out.println("여자 선택");
		if(radioButton2.isSelected()) System.out.println("남자 선택");
		if(radioButton3.isSelected()) System.out.println("청소년 선택");
		if(radioButton4.isSelected()) System.out.println("성인 선택");		
	}
}

public class Exam06 {
	public static void main(String[] args) {
		new Swing06();
	}
}
