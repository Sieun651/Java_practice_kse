import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class Swing25 extends JFrame {
	Container container = getContentPane();
	String[] str = {"1번", "2번", "3번", "4번"};
	// 제목으로 str 배열 설정, 5행 설정
	DefaultTableModel tableModel = new DefaultTableModel(str, 5);
	// tableModel 기준으로 JTable 객체 생성
	JTable table = new JTable(tableModel);
	JScrollPane scrollPane = new JScrollPane(table);
	
	JLabel label = new JLabel("JTable!!", JLabel.CENTER);
	JButton button1 = new JButton("확인");
	JButton button2 = new JButton("취소");
	JPanel panel = new JPanel();
	
	public Swing25() {
		// Frame 기본 설정
		setSize(300, 300);
		setTitle("Swing25");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);	
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", label);
		container.add("Center", scrollPane);
		container.add("South", panel);
		// panel 구성
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel.add(button1);
		panel.add(button2);
		// 3행 3열의 위치에 "Test" 문자열 추가
		tableModel.setValueAt("Test", 2, 2);
		// 열, 행 추가
		tableModel.addColumn("5번");
		String[] s = new String[tableModel.getColumnCount()];	//column 수만큼 배열을 만듬
		tableModel.addRow(s);
		// 3행 3열이 문자열 읽기
		System.out.println(tableModel.getValueAt(2, 2));		
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}

public class Exam25 {
	public static void main(String[] args) {
		new Swing25();
	}
}
