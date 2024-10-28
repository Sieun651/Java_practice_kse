import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

class Swing01 extends JFrame {
	// 타이틀 바의 이미지를 가지는 객체
	ImageIcon imageIcon = new ImageIcon("img/bird.gif");
	
	public Swing01() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing01");
		// icon 설정
		setIconImage(imageIcon.getImage());
		// 모니터 기준 한가운데 표시
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension1 = toolkit.getScreenSize();		// 모니터의 크기
		Dimension dimension2 = this.getSize();				// Frame 창의 크기
		int x = (int)(dimension1.getWidth()/2 - dimension2.getWidth()/2);
		int y = (int)(dimension1.getHeight()/2 - dimension2.getHeight()/2);
		setLocation(x, y);
		
		// 특정 위치 지정
		// setLocation(800, 500);
		init();
		start();
		setVisible(true);		
	}

	private void init() {
		
	}
	private void start() {
		// x 버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}

public class Exam01 {
	public static void main(String[] args) {
		new Swing01();
	}	
}
