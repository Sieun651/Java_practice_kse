// Frame 클래스 >> 멤버변수

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class Exam2 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(300, 200);
		f.setTitle("기본 화면");
		f.setLocation(800, 400);
		//button 1개 추가
		Button button = new Button("확인");
		button.setBackground(Color.yellow);
		//button.setBounds(int x, int y, int width, int height);
		button.setBounds(110, 95, 80, 30);
		// frame에 추가
		f.setLayout(null);
		f.add(button);
				
		f.setVisible(true);
	}
}
