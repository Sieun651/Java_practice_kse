import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

class Swing03 extends JFrame {
	Container container = getContentPane();
	JButton button1 = new JButton("Empty");
	JButton button2 = new JButton("Line");
	JButton button3 = new JButton("Etched");
	JButton button4 = new JButton("Bevel");
	JButton button5 = new JButton("SoftBevel");
	JButton button6 = new JButton("Matte");
	JButton button7 = new JButton("Titled");
	JButton button8 = new JButton("Compound");
	
	public Swing03() {
		// Frame 기본 설정
		setSize(300, 300);
		setTitle("Swing03");
		setLocation(800, 500);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new GridLayout(4, 2, 3, 3));
		container.add(button1);
		container.add(button2);
		container.add(button3);
		container.add(button4);
		container.add(button5);
		container.add(button6);
		container.add(button7);
		container.add(button8);
		
		// EmptyBorder : 컴포넌트의 테두리를 없앰
		button1.setBorder(new EmptyBorder(5, 3, 5, 3));	//반시계방향
		// LineBorder : 테두리를 더 강조해서 표시함
		button2.setBorder(new LineBorder(Color.RED, 3));
		// EtchedBorder : 컴포넌트 주위에 홈이 파여 있는 모양
		button3.setBorder(new EtchedBorder());
		// BevelBorder : 음각 또는 양각 표시
		button4.setBorder(new BevelBorder(BevelBorder.RAISED));
		// SoftBevelBorder : 음각 또는 양각 표시
		button5.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
		// MatteBorder : 테두리 두꼐를 설정하여 표시함
		button6.setBorder(new MatteBorder(5, 10, 15, 20, Color.BLUE));//반시계방향
		// TitledBorder : 테두리에 문자열 출력
		button7.setBorder(new TitledBorder("제목"));
		// CompoundBorder : 두가지 이상의 보더를 동시에 설정
		SoftBevelBorder softBevelBorder = new SoftBevelBorder(SoftBevelBorder.RAISED);
		TitledBorder titledBorder = new TitledBorder("제목");
		button8.setBorder(new CompoundBorder(softBevelBorder, titledBorder));
	}

	private void start() {
		// x 버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam03 {
	public static void main(String[] args) {
		new Swing03();
	}
}
