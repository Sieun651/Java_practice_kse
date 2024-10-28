package school2;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SchoolFrame extends JFrame implements ActionListener {
	SchoolDAO dao = new SchoolDAO();
	Container container = getContentPane();
	int code = 0;
	
	JPanel panel_center = new JPanel();
	// center_left
	CardLayout cardLayout = new CardLayout();
	JPanel panel_left = new JPanel();
	JPanel panel_leftU = new JPanel();
	JPanel panel_leftD = new JPanel();
	JPanel panel_radioB = new JPanel();
	ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton radioButton_stu = new JRadioButton("학생");
	JRadioButton radioButton_pro = new JRadioButton("교수");
	JRadioButton radioButton_sys = new JRadioButton("관리자");
	JPanel panel_card = new JPanel();
	JPanel panel_card1 = new JPanel();
	JPanel panel_card2 = new JPanel();
	JPanel panel_card3 = new JPanel();
	JPanel panel_name1 = new JPanel();
	JPanel panel_name2 = new JPanel();
	JPanel panel_name3 = new JPanel();
	JPanel panel_hak = new JPanel();
	JPanel panel_sub = new JPanel();
	JPanel panel_dep = new JPanel();
	JLabel label_name1 = new JLabel("이름");
	JLabel label_name2 = new JLabel("이름");
	JLabel label_name3 = new JLabel("이름");
	JLabel label_hak = new JLabel("학번");
	JLabel label_sub = new JLabel("과목");
	JLabel label_dep = new JLabel("부서");
	JTextField textField_name1 = new JTextField(10);
	JTextField textField_name2 = new JTextField(10);
	JTextField textField_name3 = new JTextField(10);
	JTextField textField_hak = new JTextField(10);
	JTextField textField_sub = new JTextField(10);
	JTextField textField_dep = new JTextField(10);
		
	// center_right
	JTextArea textArea = new JTextArea();
	
	// south
	JPanel panel_south = new JPanel();
	JButton button_input = new JButton("입력");
	JButton button_searchName = new JButton("이름 검색");
	JButton button_searchAll = new JButton("전체 검색");
	JButton button_delete = new JButton("삭제");
	
	public SchoolFrame() {
		setSize(480, 280);
		setTitle("간단 학교 인적 관리");
		setLocation(700, 400);
		
		init();
		start();
		setVisible(true);
		setResizable(false);
	}

	private void init() {
		container.setLayout(new BorderLayout(0, 5));
		container.add("Center", panel_center);
		container.add("South", panel_south);
		// 센터
		panel_center.setLayout(new BorderLayout(5, 0));
		panel_center.add("West", panel_left);
		panel_center.add("Center", textArea);
		// 센터_왼쪽
		panel_left.setLayout(new GridLayout(2, 1));		
		panel_left.add(panel_leftU);
		panel_left.add(panel_leftD);
		// 센터_왼쪽_위
		panel_leftU.setLayout(new BorderLayout(0, 7));
		panel_leftU.add("North", panel_radioB);
		panel_leftU.add("Center", panel_card);
		// 센터_왼쪽_위_버튼
		panel_radioB.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel_radioB.add(radioButton_stu);
		panel_radioB.add(radioButton_pro);
		panel_radioB.add(radioButton_sys);
		buttonGroup.add(radioButton_stu);
		buttonGroup.add(radioButton_pro);
		buttonGroup.add(radioButton_sys);
		// 센터_왼쪽_위_card
		panel_card.setLayout(cardLayout);
		panel_card.add(panel_card1, "student");		
		panel_card.add(panel_card2, "professor");
		panel_card.add(panel_card3, "system");
		// 센터_왼쪽_위_card_1
		panel_card1.setLayout(new GridLayout(2, 1, 0, 15));
		panel_card1.add(panel_name1);
		panel_card1.add(panel_hak);
		panel_name1.setLayout(new BorderLayout(5, 0));
		panel_name1.add("West", label_name1);
		panel_name1.add("Center", textField_name1);
		panel_hak.setLayout(new BorderLayout(5, 0));
		panel_hak.add("West", label_hak);
		panel_hak.add("Center", textField_hak);
		// 센터_왼쪽_위_card_2
		panel_card2.setLayout(new GridLayout(2, 1, 0, 15));
		panel_card2.add(panel_name2);
		panel_card2.add(panel_sub);
		panel_name2.setLayout(new BorderLayout(5, 0));
		panel_name2.add("West", label_name2);
		panel_name2.add("Center", textField_name2);
		panel_sub.setLayout(new BorderLayout(5, 0));
		panel_sub.add("West", label_sub);
		panel_sub.add("Center", textField_sub);
		// 센터_왼쪽_위_card_3
		panel_card3.setLayout(new GridLayout(2, 1, 0, 15));
		panel_card3.add(panel_name3);
		panel_card3.add(panel_dep);
		panel_name3.setLayout(new BorderLayout(5, 0));
		panel_name3.add("West", label_name3);
		panel_name3.add("Center", textField_name3);
		panel_dep.setLayout(new BorderLayout(5, 0));
		panel_dep.add("West", label_dep);
		panel_dep.add("Center", textField_dep);
		
		// 남쪽
		panel_south.setLayout(new GridLayout(1, 4));
		panel_south.add(button_input);
		panel_south.add(button_searchName);
		panel_south.add(button_searchAll);
		panel_south.add(button_delete);
	}

	private void start() {
		// x 버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 라디오버튼
		radioButton_stu.addActionListener(this);
		radioButton_pro.addActionListener(this);
		radioButton_sys.addActionListener(this);
		// 버튼
		button_input.addActionListener(this);
		button_searchName.addActionListener(this);
		button_searchAll.addActionListener(this);
		button_delete.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == radioButton_stu) {
			cardLayout.show(panel_card, "student");
			code = 1;
		} else if(e.getSource() == radioButton_pro) {
			cardLayout.show(panel_card, "professor");
			code = 2;
		} else if(e.getSource() == radioButton_sys) {
			cardLayout.show(panel_card, "system");
			code = 3;
		}	
		if(e.getSource() == button_input) {
			System.out.println(code);
			input(code);
		} else if(e.getSource() == button_searchName) {
			
		} else if(e.getSource() == button_searchAll) {
			
		} else if(e.getSource() == button_delete) {
			
		} 
		 
	}
	
	public void input(int code) {
		String name1 = textField_name1.getText();
		String name2 = textField_name2.getText();
		String name3 = textField_name3.getText();
		String value1 = textField_hak.getText();
		String value2 = textField_sub.getText();
		String value3 = textField_dep.getText();
		// 이름 입력검사
		if(name1.equals("") && name2.equals("") && name3.equals("")) {
			JOptionPane.showMessageDialog(this, "이름을 입력해주세요.");
			return;
		}
		if(value1.equals("") && value2.equals("") && value3.equals("")) {
			JOptionPane.showMessageDialog(this, "값을 입력해주세요.");
			return;
		}
		SchoolDTO dto = new SchoolDTO();
		if(code == 1) {			
			dto.setName(name1);
			dto.setValue(value1);
			dto.setCode(code);			
		} else if(code == 2) {			
			dto.setName(name2);
			dto.setValue(value2);
			dto.setCode(code);			
		} else if(code == 3) {			
			dto.setName(name3);
			dto.setValue(value3);
			dto.setCode(code);			
		} 
		
		int result = dao.insertArticle(dto);
		
		if(result > 0) {
			JOptionPane.showMessageDialog(this, "저장성공");
		} else {
			JOptionPane.showMessageDialog(this, "저장실패");
		}
	}

}
