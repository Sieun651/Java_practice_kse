import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

class Swing09 extends JFrame {
	Container container = getContentPane();
	JLabel label = new JLabel("ID : ", JLabel.RIGHT);
	JTextField textField = new JTextField(10);
	
	JDialog dialog = new JDialog(this);
	Container dialogContainer = dialog.getContentPane();
	JLabel dialogLabel = new JLabel("사용할 수 있는 ID입니다.", JLabel.CENTER);
		
	public Swing09() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing09");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		// frame 구성
		container.setLayout(new FlowLayout());
		container.add(label);
		container.add(textField);
		// dialog 구성
		dialog.setSize(250, 150);
		dialog.setLocation(800, 500);
		dialogContainer.setLayout(new BorderLayout());
		dialogContainer.add("Center", dialogLabel);
		dialogLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
		
	}

	private void start() {
		// x버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// dialog x버튼
		dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// textField 이벤트 처리
		textField.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = textField.getText();
				dialogLabel.setText(id + "는 사용할 수 있는 ID입니다.");
				dialog.setVisible(true);
			}
		});
	}
	
}

public class Exam09 {
	public static void main(String[] args) {
		new Swing09();
	}
}
