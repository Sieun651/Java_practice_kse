package score;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame implements ActionListener {
	Score score = new ScoreImpl();
	Container container = getContentPane();
	// center
	JPanel panel_center = new JPanel();
	// center_left
	JPanel panel_left = new JPanel();
	JPanel panel_hak = new JPanel();
	JPanel panel_name = new JPanel();
	JPanel panel_kor = new JPanel();
	JPanel panel_eng = new JPanel();
	JPanel panel_mat = new JPanel();
	JLabel label_hak = new JLabel("학번");
	JLabel label_name = new JLabel("이름");
	JLabel label_kor = new JLabel("국어");
	JLabel label_eng = new JLabel("영어");
	JLabel label_mat = new JLabel("수학");
	JTextField tf_hak = new JTextField(10);
	JTextField tf_name = new JTextField(10);
	JTextField tf_kor = new JTextField(10);
	JTextField tf_eng = new JTextField(10);
	JTextField tf_mat = new JTextField(10);
	// center_right
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane(textArea);
	//south
	JPanel panel_south = new JPanel();
	JButton button_input = new JButton("입력");
	JButton button_output = new JButton("출력");
	JButton button_searchHak = new JButton("학번검색");
	JButton button_searchName = new JButton("이름검색");	
	
	public ScoreFrame() {
		setSize(750, 400);
		setLocation(600, 300);
		setTitle("성적 관리");
		
		init();
		start();
		setVisible(true);
		setResizable(false);
	}

	private void init() {
		// 0. center
		container.setLayout(new BorderLayout(0, 3));
		container.add("Center", panel_center);
		container.add("South", panel_south);
		// 1. panel_center
		panel_center.setLayout(new BorderLayout(5, 0));
		panel_center.add("West", panel_left);
		panel_center.add("Center", scrollPane);
		textArea.setBackground(new Color(220, 220, 220));
		// 1.1. panel_center_left
		panel_left.setLayout(new GridLayout(10, 0, 0, 12));
		panel_left.add(panel_hak);
		panel_left.add(panel_name);
		panel_left.add(panel_kor);
		panel_left.add(panel_eng);
		panel_left.add(panel_mat);
		// 1.1.1. panel_hak
		panel_hak.setLayout(new BorderLayout(5, 0));
		panel_hak.add("West", label_hak);
		panel_hak.add("Center", tf_hak);
		// 1.1.2. panel_name
		panel_name.setLayout(new BorderLayout(5, 0));
		panel_name.add("West", label_name);
		panel_name.add("Center", tf_name);
		// 1.1.3. panel_kor
		panel_kor.setLayout(new BorderLayout(5, 0));
		panel_kor.add("West", label_kor);
		panel_kor.add("Center", tf_kor);
		// 1.1.4. panel_eng
		panel_eng.setLayout(new BorderLayout(5, 0));
		panel_eng.add("West", label_eng);
		panel_eng.add("Center", tf_eng);
		// 1.1.5. panel_mat
		panel_mat.setLayout(new BorderLayout(5, 0));
		panel_mat.add("West", label_mat);
		panel_mat.add("Center", tf_mat);
		// 2. panel_south
		panel_south.setLayout(new GridLayout(1, 4, 3, 0));
		panel_south.add(button_input);
		panel_south.add(button_output);
		panel_south.add(button_searchHak);
		panel_south.add(button_searchName);
	}

	private void start() {
		// x버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 버튼이벤트
		button_input.addActionListener(this);
		button_output.addActionListener(this);
		button_searchHak.addActionListener(this);
		button_searchName.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		textArea.setText("");
		if(e.getSource() == button_input) {				
			String hak = tf_hak.getText();
			String name = tf_name.getText();
			String str_kor = tf_kor.getText();
			String str_eng = tf_eng.getText();
			String str_mat = tf_mat.getText();
			// 입력검사-학번, 이름
			if(hak.equals("") || name.equals("")) {
				JOptionPane.showMessageDialog(this, "학번과 이름을 입력해주세요.");
				return;
			} 
			// 입력검사-점수
			if(str_kor.equals("") || str_eng.equals("") || str_mat.equals("")) {
				JOptionPane.showMessageDialog(this, "점수를 모두 입력해주세요.");
				return;
			}
			// db저장			
			int result = score.input(hak, name, str_kor, str_eng, str_mat);
			if(result > 0) {
				JOptionPane.showMessageDialog(this, "데이터 입력 성공");
			} else {
				JOptionPane.showMessageDialog(this, "이미 있는 학번입니다.");
				return;
			}
			// 초기화
			tf_hak.setText("");
			tf_name.setText("");
			tf_kor.setText("");
			tf_eng.setText("");
			tf_mat.setText("");		
			
		} else if(e.getSource() == button_output) {
			String result = score.output();
			textArea.setText(result);
			
		} else if(e.getSource() == button_searchHak) {
			// 입력검사 - 학번
			String hak = tf_hak.getText();
			if(hak.equals("")) {
				JOptionPane.showMessageDialog(this, "학번을 입력해주세요.");
				return;
			} 
						
			String result = score.searchHak(hak);
			if(result.equals("")) {
				JOptionPane.showMessageDialog(this, "없는 학번입니다.");
			}
			String aa = "학번\t이름\t국어\t영어\t수학\t총점\t평균\n";
			textArea.setText(aa+result);			
			tf_hak.setText("");
			
		} else if(e.getSource() == button_searchName) {
			String name = tf_name.getText();
			if(name.equals("")) {
				JOptionPane.showMessageDialog(this, "이름을 입력해주세요.");
				return;
			} 
						
			String result = score.searchName(name);
			if(result.equals("")) {
				JOptionPane.showMessageDialog(this, "없는 이름입니다.");
			}
			String aa = "학번\t이름\t국어\t영어\t수학\t총점\t평균\n";
			textArea.setText(aa+result);
			tf_name.setText("");
		} 
		
	}


}
