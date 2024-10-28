import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Swing15 extends JFrame implements ActionListener {
	Container container = getContentPane();
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
		
	public Swing15() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing15");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);	
		}

	private void init() {
		container.setLayout(new FlowLayout());
		container.add(button1);
		container.add(button2);
		container.add(button3);
		container.add(button4);
		container.add(button5);		
	}

	private void start() {
		// x 버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// button 이벤트 설정
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			choose1();
		} else if(e.getSource() == button2) {
			choose2();
		} else if(e.getSource() == button3) {
			choose3();
		} else if(e.getSource() == button4) {
			choose4();
		} else if(e.getSource() == button5) {
			choose5();
		} 
	}

	private void choose1() {
		// 다양한 기능을 추가해가면서 사용 가능
		//int result = JOptionPane.showConfirmDialog(this, "저장하시겠습니까?");
		//int result = JOptionPane.showConfirmDialog(this, "저장하시겠습니까?", "저장", 
		//				JOptionPane.OK_CANCEL_OPTION);
		//int result = JOptionPane.showConfirmDialog(this, "저장하시겠습니까?", "저장", 
		//		JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
		int result = JOptionPane.showConfirmDialog(this, "저장하시겠습니까?", "저장", 
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
						new ImageIcon("img/cat.gif"));
		
		System.out.println("result = " + result);
	}
	private void choose2() {
		String[] str = {"AAA", "BBB", "CCC"};
		//String result = (String)JOptionPane.showInputDialog(this, "아이디?");
		//String result = (String)JOptionPane.showInputDialog(this, "아이디?", "ID");
//		String result = (String)JOptionPane.showInputDialog(this, "아이디?", "ID",
//						JOptionPane.INFORMATION_MESSAGE);
//		String result = (String)JOptionPane.showInputDialog(this, "아이디?", "ID",
//				JOptionPane.INFORMATION_MESSAGE, new ImageIcon("img/dog.gif"), 
//				str, "BBB");
		String result = (String)JOptionPane.showInputDialog(this, "아이디?", "ID",
				JOptionPane.INFORMATION_MESSAGE, null, 
				str, "BBB");
		
		
		System.out.println("result = " + result);
	}
	private void choose3() {
		int result = JOptionPane.showInternalConfirmDialog(container, "저장하시겠습니까?");
		
		System.out.println("result = " + result);
	}
	private void choose4() {
		String result = JOptionPane.showInternalInputDialog(container, "이름 : ");
		
		System.out.println("result = " + result);
		if(result.equals("")) {
			JOptionPane.showMessageDialog(this, "입력된 이름이 없습니다.");
		}		
	}
	private void choose5() {
		String[] str = {"a", "b", "c", "d", "e", "f"};
//		int result = JOptionPane.showOptionDialog(this, "선택하세요?", "물건선택", 
//				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, str, "a");
		int result = JOptionPane.showOptionDialog(this, "선택하세요?", "물건선택", 
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
				new ImageIcon("img/pig.gif"), str, "a");
		
		System.out.println("result = " + result);
	}
}

public class Exam15 {
	public static void main(String[] args) {
		new Swing15(); 
	}
}
