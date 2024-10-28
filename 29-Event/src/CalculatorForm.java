import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalculatorForm extends Frame implements ActionListener {
	// 컴포넌트
	TextField textField = new TextField("0");		//north
	
	Panel panelNum = new Panel();					//center
	Button[] buttons = new Button[16];				
	
	Button buttonResult = new Button("=");			//south
	//버튼 16개에 들어갈 문자열 설정
	String[] strs_num = {"7", "8", "9", "/",
						 "4", "5", "6", "*",
						 "1", "2", "3", "-",
						 "0", "+/-", ".", "+"};
	// 계산 관련 변수들
	String input = "";			// 숫자 1세트 저장
	boolean positive = true;	// 음수, 양수 판단용 : true(양수), false(음수)
	double num1, num2, result;	// 숫자2개와 결과값 저장
	String op;					// 연산자 저장
	int point_cnt = 0;			// 소수점 버튼 클릭 횟수 저장
	
	public CalculatorForm() {
		// Frame 기본 설정
		setSize(250, 200);
		setTitle("계산기");
		setLocation(700, 400);
		init();
		start();
		setResizable(false); 	//화면크기고정
		setVisible(true);
		
				
	}

	private void init() {
		// frame 설정
		setLayout(new BorderLayout());
		add("North", textField);
		add("Center", panelNum);
		add("South", buttonResult);
		
		// textField, buttonResult 설정
		textField.setEditable(false); 			// 입력금지
		buttonResult.setForeground(Color.BLUE);
		
		// panelNum 설정
		panelNum.setLayout(new GridLayout(4, 4, 4, 4));
		panelNum.setBackground(Color.LIGHT_GRAY);
		// 버튼추가
		for(int i=0; i<buttons.length; i++) {
			buttons[i] = new Button(strs_num[i]);
			panelNum.add(buttons[i]);
			buttons[i].setForeground(Color.BLUE);
		}
	}

	private void start() {
		// x 버튼 
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		// button 이벤트 설정(모든 버튼 클릭이 actionPerformed 호출)
		for(int i=0; i<buttons.length; i++) {
			buttons[i].addActionListener(this);
		}
		buttonResult.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttons[0]) {			// "7"
			input += "7";
		} else if(e.getSource() == buttons[1]) {	// "8"
			input += "8";
		} else if(e.getSource() == buttons[2]) {	// "9"
			input += "9";
		} else if(e.getSource() == buttons[3]) {	// "/"
			if(input.equals("")) return;			//input값이 없으면 강제종료
			num1 = Double.parseDouble(input);
			op = "/";
			input = "";		 //초기화
			positive = true;	// positive 초기화
			point_cnt = 0;		// 소수점자리 초기화
		} else if(e.getSource() == buttons[4]) {	// "4"
			input += "4";
		} else if(e.getSource() == buttons[5]) {	// "5"
			input += "5";
		} else if(e.getSource() == buttons[6]) {	// "6"
			input += "6";
		} else if(e.getSource() == buttons[7]) {	// "*"
			if(input.equals("")) return;
			num1 = Double.parseDouble(input);
			op = "*";
			input = "";		 //초기화
			positive = true;	// positive 초기화
			point_cnt = 0;
		} else if(e.getSource() == buttons[8]) {	// "1"
			input += "1";
		} else if(e.getSource() == buttons[9]) {	// "2"
			input += "2";
		} else if(e.getSource() == buttons[10]) {	// "3"
			input += "3";
		} else if(e.getSource() == buttons[11]) {	// "-"
			if(input.equals("")) return;
			num1 = Double.parseDouble(input);
			op = "-";
			input = "";		 //초기화
			positive = true;	// positive 초기화
			point_cnt = 0;
		} else if(e.getSource() == buttons[12]) {	// "0"
			input += "0";
		} else if(e.getSource() == buttons[13]) {	// "+/-"
			if(positive) {	// 양수를 음수로 변경
				input = "-" + input;
				positive = false;
			} else {		// 음수롤 양수로 변경
				input = input.substring(1);
				positive = true;
			}
		} else if(e.getSource() == buttons[14]) {	// "."
			if(point_cnt == 0) {		// 소수점은 1개만 출력되어야함
				input += ".";
				point_cnt++;
			}
		} else if(e.getSource() == buttons[15]) {	// "+"
			if(input.equals("")) return;
			num1 = Double.parseDouble(input);
			op = "+";
			input = "";		 //초기화
			positive = true;	// positive 초기화
			point_cnt = 0;
		} else if(e.getSource() == buttonResult) {	// "="
			if(input.equals("")) return;
			num2 = Double.parseDouble(input);
			switch(op) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/": if(num2 != 0) {
						result = num1 / num2;
					  } else {
						  result = 0;
					  }
			
			}
			textField.setText(String.valueOf(result));		//반드시 문자열만 사용해야함
			//초기화
			input = "";		 //초기화
			positive = true;	// positive 초기화
			num1 = num2 = 0;
			point_cnt = 0;
			return;		//함수 강제 종료
		} 
		// input에 저장된 문자열을 textField로 출력
		textField.setText(input);
		
	}
	
}
