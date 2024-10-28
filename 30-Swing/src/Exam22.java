import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
// Runnable : 쓰레드 인터페이스 
// => Run() 1개로 구성
// => Thread 대신 사용하는 인터페이스
class Swing22 extends JFrame implements ActionListener, Runnable {
	Container container = getContentPane();
	JLabel label = new JLabel("Progress Bar");
	// JProgressBar(int orientation, int min, int max)
	JProgressBar progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
	JButton buttonStart = new JButton("시작");
	JButton buttonEnd = new JButton("멈춤");
	JPanel panel = new JPanel();
	// 진행 상태 관리 변수
	boolean progress = false;   // true : 진행중, false : 멈춤
	int num = 0;  // 0~100 사이값 저장		
		
	public Swing22() {
		// Frame 기본설정
		setSize(300, 200);
		setTitle("Swing22");
		setLocation(800, 400);
		init();
		start();
		setVisible(true);			
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", label);
		container.add("Center", progressBar);
		container.add("South", panel);
		// progressBar 설정
		progressBar.setStringPainted(true);  // 문자열 출력 설정
		progressBar.setString("0%");
		// panel 구성
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel.add(buttonStart);
		panel.add(buttonEnd);
		buttonEnd.setEnabled(false);  // 비활성화
	}

	private void start() {
		// x버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 버튼 이벤트 설정
		buttonStart.addActionListener(this);
		buttonEnd.addActionListener(this);
	}

	@Override
	public void run() {		
		if(num == 100) num = 0;
		for(int i=num; i<=100; i++) {
			// progress=false일 경우, for문이 종료되고, run 함수의 동작도 종료됨
			// 그렇기 때문에 start버튼이 눌릴때마다 
			// 새롭게 thread 객체를 생성해서 run()함수를 구동시켜야함
			if(!progress) break;  
			try {
				Thread.sleep(50);  // 50ms 지연
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			num = i;
			progressBar.setValue(i);  // progressBar를 숫자만큼 채움
			progressBar.setString(i + "%");
		}
		
		buttonStart.setEnabled(true); // 활성화
		buttonEnd.setEnabled(false);  // 비활성화
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonStart) {
			progress = true;  // 진행중 상태	
			Thread thread = new Thread(this);
			thread.start();   	// run() 함수를 쓰레드로 구동시킴
			// run() 함수가 동작될 동안 버튼 비활성화시킴
			buttonStart.setEnabled(false);  // 비활성화 
			buttonEnd.setEnabled(true);  	// 활성화
		} else if(e.getSource() == buttonEnd) {
			progress = false;	// 멈춤 상태
			buttonStart.setEnabled(true);   // 활성화 
			buttonEnd.setEnabled(false);  	// 비활성화
		}
	}
}

public class Exam22 {
	public static void main(String[] args) {
		new Swing22();
	}
}
