import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

class Swing10 extends JFrame implements ActionListener {
	Container container = getContentPane();
	JButton button1 = new JButton("색 선택");
	JButton button2 = new JButton("파일 선택");
	JColorChooser colorChooser = new JColorChooser();
	JFileChooser fileChooser = new JFileChooser("D://");	// 시작 폴더 설정
	Color color = Color.GREEN;
		
	public Swing10() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing10");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);	}

	private void init() {
		container.setLayout(new FlowLayout());
		container.add(button1);
		container.add(button2);
	}

	private void start() {
		// x 버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// button 이벤트 설정
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			execColorChooser();
		} else if(e.getSource() == button2) {
			execFileChooser();
		}
	}

	private void execColorChooser() {		//this로 프레임에 종속
		color = colorChooser.showDialog(this, "나의 색상 선택", color);
		// System.out.println("선택한 색상 = " + color);
		// 기본 색상 설정해놓기
		colorChooser.setColor(color);
	}

	private void execFileChooser() {
		fileChooser.setDialogTitle("불러오기");
		fileChooser.setMultiSelectionEnabled(true);		//파이 다중선택 설정
		fileChooser.showDialog(this, "열기");
		// 파일 확인
		File[] files = fileChooser.getSelectedFiles();	// 여러개 선택일 경우
		//File file = fileChooser.getSelectedFile();		// 1개 선택일 경우(setMultiSelectionEnabled(false)인경우)
		for(int i=0; i<files.length; i++) {
			System.out.println("파일명 = " + files[i]);
		}
	}
	
}

public class Exam10 {
	public static void main(String[] args) {
		new Swing10();
	}
}
