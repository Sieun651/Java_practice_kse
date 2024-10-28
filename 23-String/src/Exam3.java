
public class Exam3 {
	public static void main(String[] args) {
		String per = "9006071234567";
		String year = per.substring(0, 2);
		String month = per.substring(2, 4);
		String day = per.substring(4, 6);
		String sex = per.substring(6, 7);
		int birth = 0;		
		
		switch(sex) {
		case "1": birth=19; sex ="남자";  break;
		case "2": birth=19; sex ="여자";  break;
		case "3": birth=20; sex ="남자";  break;
		case "4": birth=20; sex ="여자";  break;		
		}
		
		System.out.printf("%s%s년 %s월 %s일 %s", birth, year, month, day, sex);		
	}
}
//workspace 다른풀이
