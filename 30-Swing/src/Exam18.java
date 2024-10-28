import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Swing18 extends JFrame {
	Container container = getContentPane();
	// north
	JPanel panel1 = new JPanel();
	JLabel labelId = new JLabel("ID : ", JLabel.RIGHT);
	JTextField textField = new JTextField();
	// center
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane(textArea);
	// south
	JPanel panel2 = new JPanel();
	JLabel labelPass = new JLabel("Password : ", JLabel.RIGHT);
	JPasswordField passwordField = new JPasswordField();
	
	public Swing18() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing18");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);	
		}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", panel1);
		container.add("Center", scrollPane);
		container.add("South", panel2);
		
		// North
		panel1.setLayout(new BorderLayout());
		panel1.add("West", labelId);
		panel1.add("Center", textField);	
		
		// South
		panel2.setLayout(new BorderLayout());
		panel2.add("West", labelPass);
		panel2.add("Center", passwordField);
		// 표시되는 문자 변경(기본값은 *)
		passwordField.setEchoChar('%');		
	}

	private void start() {
		// x 버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		textField.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = textArea.getText() + "\n" + textField.getText();
				textArea.setText(str);
			}
		});
		passwordField.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = textArea.getText() + "\n" + passwordField.getText();
				//String str = textArea.getText() + "\n" + new String(passwordField.getPassword());				
				textArea.setText(str);				
			}
		});
	}
}

public class Exam18 {
	public static void main(String[] args) {
		new Swing18();
	}
}
