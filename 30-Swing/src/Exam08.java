// Box
// 컴포넌트들을 묶어서 사용할때 사용
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

class Swing08 extends JFrame {
	Container container = getContentPane();
	JButton[] buttons = new JButton[6];
	// 세로축으로 컴포넌트를 추가하는 Box
	Box box1 = Box.createVerticalBox();
	// 가로축으로 컴포넌트를 추가하는 Box
	Box box2 = Box.createHorizontalBox();
	Box box3 = Box.createHorizontalBox();
	
	public Swing08() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing08");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new FlowLayout());
		container.add(box3);
		// box3에 box1, box2 추가
		box3.add(box1);
		box3.add(Box.createHorizontalStrut(30));	// 30pixel 간격 추가
		box3.add(box2);
		
		// button 객체 생성
		for(int i=0; i<buttons.length; i++) {
			buttons[i] = new JButton(String.valueOf(i+1));
		}
		// box1에 버튼 추가
		box1.add(buttons[0]);
		box1.add(Box.createVerticalStrut(10));
		box1.add(buttons[1]);
		box1.add(buttons[2]);
		// box2에 버튼 추가
		box2.add(buttons[3]);
		box2.add(buttons[4]);
		box2.add(buttons[5]);
		
		
	}

	private void start() {
		// x 버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
}

public class Exam08 {
	public static void main(String[] args) {
		new Swing08();
	}
}
