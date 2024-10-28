package score;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScoreForm extends Frame implements ActionListener {
	// 컴포넌트
	// south
	Panel panel_south = new Panel();
	Button button_input = new Button("입력");
	Button button_output = new Button("출력");
	Button button_search_hak = new Button("학번검색");
	Button button_search_name = new Button("이름검색");
	Button button_save_file = new Button("파일저장");
	Button button_read_file = new Button("파일읽기");
	// center
	Panel panel_center = new Panel();
	// center_west
	Panel panel_west = new Panel();
	Panel panel_hak = new Panel();
	Panel panel_name = new Panel();
	Panel panel_kor = new Panel();
	Panel panel_eng = new Panel();
	Panel panel_mat = new Panel();
	Label label_hak = new Label("학번");
	Label label_name = new Label("이름");
	Label label_kor = new Label("국어");
	Label label_eng = new Label("영어");
	Label label_mat = new Label("수학");	
	TextField textField_hak = new TextField(15);
	TextField textField_name = new TextField(15);
	TextField textField_kor = new TextField(15);
	TextField textField_eng = new TextField(15);
	TextField textField_mat = new TextField(15);
	// cetner_east
	TextArea textArea = new TextArea();	
	
	// Dialog 생성
	Dialog dialog = new Dialog(this);
	Button button_ok = new Button("OK");
	Button button_cancel = new Button("CANCEL");
	Label label_dialog = new Label("저장할까요?", Label.CENTER);
	Panel panel_dialog = new Panel();
		
	// ScoreImpl 객체 생성
	Score score = new ScoreImpl();
	
	
	public ScoreForm() {
		// Frame 기본 설정
		setSize(600, 350);
		setTitle("성적관리");
		setLocation(700, 400);
		init();
		start();
		setResizable(false);
		setVisible(true);
	}

	private void init() {
		// Frame 설정
		setLayout(new BorderLayout());
		add("Center", panel_center);
		add("South", panel_south);
		
		/** South */
		panel_south.setLayout(new GridLayout(1, 6));
		panel_south.add(button_input);
		panel_south.add(button_output);
		panel_south.add(button_search_hak);
		panel_south.add(button_search_name);
		panel_south.add(button_save_file);
		panel_south.add(button_read_file);
		button_input.setBackground(Color.YELLOW);
		button_output.setBackground(Color.YELLOW);
		button_read_file.setBackground(Color.YELLOW);
		button_save_file.setBackground(Color.YELLOW);
		button_search_hak.setBackground(Color.YELLOW);
		button_search_name.setBackground(Color.YELLOW);
		
		/** Center */
		panel_center.setLayout(new BorderLayout());
		panel_center.add("West", panel_west);
		panel_center.add("Center", textArea);
		
		
		/* Center West */
		panel_west.setLayout(new GridLayout(6, 1));
		panel_west.add(panel_hak);
		panel_west.add(panel_name);
		panel_west.add(panel_kor);
		panel_west.add(panel_eng);
		panel_west.add(panel_mat);
		// panel_hak 설정
		panel_hak.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel_hak.add(label_hak);
		panel_hak.add(textField_hak);
		// panel_name 설정
		panel_name.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel_name.add(label_name);
		panel_name.add(textField_name);
		// panel_kor 설정
		panel_kor.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel_kor.add(label_kor);
		panel_kor.add(textField_kor);
		// panel_eng 설정
		panel_eng.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel_eng.add(label_eng);
		panel_eng.add(textField_eng);
		// panel_mat 설정
		panel_mat.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel_mat.add(label_mat);
		panel_mat.add(textField_mat);	
		
		// dialog 설정	
		dialog.setTitle("파일 저장");
		dialog.setSize(230, 150);
		dialog.setLocation(900, 500);
		
		dialog.setLayout(new BorderLayout());
		dialog.add("Center", label_dialog);
		dialog.add("South", panel_dialog);
		
		panel_dialog.setLayout(new FlowLayout());
		panel_dialog.add(button_ok);
		panel_dialog.add(button_cancel);
		
		button_ok.setBackground(Color.YELLOW);
		button_cancel.setBackground(Color.YELLOW);
	}
	
	private void start() {
		// x 버튼 이벤트 설정
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// 종료 직전에 데이터를 파일로 저장
				dialog.setVisible(true);				
				//System.exit(0);
			}
		});
		// dialog x버튼 설정
		dialog.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dialog.dispose();
				//dialog.setVisible(false);
			}
		});
		// 버튼 이벤트 설정
		button_input.addActionListener(this);
		button_output.addActionListener(this);
		button_search_hak.addActionListener(this);
		button_search_name.addActionListener(this);
		button_save_file.addActionListener(this);
		button_read_file.addActionListener(this);
		
		button_ok.addActionListener(this);
		button_cancel.addActionListener(this);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button_input) {
			String hak = textField_hak.getText();
			String name = textField_name.getText();
			String str_kor = textField_kor.getText();
			String str_eng = textField_eng.getText();
			String str_mat = textField_mat.getText();
			
			// 입력 검사 : 학번, 이름
			if(hak.equals("") || name.equals("")) {
				textArea.setText("학번과 이름을 입력해주세요.");
				return;		//함수 강제 종료
			}
			// 입력 검사 : 국어, 영어, 수학
			if(str_kor.equals("") || str_eng.equals("") || str_mat.equals("")) {
				textArea.setText("국어, 영어, 수학 점수를 입력해주세요.");
				return;		//함수 강제 종료
			}
			// TextArea 초기화
			textArea.setText("");
			// 형변환 및 연산
			int kor = Integer.parseInt(str_kor);
			int eng = Integer.parseInt(str_eng);
			int mat = Integer.parseInt(str_mat);
			int tot = kor + eng + mat;
			double avg = (double)tot/3;
			// scoreVO 에 저장
			ScoreVO vo = new ScoreVO();
			vo.setHak(hak);
			vo.setName(name);
			vo.setKor(kor);
			vo.setEng(eng);
			vo.setMat(mat);
			vo.setTot(tot);
			vo.setAvg(avg);
			//ScoreImpl의 List에 저장
			String result = score.input(vo);
			textArea.setText(result);
			// 입력창 초기화
			textField_hak.setText("");
			textField_name.setText("");
			textField_kor.setText("");
			textField_eng.setText("");
			textField_mat.setText("");
		}
		else if(e.getSource() == button_output) {
			String result = score.print();
			textArea.setText(result);
		}
		else if(e.getSource() == button_search_hak) {
			String hak = textField_hak.getText();
			// 입력 검사
			if(hak.equals("")) {
				textArea.setText("학번을 입력해주세요.");
				return;		// 함수 강제 종료
			}			
			String result = score.searchHak(hak);
			textArea.setText(result);
			// 화면 초기화
			textField_hak.setText("");
		}
		else if(e.getSource() == button_search_name) {
			String name = textField_name.getText();
			//입력 검사
			if(name.equals("")) {
				textArea.setText("이름을 입력해주세요.");
				return;		// 함수 강제 종료
			}
			String result = score.searchName(name);
			textArea.setText(result);
			// 화면 초기화
			textField_name.setText("");
		}
		else if(e.getSource() == button_save_file) {
			String result = score.write_file();
			textArea.setText(result);
		}
		else if(e.getSource() == button_read_file) {
			String result = score.read_flie();
			textArea.setText(result);
		}
		else if(e.getSource() == button_ok) {
			score.write_file();
			System.exit(0);
		}
		else if(e.getSource() == button_cancel) {
			System.exit(0);
		}
	}

}
