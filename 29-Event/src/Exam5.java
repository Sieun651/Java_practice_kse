                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             //레이아웃

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Form5 extends Frame implements ActionListener{
	Button button1 = new Button("Button1");
	Button button2 = new Button("Button2");
	Button button3 = new Button("Button3");
	
	public Form5() {
		// Frame 기본설정
		setSize(300, 200);
		setTitle("Form");
		setLocation(800,500);
		init2();
	    start();
	    
	    setVisible(true);
	}
	
	// FlowLayout
	// => 컴포넌트를 왼쪽에서 오른쪽으로 추가시킴
	// => 컴포넌트의 크기는 원래 크기로 추가함
	private void init1() {
		// 레이아웃 설정
		setLayout(new FlowLayout(FlowLayout.CENTER));	//센터는 생략가능
		add(button1);
		add(button2);
		add(button3);
		
		// 버튼 설정
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.YELLOW);
		button3.setBackground(Color.YELLOW);
	}
	// GridLayout
	// => 컴포넌트를 격자 형식으로 추가시킴
	// => 격자 모양으로 화면을 꽉 채움
	private void init2() {
		// 레이아웃 설정
		// GridLayout(row, column, h-gap, v-gap)
		setLayout(new GridLayout(2, 2, 5, 5));		//행, 열. 열간격, 행간격
		add(button1);
		add(button2);
		add(button3);
		
		// 버튼 설정
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.YELLOW);
		button3.setBackground(Color.YELLOW);
	}
	// BorderLayout
	// => 컴포넌트를 중앙, 동, 서, 남, 북에 배치시킴(직접설정)
	// => 각 영역을 가득 채움
	private void init3() {
		// 레이아웃 설정
		setLayout(new BorderLayout());
		add("North", button1);
		add("Center", button2);
		add("South", button3);
		
		// 버튼 설정
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.GREEN);
		button3.setBackground(Color.BLUE);
	}

	private void start() {
		// x버튼 이벤트 설정(3번방법)
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
	
}

public class Exam5 {
	public static void main(String[] args) {
		new Form5();
	}
}
