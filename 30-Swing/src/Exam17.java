import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

class Swing17 extends JFrame {
	Container container = getContentPane();
	JLabel label = new JLabel("이것은 탭 패인입니다.");
	JButton button1 = new JButton("확인");
	JButton button2 = new JButton("취소");
	JPanel panelButton = new JPanel();
	
	// tab
	JPanel panel = new JPanel();
	// 아래쪽에 표시되는 tab
	// JTabbedPane.SCROLL_TAB_LAYOUT : 탭이 넘칠 경우 스크롤을 추가하는 기능
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP, 
											JTabbedPane.SCROLL_TAB_LAYOUT);
	JButton tBtn1 = new JButton("첫번째 Tab");
	JButton tBtn2 = new JButton("두번째 Tab");
	JButton tBtn3 = new JButton("세번째 Tab");
	JButton tBtn4 = new JButton("네번째 Tab");
	JButton tBtn5 = new JButton("다섯번째 Tab");
	JButton tBtn6 = new JButton("여섯번째 Tab");
	JButton tBtn7 = new JButton("일곱번째 Tab");
	JButton tBtn8 = new JButton("여덟번째 Tab");
		
	public Swing17() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing17");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);	
		}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", label);
		container.add("Center", panel);
		container.add("South", panelButton);
		// panelButton 구성
		panelButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panelButton.add(button1);
		panelButton.add(button2);
		// panel 구성
		panel.setLayout(new BorderLayout());
		panel.add("Center", tabbedPane);
		
		// tabbedPane 구성
		tabbedPane.add(tBtn1);
		tabbedPane.add(tBtn2);
		tabbedPane.add(tBtn3);
		tabbedPane.add("Title", tBtn4);
		
		// 아이콘 추가
		tabbedPane.addTab("Title1", new ImageIcon("img/middle.gif"), tBtn5, "아이콘");
		tabbedPane.add("Title6", tBtn6);
		tabbedPane.add("Title7", tBtn7);
		tabbedPane.add("Title8", tBtn8);
		// 첫번째 탭의 글자를 "TEST"로 변경
		tabbedPane.setTitleAt(0, "TEST");
		// 두번째 탭 비활성화
		tabbedPane.setEnabledAt(1, false);
		// 세번째 탭 색상(선택되지 않았을때) 설정
		tabbedPane.setBackgroundAt(2, Color.GREEN);
 //전체//tabbedPane.setBackground(Color.GREEN);
		// 네번째 탭 단축키 alt+'a' 설정	=> ascii 코드값으로 설정
		tabbedPane.setMnemonicAt(3, (int)'A');
		// 다섯번째 탭의 글자색을 파란색으로 설정
		tabbedPane.setForegroundAt(4, Color.BLUE);
		// 전체 탭의 글자색을 파란색으로 설정
	 // tabbedPane.setForeground(Color.BLUE);
		
	}

	private void start() {
		// x 버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam17 {
	public static void main(String[] args) {
		new Swing17();
	}
}
