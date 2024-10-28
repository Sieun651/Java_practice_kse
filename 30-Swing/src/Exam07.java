import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

class Swing07 extends JFrame {
	Container container = getContentPane();
	// 메뉴
	JMenuBar menuBar = new JMenuBar();
	// 파일 메뉴
	JMenu menuFile = new JMenu("파일");
	JMenuItem fNew = new JMenuItem("새파일");
	ImageIcon img1 = new ImageIcon("img/cat.gif");
	JMenuItem fOpen = new JMenuItem(img1);
	ImageIcon img2 = new ImageIcon("img/dog.gif");
	JMenuItem fExit = new JMenuItem("종료", img2);
	// 수정 메뉴
	JMenu menuEdit = new JMenu("수정");
	JMenu menuEditSize = new JMenu("크기");
	JRadioButtonMenuItem es10 = new JRadioButtonMenuItem("10");
	JRadioButtonMenuItem es20 = new JRadioButtonMenuItem("20");
	JRadioButtonMenuItem es30 = new JRadioButtonMenuItem("30");
	ButtonGroup buttonGroup = new ButtonGroup();
	
	JMenu menuEditColor = new JMenu("색상");
	JCheckBoxMenuItem ecRed = new JCheckBoxMenuItem("RED");
	JCheckBoxMenuItem ecGreen = new JCheckBoxMenuItem("Green");
	JCheckBoxMenuItem ecBlue = new JCheckBoxMenuItem("Blue");
	// 도움말 메뉴
	JMenu menuHelp = new JMenu("도움말");
		
	public Swing07() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing07");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		// Frame에 menubar 추가
		setJMenuBar(menuBar);
		// 1. 파일 메뉴 추가
		menuBar.add(menuFile);
		menuFile.add(fNew);
		menuFile.addSeparator();
		menuFile.add(fOpen);
		menuFile.addSeparator();
		menuFile.add(fExit);		
		// 2. 수정 메뉴 추가
		menuBar.add(menuEdit);
		menuEdit.setBorder(new LineBorder(Color.RED, 2));
		menuEdit.add(menuEditSize);
		menuEdit.addSeparator();
		menuEdit.add(menuEditColor);
		// 크기에 대한 항목 추가
		menuEditSize.setBorder(new BevelBorder(BevelBorder.RAISED));
		menuEditSize.add(es10);
		menuEditSize.add(es20);
		menuEditSize.add(es30);
		
		buttonGroup.add(es10);
		buttonGroup.add(es20);
		buttonGroup.add(es30);
		// 색상에 대한 항목 추가
		menuEditColor.setBorder(new BevelBorder(BevelBorder.RAISED));
		menuEditColor.add(ecRed);
		menuEditColor.add(ecGreen);
		menuEditColor.add(ecBlue);
		// 3. 도움말 메뉴 추가
		menuBar.add(menuHelp);
	}

	private void start() {
		// x 버튼 이벤트
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// fExit 메뉴 이벤트 설정
		fExit.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
		
	}
	
}

public class Exam07 {
	public static void main(String[] args) {
		new Swing07();
	}
}
