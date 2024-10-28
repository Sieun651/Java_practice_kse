// 여러 화면을 레이어드 해두고, 맨 위에 표시될 화면을 지정하는 방식
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Swing27 extends JFrame implements MouseListener {
	Container container = getContentPane();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	CardLayout cardLayout = new CardLayout();
		
	public Swing27() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing27");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);	
	}

	private void init() {
		container.setLayout(cardLayout);
		container.add(panel1, "red");
		container.add(panel2, "blue");
		
		panel1.setBackground(Color.RED);
		panel2.setBackground(Color.BLUE);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// panel 이벤트 설정
		panel1.addMouseListener(this);
		panel2.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {	//클릭하면 호출
		if(e.getSource() == panel1) {
			cardLayout.show(container, "blue");
		} else if(e.getSource() == panel2) {
			cardLayout.show(container, "red");
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {		
	}
	@Override
	public void mouseExited(MouseEvent e) {		
	}
}

public class Exam27 {
	public static void main(String[] args) {
		new Swing27();
	}
}
