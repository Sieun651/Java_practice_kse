import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

class Swing12 extends JFrame {
	Container container = getContentPane();
	String[] strs = {"AAA", "BBB", "CCC", "DDD", "EEE"};
	JComboBox<String> comboBox = new JComboBox<String>(strs);
	
	
	public Swing12() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing12");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);	
		}

	private void init() {
		container.setLayout(new FlowLayout());
		container.add(comboBox);
		// 콤보 박스 크기 설정
		comboBox.setPreferredSize(new Dimension(200, 30));
		// comboBox에 항목 추가
		comboBox.addItem("FFF");
		// comboBox 내용 수정
		comboBox.setEditable(true);
		// comboBox 행의 개수 설정
		comboBox.setMaximumRowCount(3);
	}

	private void start() {
		// x 버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// comboBox 이벤트 처리
		comboBox.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox.getSelectedItem());				
			}
		});
	}
}

public class Exam12 {
	public static void main(String[] args) {
		new Swing12();
	}
}
