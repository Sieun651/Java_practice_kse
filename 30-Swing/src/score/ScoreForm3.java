package score;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;

import org.w3c.dom.css.RGBColor;

public class ScoreForm3 extends JFrame implements ActionListener{
	ScoreForm3 scoreForm3 = null;
	Score score = new ScoreImpl();	
	Container container = getContentPane();
	// 1. panel_north
	JPanel panel_north = new JPanel();
	// 1.1. panel_north_left
	JPanel panel_left = new JPanel();
	JPanel panel_left_label = new JPanel();
	JPanel panel_left_textF = new JPanel();
	JLabel label_hak = new JLabel("학번 ");
	JLabel label_name = new JLabel("이름 ");
	JLabel label_kor = new JLabel("국어 ");
	JLabel label_eng = new JLabel("영어 ");
	JLabel label_mat = new JLabel("수학 ");
	JLabel label_null1 = new JLabel();
	JLabel label_null2 = new JLabel();
	JLabel label_null3 = new JLabel();
	JLabel label_null4 = new JLabel();
	JLabel label_null5 = new JLabel();
	JLabel label_null6 = new JLabel();
	JLabel label_null7 = new JLabel();
	JLabel label_null8 = new JLabel();
	JTextField textField_hak = new JTextField(10);
	JTextField textField_name = new JTextField(10);
	JTextField textField_kor = new JTextField(10);
	JTextField textField_eng = new JTextField(10);
	JTextField textField_mat = new JTextField(10);
	// 1.2. panel_north_right
	JPanel panel_right = new JPanel();
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane(textArea);
	// 2. panel_south
	JPanel panel_south = new JPanel();
	JButton button_input = new JButton("입력");
	JButton button_output = new JButton("출력");
	JButton button_search_hak = new JButton("학번검색");
	JButton button_search_name = new JButton("이름검색");
	JButton button_save_file = new JButton("파일저장");
	JButton button_read_file = new JButton("파일읽기");
	
	
	public ScoreForm3() {
		// Frame 기본 설정
		setSize(900, 500);
		setTitle("성적관리");
		setLocation(500, 250);
		init();
		start();
		setResizable(false);
		setVisible(true);
		scoreForm3 = this;
	}

	private void init() {
		// 0. Frame
		container.setLayout(new BorderLayout(0, 5));
		container.add("Center", panel_north);
		container.add("South", panel_south);
		// 1. panel_north
		panel_north.setLayout(new BorderLayout(3, 0));
		panel_north.add("West", panel_left);
		panel_north.add("Center", panel_right);
		// 1.1. panel_north_left
		panel_left.setLayout(new BorderLayout());
		panel_left.add("West", panel_left_label);
		panel_left.add("Center", panel_left_textF);
		// 1.1.1. panel_north_left_label
		panel_left_label.setLayout(new GridLayout(10, 1, 0, 10));
		panel_left_label.add(label_hak);
		panel_left_label.add(label_name);
		panel_left_label.add(label_kor);
		panel_left_label.add(label_eng);
		panel_left_label.add(label_mat);
		// 1.1.2. panel_north_left_textF
		panel_left_textF.setLayout(new GridLayout(10, 1, 0, 10));
		panel_left_textF.add(textField_hak);
		panel_left_textF.add(textField_name);
		panel_left_textF.add(textField_kor);
		panel_left_textF.add(textField_eng);
		panel_left_textF.add(textField_mat);
		// 1.2. panel_north_right
		panel_right.setLayout(new BorderLayout());
		panel_right.add("Center", textArea);
		textArea.setBackground(new Color(230, 230, 230));
		textArea.setEditable(false);
		BevelBorder bevelBorder = new BevelBorder(BevelBorder.RAISED);
		MatteBorder matteBorder = new MatteBorder(1, 1, 1, 1, Color.BLACK);
		textArea.setBorder(new CompoundBorder(bevelBorder, matteBorder));
		// 2. panel_south
		panel_south.setLayout(new GridLayout(1, 6, 2, 0));
		panel_south.add(button_input);
		panel_south.add(button_output);
		panel_south.add(button_search_hak);
		panel_south.add(button_search_name);
		panel_south.add(button_save_file);
		panel_south.add(button_read_file);
	}

	private void start() {
		// x 버튼
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(scoreForm3, "저장하시겠습니까?", 
															"저장", JOptionPane.YES_NO_OPTION);
				if(result == 0) {		//OK버튼
					score.write_file();
				} 
				System.exit(0);
			}
		});
		// 버튼 이벤트
		button_input.addActionListener(this);
		button_output.addActionListener(this);
		button_search_hak.addActionListener(this);
		button_search_name.addActionListener(this);
		button_save_file.addActionListener(this);
		button_read_file.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//textArea 초기화
		textArea.setText("");
				
		if(e.getSource() == button_input) {
			input();								//함수를 통해 관리하는 것도 좋은 방법임
			
		} else if(e.getSource() == button_output) {
			String result = score.print();
			textArea.setText(result);
			
		} else if(e.getSource() == button_search_hak) {
			String hak = textField_hak.getText();
			// 입력검사
			if(hak.equals("")) {
				JOptionPane.showMessageDialog(this, "학번을 입력해주세요.");
				return;
			}
			String result = score.searchHak(hak);
			if(result != null) {		// 데이터가 있으면
				textArea.setText(result);
			} else {					// 데이터가 없으면
				JOptionPane.showMessageDialog(this, hak + " 학번은 없습니다.");
			}			
			// 화면 초기화
			textField_hak.setText("");
			
		} else if(e.getSource() == button_search_name) {
			String name = textField_name.getText();
			//입력검사
			if(name.equals("")) {
				JOptionPane.showMessageDialog(this, "이름을 입력해주세요.");
				return;
			}
			String result = score.searchName(name);
			if(result != null) {		// 데이터가 있으면
				textArea.setText(result);
			} else {					// 데이터가 없으면
				JOptionPane.showMessageDialog(this, name + "님은 없습니다.");
			}			
			// 화면 초기화
			textField_name.setText("");
			
		} else if(e.getSource() == button_save_file) {
			String result = score.write_file();
			JOptionPane.showMessageDialog(this, result);
			
		} else if(e.getSource() == button_read_file) {
			String result = score.read_flie();
			JOptionPane.showMessageDialog(this, result);
		}  
		
	}

	private void input() {
		String hak = textField_hak.getText();
		String name = textField_name.getText();
		String str_kor = textField_kor.getText();
		String str_eng = textField_eng.getText();
		String str_mat = textField_mat.getText();
		// 학번, 이름 입력검사
		if(hak.equals("") || name.equals("")) {
			JOptionPane.showMessageDialog(this, "학번과 이름을 입력해주세요.");
			return;
		}
		// 점수 입력검사
		if(str_kor.equals("") || str_eng.equals("") || str_mat.equals("")) {
			JOptionPane.showMessageDialog(this, "점수를 입력해주세요.");
			return;
		}		
		// 형변환 및 연산
		int kor = Integer.parseInt(str_kor);
		int eng = Integer.parseInt(str_eng);
		int mat = Integer.parseInt(str_mat);
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		// vo에 입력
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		vo.setName(name);
		vo.setKor(kor);
		vo.setEng(eng);
		vo.setMat(mat);
		vo.setTot(tot);
		vo.setAvg(avg);
		
		//list에 저장
		String result = score.input(vo);
		
		//dialog 출력
		JOptionPane.showMessageDialog(this, result);
		
		//입력값 초기화
		textField_hak.setText("");
		textField_name.setText("");
		textField_kor.setText("");
		textField_eng.setText("");
		textField_mat.setText("");		
	}

}
