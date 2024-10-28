import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.text.DateFormatSymbols;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
											// 상태가 바뀌면 이벤트 실행
class Swing20 extends JFrame implements ChangeListener {
	Container container = getContentPane();
	JSpinner spinner1 = new JSpinner();
	JSpinner spinner2 = new JSpinner();
	JSpinner spinner3 = new JSpinner();
	
	JPanel panel = new JPanel();
	// spinner에 사용할 컴포넌트
	JTextField textField = new JTextField();
	// 1월 ~ 12월 설정
	DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
	String[] strings = dateFormatSymbols.getMonths();	// 1월~12월 문자배열 얻기
	SpinnerListModel spinnerListModel = new SpinnerListModel(strings);
	// 현재 컴퓨터의 날짜값을 읽어오기
	SpinnerDateModel spinnerDateModel = new SpinnerDateModel();
	// 0~100 사이의 숫자값으로, 50을 기본값으로 나타내고, 2씩 증가 또는 감소
	SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(50, 0, 100, 2);
	
	
	public Swing20() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing20");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);	
		
		System.out.println(strings[0] + ", " + strings[1]);
		}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", panel);
		
		// panel 구성
		panel.setLayout(new GridLayout(3, 1));
		panel.add(spinner1);
		panel.add(spinner2);
		panel.add(spinner3);
		// spinner 설정
		// spinner1 : 1월~12월 설정
		spinner1.setModel(spinnerListModel);
		// spinner2 : 날짜 설정
		spinner2.setModel(spinnerDateModel);
		// spinner3 : 숫자 설정
		spinner3.setModel(spinnerNumberModel);
	}

	private void start() {
		// x 버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// spinner 이벤트 설정
		spinner1.addChangeListener(this);
		spinner2.addChangeListener(this);
		spinner3.addChangeListener(this);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if(e.getSource() == spinner1) {
			System.out.println(spinner1.getValue());
		} else if(e.getSource() == spinner2) {
			System.out.println(spinner2.getValue());
		} else if(e.getSource() == spinner3) {
			System.out.println(spinner3.getValue());
		} 
	}
}

public class Exam20 {
	public static void main(String[] args) {
		new Swing20();
	}
}
