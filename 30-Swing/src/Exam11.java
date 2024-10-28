import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class Swing11 extends JFrame {
	Container container = getContentPane();
	JLabel label = new JLabel("메모장", JLabel.CENTER);
	JButton button1 = new JButton("확인");
	JButton button2 = new JButton("취소");
	// JTextArea는 JScrollPane과 같이 사용하는 것이 좋음
	// => JTextArea는 스크롤 기능이 없기 떄문
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane(textArea);
	JPanel panelButton = new JPanel();
	
	public Swing11() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing11");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);	
		}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", label);
		container.add("Center", scrollPane);
		container.add("South", panelButton);
		
		panelButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panelButton.add(button1);
		panelButton.add(button2);		
	}

	private void start() {
		// x 버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// textArea 이벤트 설정
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {	// 클릭
				if(e.getClickCount() == 2) {			// 더블클릭 인식
					textArea.paste();	// 붙여넣기
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {	// 마우스를 뗄때
				if(e.isPopupTrigger()) {		// 오른쪽 마우스버튼을 뗄때 인식
					textArea.setText("홍길동");
				}
			}
		});
	}
}

public class Exam11 {
	public static void main(String[] args) {
		new Swing11();
	}
}
