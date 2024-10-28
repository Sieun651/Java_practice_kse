import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

class Prac1 extends JFrame {
	Container container = getContentPane();
	// 1. 패널_왼쪽
	JPanel panel_left = new JPanel();	
	
	// 1.1 패널_왼쪽_개인정보
	JPanel panel_info = new JPanel();
	JPanel panel_name = new JPanel();
	JPanel panel_p_code = new JPanel();
	JPanel panel_phone = new JPanel();
	JPanel panel_add = new JPanel();
	
	JLabel label_name = new JLabel("이름: ");
	JLabel label_p_code = new JLabel("주민번호: ");
	JLabel label_phone = new JLabel("전화번호: ");
	JLabel label_add = new JLabel("주소: ");
	
	JTextField textField_name = new JTextField(15);
	JTextField textField_p_code1 = new JTextField(7);
	JTextField textField_p_code2 = new JTextField(7);
	JTextField textField_phone = new JTextField(15);
	JTextField textField_add = new JTextField(15);
	
	// 1.2 패널_왼쪽_정보검색
	JPanel panel_search = new JPanel();
	JPanel panel_search1 = new JPanel();
	JPanel panel_search2 = new JPanel();
	JPanel panel_search3 = new JPanel();
	
	JLabel label_search = new JLabel("검색: ");
	JTextField textField_search1 = new JTextField(6);
	JTextField textField_search2 = new JTextField(6);
	JTextArea textArea_search = new JTextArea();
	
	JButton button_L = new JButton("<<");
	JButton button_R = new JButton(">>");
	JButton button_search = new JButton("검색");	
	
	// 2. 패널_개인정보확인
	JPanel panel_info_chk = new JPanel();
	JPanel panel_PA = new JPanel();
	JPanel panel_TA = new JPanel();
	JPanel panel_BT = new JPanel();
	
	JLabel label_explain = new JLabel("<== 이것을 누르면 전체보기가 됩니다.");
	JTextArea textArea_PA = new JTextArea();
	JScrollPane scrollPane = new JScrollPane(textArea_PA);
	
	JButton button_PA = new JButton("전체보기");
	JButton button_enroll = new JButton("등록");
	JButton button_edit = new JButton("수정");
	JButton button_delete = new JButton("삭제");
	JButton button_clear = new JButton("Clear");
	JButton button_save = new JButton("저장");
	JButton button_load = new JButton("로드");
	JButton button_exit = new JButton("종료");	

	public Prac1() {
		// Frame 기본 설정
		setSize(700, 400);
		setTitle("사용자 관리");
		setLocation(800, 400);
		init();
		start();
		setVisible(true);	
	}

	private void init() {
		// 1. frame 구성
		container.setLayout(new BorderLayout(5, 0));
		container.add("West", panel_left);
		container.add("Center", panel_info_chk);
		// 2. panel_left		
		panel_left.setLayout(new GridLayout(2, 1, 0, 5));
		panel_left.add(panel_info);
		panel_left.add(panel_search);
		// 2.1. panel_left_info
		panel_info.setLayout(new GridLayout(4, 1));
		BevelBorder bevelBorder1 = new BevelBorder(BevelBorder.RAISED);
		TitledBorder titledBorder1 = new TitledBorder("개인정보");
		panel_info.setBorder(new CompoundBorder(bevelBorder1, titledBorder1));
		
		panel_info.add(panel_name);
		panel_info.add(panel_p_code);
		panel_info.add(panel_phone);
		panel_info.add(panel_add);
		// 2.1.1. panel_left_info_name
		panel_name.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel_name.add(label_name);
		panel_name.add(textField_name);		
		// 2.1.2. panel_left_info_p_code
		panel_p_code.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel_p_code.add(label_p_code);
		panel_p_code.add(textField_p_code1);
		panel_p_code.add(textField_p_code2);
		// 2.1.3. panel_left_info_phone
		panel_phone.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel_phone.add(label_phone);
		panel_phone.add(textField_phone);
		// 2.1.4. panel_left_add
		panel_add.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel_add.add(label_add);
		panel_add.add(textField_add);		
		
		// 2.2. panel_left_search		
		BevelBorder bevelBorder2 = new BevelBorder(BevelBorder.RAISED);
		TitledBorder titledBorder2 = new TitledBorder("정보검색");		
		panel_search.setBorder(new CompoundBorder(bevelBorder2, titledBorder2));
		
		panel_search.setLayout(new BorderLayout());
		panel_search.add("North", panel_search1);
		panel_search.add("Center", panel_search2);
		panel_search.add("South", panel_search3);
		// 2.2.1. panel_left_search_search1
		panel_search1.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel_search1.add(label_search);
		panel_search1.add(textField_search1);
		panel_search1.add(textField_search2);
		panel_search1.add(button_search);
		button_search.setEnabled(false);
		button_search.setBorder(new BevelBorder(BevelBorder.RAISED));
		// 2.2.2. panel_left_search_search2
		panel_search2.setLayout(new BorderLayout());
		panel_search2.add("Center", textArea_search);
		// 2.2.3. panel_left_search_search3
		panel_search3.setLayout(new FlowLayout());
		panel_search3.add(button_L);
		panel_search3.add(button_R);
		button_L.setEnabled(false);
		button_R.setEnabled(false);
		button_L.setBorder(new BevelBorder(BevelBorder.RAISED));
		button_R.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		// 3. panel_info_chk		
		BevelBorder bevelBorder3 = new BevelBorder(BevelBorder.RAISED);
		TitledBorder titledBorder3 = new TitledBorder("개인정보확인");		
		panel_info_chk.setBorder(new CompoundBorder(bevelBorder3, titledBorder3));
		
		panel_info_chk.setLayout(new BorderLayout());
		panel_info_chk.add("North", panel_PA);
		panel_info_chk.add("Center", panel_TA);
		panel_info_chk.add("South", panel_BT);
		// 3.1. panel_info_chk_PA
		panel_PA.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel_PA.add(button_PA);
		button_PA.setEnabled(false);
		button_PA.setBorder(new BevelBorder(BevelBorder.RAISED));
		panel_PA.add(label_explain);
		// 3.2. panel_info_chk_TA
		panel_TA.setLayout(new BorderLayout());
		panel_TA.add("Center", scrollPane);
		// 3.3. panel_info_chk_BT
		panel_BT.setLayout(new GridLayout(1, 7, 2, 0));
		panel_BT.add(button_enroll);
		panel_BT.add(button_edit);
		panel_BT.add(button_delete);
		panel_BT.add(button_clear);
		panel_BT.add(button_save);
		panel_BT.add(button_load);
		panel_BT.add(button_exit);
		button_enroll.setBorder(new BevelBorder(BevelBorder.RAISED));
		button_edit.setBorder(new BevelBorder(BevelBorder.RAISED));
		button_delete.setBorder(new BevelBorder(BevelBorder.RAISED));
		button_clear.setBorder(new BevelBorder(BevelBorder.RAISED));
		button_save.setBorder(new BevelBorder(BevelBorder.RAISED));
		button_load.setBorder(new BevelBorder(BevelBorder.RAISED));
		button_exit.setBorder(new BevelBorder(BevelBorder.RAISED));
		button_enroll.setEnabled(false);
		button_edit.setEnabled(false);
		button_delete.setEnabled(false);
		button_clear.setEnabled(false);
		button_save.setEnabled(false);		
	}

	private void start() {
		// x 버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}	
}

public class Practice1 {
	public static void main(String[] args) {
		new Prac1();
	}
}
