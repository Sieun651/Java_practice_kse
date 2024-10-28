import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class Swing16 extends JFrame {
	Container container = getContentPane();
	JLabel label = new JLabel("메모를 하세요");
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane(textArea);
	// 팝업창
	JPopupMenu popupMenu = new JPopupMenu();
	JMenuItem menuItem1 = new JMenuItem("복사");
	JMenuItem menuItem2 = new JMenuItem("붙여넣기");
	JMenuItem menuItem3 = new JMenuItem("잘라내기");
	
	public Swing16() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing16");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);	
		}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", label);
		container.add("Center", scrollPane);
		// 팝업창 구성
		popupMenu.add(menuItem1);
		popupMenu.addSeparator();
		popupMenu.add(menuItem2);
		popupMenu.add(menuItem3);
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// textArea 오른쪽 마우스버튼 클릭 이벤트 처리
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {		//눌렀다 떼면
				if(e.isPopupTrigger()) {					//오른쪽 마우스 버튼
					// e.getX(), e.getY() : 현재 마우스의 위치를 나타냄
					popupMenu.show(textArea, e.getX(), e.getY());	//팝업창을 띄울 위치
				}
			}
		});
		// 팝업 메뉴 이벤트 처리
		menuItem1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				textArea.copy();	//복사
			}
		});
		menuItem2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				textArea.paste();	//붙여넣기
			}
		});
		menuItem3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {		
				textArea.cut();		//잘라내기
			}
		});
	}
}

public class Exam16 {
	public static void main(String[] args) {
		new Swing16();
	}
}
