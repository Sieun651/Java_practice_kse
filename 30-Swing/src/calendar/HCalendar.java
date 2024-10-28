package calendar;

import java.awt.Color;
import java.util.Calendar;

import javax.swing.JButton;

public class HCalendar {
	JButton[] buttons;
	Calendar calendar = Calendar.getInstance();
	int year, month;
	
	public HCalendar(JButton[] buttons) {
		this.buttons = buttons;
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH) + 1;
	}
	// Label에 출력할 년월 문자열
	public String getCalText() {
		return year + "년 " + month + "월";
	}
	// 버튼에 날짜 출력
	public void printDays() {
		calendar.set(year, month-1, 1); 	// 그 달의 1일로 날짜 변경
		// 요일 수 읽어오기 (일:1, ~ 토:7)
		int dayNum = calendar.get(Calendar.DAY_OF_WEEK);
		// 그 달의 총 일 수
		int totalDays = calendar.getActualMaximum(Calendar.DATE);
		
		for(int i=1; i<=totalDays; i++) {
			// 그 달의 1일은 buttons[6 + (요일수-1) + i]
			buttons[6 + (dayNum -1) + i].setText(String.valueOf(i));
			switch(month) {
			case 1: 
				if(i==1) buttons[6 + (dayNum -1) + i].setForeground(Color.RED);
				break;
			case 3: 
				if(i==1) buttons[6 + (dayNum -1) + i].setForeground(Color.RED);
				break;
			case 5: 
				if(i==5) buttons[6 + (dayNum -1) + i].setForeground(Color.RED);
				break;
			case 6: 
				if(i==6) buttons[6 + (dayNum -1) + i].setForeground(Color.RED);
				break;
			case 8: 
				if(i==15) buttons[6 + (dayNum -1) + i].setForeground(Color.RED);
				break;
			case 10: 
				if(i==3) buttons[6 + (dayNum -1) + i].setForeground(Color.RED);
				if(i==9) buttons[6 + (dayNum -1) + i].setForeground(Color.RED);				
				break;
			case 12: 
				if(i==25) buttons[6 + (dayNum -1) + i].setForeground(Color.RED);
				break;
			}
		}		
	}
	
	// 달력을 새로운 년월로 계산하기
	public void allInit(int gap) {
		// 년월 수정
		month += gap;
		if(month<=0) {
			month = 12;
			year--;
		} else if(month>=13) {
			month = 1;
			year++;
		}
		// 버튼의 날짜 지우기
		for(int i=7; i<buttons.length; i++) {
			buttons[i].setText("");
			
			// 글자색 설정 : 토요일, 일요일이 아닐 경우 검정색으로 변경
			if(!(i%7 == 0 || i%7 == 6))
				buttons[i].setForeground(Color.BLACK);
						
			if(i%7 == 6) {	//토요일
				buttons[i].setForeground(Color.BLUE);
			}
		}
		// 새로운 날짜 출력
		printDays();
		
	}

}
