import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

class Swing02 extends JFrame implements MouseListener {
	// JFrame 의 4개의 Pane 중에서 ContentPane을 얻어오기
	Container container = getContentPane();
	ImageIcon imageIcon1 = new ImageIcon("img/cat.gif");
	ImageIcon imageIcon2 = new ImageIcon("img/pig.gif");
	ImageIcon imageIcon3 = new ImageIcon("img/dog.gif");
	
	JButton button1 = new JButton("String");
	JButton button2 = new JButton(imageIcon1);
	JButton button3 = new JButton("str & Icon", imageIcon1);
	
	JDialog dialog = new JDialog(this);

	public Swing02() {
		// Frame 기본 설정
		setSize(500, 200);
		setTitle("Swing02");
		setLocation(800, 500);
		init();
		start();
		setVisible(true);
	}
	
	private void init() {
		container.setLayout(new FlowLayout());
		container.add(button1);
		container.add(button2);
		container.add(button3);
		
		// button1 비활성화
		button1.setEnabled(false);
		// button2 단축키 지정 (alt + 'a')
		button2.setMnemonic('a');
		// button3의 문자열 위치 변경
		button3.setHorizontalTextPosition(SwingConstants.LEFT);
		button3.setVerticalTextPosition(SwingConstants.TOP);
		// 마우스로 눌렀을 때의 이미지 변경
		button3.setPressedIcon(imageIcon2);
		// 마우스를 올렸을 때의 이미지 변경
		button3.setRolloverIcon(imageIcon3);		
	}

	private void start() {
		// x 버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// dialog x버튼
		dialog.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dialog.dispose();
			}
		});
		// 버튼 이벤트 설정
		button2.addMouseListener(this);
		button3.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {		//마우스클릭
		if(e.getSource() == button2) {
			dialog.setTitle("버튼2");
			dialog.setLocation(900, 600);
			dialog.setVisible(true);
		} else if(e.getSource() == button3) {
			dialog.setTitle("버튼3");
			dialog.setLocation(1000, 600);
			dialog.setVisible(true);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {		//마우스 올렸을떄
		if(e.getSource() == button3 ) {
			dialog.setTitle("버튼3 Entered");
			dialog.setLocation(1100, 600);
			dialog.setVisible(true);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
}

public class Exam02 {
	public static void main(String[] args) {
		new Swing02();
	}
}
