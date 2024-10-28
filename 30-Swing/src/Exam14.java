import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

class Swing14 extends JFrame {
	Container container = getContentPane();
	String[] strs = {"AAA", "BBB", "CCC", "DDD", "EEE"};
	JList<String> list = new JList<String>(strs);
	JButton button = new JButton("확인");
		
	public Swing14() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Swing14");
		setLocation(700, 400);
		init();
		start();
		setVisible(true);	
		}

	private void init() {
		container.setLayout(new FlowLayout());
		container.add(list);
		container.add(button);
		
		// 문자열 항목 변경
		String[] sss = {"AAA", "BBB", "CCC", "DDD", "EEE", "FFF"};
		list.setListData(sss);
	}

	private void start() {
		// x 버튼
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// list 이벤트 처리
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(e.isPopupTrigger()) {	// 오른쪽 마우스 버튼을 눌렀다 떼면 동작
					List<String> list_str = list.getSelectedValuesList();
					System.out.println(list_str);
				}
			}
		});
		// button 이벤트 처리
		button.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				List<String> list_str = list.getSelectedValuesList();
				System.out.println(list_str);
			}
		});
	}	
}

public class Exam14 {
	public static void main(String[] args) {
		new Swing14();
	}
}
