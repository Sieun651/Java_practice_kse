
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Swing21 extends JFrame implements ChangeListener {
	Container container = getContentPane();
	JLabel labelRGB = new JLabel("RGB(0, 0, 0)", JLabel.CENTER);
	JLabel labelRed = new JLabel("RED");
	JLabel labelGreen = new JLabel("GREEN");
	JLabel labelBlue = new JLabel("BLUE");
	// JSlider(int orientation, int min, int max, int value)
	// => int value : slider의 커서가 처음 위치할 값
	JSlider sliderRed = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider sliderGreen = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider sliderBlue = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	
	JPanel panelColor = new JPanel();	// 색상 보여주기
	JPanel panel = new JPanel();
	JPanel panelWest = new JPanel();
	JPanel panelCenter = new JPanel();
	// 색상 관리 변수
	int r=0, g=0, b=0;
	
	public Swing21() {
		// Frame 기본 설정
		setSize(400, 250);
		setTitle("Swing21");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);			
	}

	private void init() {
		// frame 구성
		container.setLayout(new BorderLayout());
		container.add("North", labelRGB);
		container.add("Center", panelColor);
		container.add("South", panel);
		// labelRGB 설정
		labelRGB.setFont(new Font("돋움체", Font.BOLD, 24));
		// panelColor의 배경색 설정
		panelColor.setBackground(new Color(0, 0, 0));	// 검정색
		
		// panel 구성
		panel.setLayout(new BorderLayout(5, 0));
		panel.add("West", panelWest);
		panel.add("Center", panelCenter);
		// panelWest 구성
		panelWest.setLayout(new GridLayout(3, 1));
		panelWest.add(labelRed);
		panelWest.add(labelGreen);
		panelWest.add(labelBlue);
		// label 글자 색상 설정
		labelRed.setForeground(Color.RED);
		labelGreen.setForeground(Color.GREEN);
		labelBlue.setForeground(Color.BLUE);
		
		// panelCenter 구성
		panelCenter.setLayout(new GridLayout(3, 1));
		panelCenter.add(sliderRed);
		panelCenter.add(sliderGreen);
		panelCenter.add(sliderBlue);
		// slider 설정
		sliderRed.setMajorTickSpacing(50); 		// 슬라이더의 주 눈금 간격 지정
		sliderRed.setMinorTickSpacing(5); 		// 슬라이더의 보조 눈금 간격 지정
		sliderRed.setPaintTicks(true); 			// 슬라이더의 눈금 보이기
		sliderRed.setPaintLabels(true);			// 슬라이더의 숫자 보이기
		
		sliderGreen.setMajorTickSpacing(50); 	// 슬라이더의 주 눈금 간격 지정
		sliderGreen.setMinorTickSpacing(5); 	// 슬라이더의 보조 눈금 간격 지정
		sliderGreen.setPaintTicks(true); 		// 슬라이더의 눈금 보이기
		sliderGreen.setPaintLabels(true);		// 슬라이더의 숫자 보이기
		
		sliderBlue.setMajorTickSpacing(50); 	// 슬라이더의 주 눈금 간격 지정
		sliderBlue.setMinorTickSpacing(5); 		// 슬라이더의 보조 눈금 간격 지정
		sliderBlue.setPaintTicks(true); 		// 슬라이더의 눈금 보이기
		sliderBlue.setPaintLabels(true);		// 슬라이더의 숫자 보이기
		
	}

	private void start() {
		// x 버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		// slider 이벤트 설정
		sliderRed.addChangeListener(this);
		sliderGreen.addChangeListener(this);
		sliderBlue.addChangeListener(this);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if(e.getSource() == sliderRed) {
			r = sliderRed.getValue();
		} else if(e.getSource() == sliderGreen) {
			g = sliderGreen.getValue();
		} else if(e.getSource() == sliderBlue) {
			b = sliderBlue.getValue();
		}
		panelColor.setBackground(new Color(r, g, b));
		labelRGB.setText(String.format("RGB(%d, %d, %d)", r, g, b));
	}
}

public class Exam21 {
	public static void main(String[] args) {
		new Swing21();
	}
}
