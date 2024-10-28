import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

class Prac2 extends JFrame implements ActionListener {
	Container container = getContentPane();
	// toolBar
	JToolBar toolBar = new JToolBar();
	JButton button1 = new JButton("1번");
	JButton button2 = new JButton(new ImageIcon("img/middle.gif"));
	JButton button3 = new JButton("3번");
	JButton button4 = new JButton("4번");
	
	// tabbedPane
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP, 
												JTabbedPane.SCROLL_TAB_LAYOUT);
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	
	JTextArea textArea1 = new JTextArea();
	JScrollPane scrollPane1 = new JScrollPane(textArea1);
	JTextArea textArea2 = new JTextArea();
	JScrollPane scrollPane2 = new JScrollPane(textArea2);
	JTextArea textArea3 = new JTextArea();
	JScrollPane scrollPane3 = new JScrollPane(textArea3);
	JTextArea textArea4 = new JTextArea();
	JScrollPane scrollPane4 = new JScrollPane(textArea4);
	
	public Prac2() {
		// Frame 기본 설정
		setSize(300, 250);
		setTitle("Swing");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);	
	}

	private void init() {
		// frame
		container.setLayout(new BorderLayout(0, 5));
		container.add("North", toolBar);
		container.add("Center", tabbedPane);
		// toolBar
		toolBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		toolBar.add(button1);
		toolBar.addSeparator();
		toolBar.add(button2);
		toolBar.addSeparator();
		toolBar.add(button3);
		toolBar.add(button4);
		// tabbedPane
		tabbedPane.add("1번 채널", panel1);
		tabbedPane.add("2번 채널", panel2);
		tabbedPane.add("3번 채널", panel3);
		tabbedPane.add("4번 채널", panel4);
		panel1.setBackground(Color.BLACK);
		panel2.setBackground(Color.RED);
		panel3.setBackground(Color.GREEN);
		panel4.setBackground(Color.BLUE);
		
		panel1.setLayout(new BorderLayout());
		panel1.add("Center", scrollPane1);
		panel2.setLayout(new BorderLayout());
		panel2.add("Center", scrollPane2);
		panel3.setLayout(new BorderLayout());
		panel3.add("Center", scrollPane3);
		panel4.setLayout(new BorderLayout());
		panel4.add("Center", scrollPane4);
	}

	private void start() {
		// x버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 버튼 이벤트 설정
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			tabbedPane.setSelectedIndex(0);
		} else if(e.getSource() == button2) {
			tabbedPane.setSelectedIndex(1);
		} else if(e.getSource() == button3) {
			tabbedPane.setSelectedIndex(2);
		} else if(e.getSource() == button4) {
			tabbedPane.setSelectedIndex(3);
		} 
		
	}
}

public class Practice2 {
	public static void main(String[] args) {
		new Prac2();
	}
}
