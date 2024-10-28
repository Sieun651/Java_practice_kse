import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScoreFrame extends Frame implements ActionListener {
	// 컨포넌트
	/**center*/
	// Label : 문자열 1개를 보여주는 클래스
	Label labelKor = new Label("국어");
	Label labelEng = new Label("영어");
	Label labelTot = new Label("  총점 : ");
	Label labelAvg = new Label("  평균 : ");
	  // TextField : 문자열 1개 입력받는 클래스
	TextField textFieldKor = new TextField(25);
	TextField textFieldEng = new TextField(25);
	Panel panelKor = new Panel();
	Panel panelEng = new Panel();
	Panel panelBind = new Panel();
	
	/**south*/
	Button buttonInput = new Button("입력");
	Button buttonCancel = new Button("취소");
	Panel panelButton = new Panel();
		
	public ScoreFrame() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("성적계산");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);
	}
	
	private void init() {	
		// Frame 설정
		setLayout(new BorderLayout());
		add("Center", panelBind);
		add("South", panelButton);
		
		// panelButton 설정
		panelButton.setLayout(new GridLayout(1, 2, 3, 0));
		panelButton.add(buttonInput);
		panelButton.add(buttonCancel);
		// button 설정
		buttonInput.setBackground(Color.YELLOW);
		buttonCancel.setBackground(Color.YELLOW);
		
		// panelBind 설정
		panelBind.setLayout(new GridLayout(4, 1, 0, 3));
		panelBind.add(panelKor);
		panelBind.add(panelEng);
		panelBind.add(labelTot);
		panelBind.add(labelAvg);
		
		// panelKor 설정
		panelKor.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelKor.add(labelKor);
		panelKor.add(textFieldKor);
		// panelEng 설정
		panelEng.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelEng.add(labelEng);
		panelEng.add(textFieldEng);
		
	}

	private void start() {	
		// x 버튼 이벤트 설정
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// 입력/취소 버튼
		buttonInput.addActionListener(this);
		buttonCancel.addActionListener(this);
		
		textFieldEng.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == '\n') {
					input();
				}
			}
		});
	}

	public void input() {
		if(textFieldKor.getText().trim().equals("")) {
			return;	// 함수 강제 종료
		}
		if(textFieldEng.getText().trim().equals("")) {
			return;	
		}
		int kor = Integer.parseInt(textFieldKor.getText().trim());
		int eng = Integer.parseInt(textFieldEng.getText().trim());
		int tot = kor + eng;
		double avg = (double)tot / 2;
		labelTot.setText(" 총점 : " + tot);
		labelAvg.setText(" 평균 : " + avg);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonInput) {
			//System.out.println("input button");			//테스트
			input();
		} else if(e.getSource() == buttonCancel) {
			//System.out.println("cancel button");
			textFieldKor.setText("");
			textFieldEng.setText("");
			labelTot.setText("  총점 : ");
			labelAvg.setText("  평균 : ");			
		}
	}
}








