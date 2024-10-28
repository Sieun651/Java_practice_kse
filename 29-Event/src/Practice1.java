import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Event extends Frame implements ActionListener, WindowListener {
	Button button1 = new Button("버튼1");
	Button button2 = new Button("버튼2");
	
	public Event() {
		setSize(300, 200);
		setTitle("Event 클래스 이용");
		setLocation(800, 500);
		init();
		start();
		setVisible(true);		
	}
	
	private void init() {	
		setLayout(null);
		add(button1);
		add(button2);
		
		button1.setBackground(Color.YELLOW);
		button1.setBounds(67, 95, 80, 30);
		button2.setBackground(Color.GREEN);
		button2.setBounds(153, 95, 80, 30);
	}
	private void start() {		
		button1.addActionListener(this);
		button2.addActionListener(this);
		this.addWindowListener(this);
//		this.addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}	
}

public class Practice1 {
	public static void main(String[] args) {
		new Event();
	}
}
//windowlistener 다중 interface로 x도 똑같이 되나