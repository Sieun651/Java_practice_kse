import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

class Swing05 extends JFrame {
	Container container = getContentPane();
	// on|off 상태를 기억하는 버튼
	// => 개별적으로 사용할 수 있음
	// => 그룹으로 묶어서 사용할 수도 있음(여러개 중 1개만 on상태를 유지)
	JToggleButton button1 = new JToggleButton("1", true);
	JToggleButton button2 = new JToggleButton("2", false);
	JToggleButton button3 = new JToggleButton("3", false);
	JToggleButton button4 = new JToggleButton("4", false);
	// JToggleButton을 그룹으로 묶어주는 클래스
	ButtonGroup buttonGroup = new ButtonGroup();
	
	
	public Swing05() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing05");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new GridLayout(2, 2, 2, 2));
		container.add(button1);
		container.add(button2);
		container.add(button3);
		container.add(button4); 
		// 그룹으로 묶기
		buttonGroup.add(button1);
		buttonGroup.add(button2);
		buttonGroup.add(button3);
		buttonGroup.add(button4);
	}

	private void start() {
		// x 버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// button1만 이벤트 처리
		button1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// on:true, off:false
				System.out.println(button1.isSelected());						
			}
		});
	}
}

public class Exam05 {
	public static void main(String[] args) {
		new Swing05();
	}
}
