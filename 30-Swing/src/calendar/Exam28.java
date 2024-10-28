package calendar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Swing28 extends JFrame implements ActionListener {
	Container container = getContentPane();
	// North
	JPanel panelNorth = new JPanel();
	JButton buttonBefore = new JButton("Before");
	JButton buttonAfter = new JButton("After");
	JLabel label = new JLabel("2024년 4월");
	
	// Center
	JPanel panelCenter = new JPanel();
	JButton[] buttons = new JButton[49];
	String[] dayNames = {"일", "월", "화", "수", "목", "금", "토"};
	
	// 만년달력 관리 클래스
	HCalendar hCalendar = new HCalendar(buttons);
		
	public Swing28() {
		// Frame 기본 설정
		setSize(600, 400);
		setTitle("만년 달력");
		setLocation(700, 400);
		init();
		start();
		setResizable(false); 	// 크기 변경 금지
		setVisible(true);	
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", panelNorth);
		container.add("Center", panelCenter);
		
		// panelNorth 구성
		panelNorth.setLayout(new FlowLayout());
		panelNorth.add(buttonBefore);
		panelNorth.add(label);
		panelNorth.add(buttonAfter);
		// 버튼과 라벨 설정
		Font font = new Font("SansSerif", Font.BOLD, 20);
		buttonAfter.setFont(font);
		buttonBefore.setFont(font);
		label.setFont(font);
		
		// panelCenter 구성
		panelCenter.setLayout(new GridLayout(7, 7, 3, 3));
		for(int i=0; i<buttons.length; i++) {
			buttons[i] = new JButton();
			panelCenter.add(buttons[i]);
			// 버튼 설정
			buttons[i].setFont(new Font("Serif", Font.BOLD, 24));
			buttons[i].setBackground(Color.WHITE);
			// 요일 출력
			if(i<7) {
				buttons[i].setText(dayNames[i]);
			}
			// 글자색 설정 : 일->빨간색, 토->파란색
			if(i%7 == 0) {	//일요일
				buttons[i].setForeground(Color.RED);
			}
			if(i%7 == 6) {	//토요일
				buttons[i].setForeground(Color.BLUE);
			}
		}
		// 라벨에 년월 출력
		label.setText(hCalendar.getCalText());
		// 버튼에 날짜 출력
		hCalendar.printDays();
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 버튼 이벤트 설정
		buttonBefore.addActionListener(this);
		buttonAfter.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonBefore) {			// 1달전
			hCalendar.allInit(-1);
		} else if(e.getSource() == buttonAfter) {	// 1달후
			hCalendar.allInit(1);
		}
		// 라벨에 년월 출력
		label.setText(hCalendar.getCalText());
	}	
}

public class Exam28 {
	public static void main(String[] args) {
		new Swing28();
	}
}
