import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		    //4의배수		   이면서	 100의배수가아닌	      400의배수
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {		//윤년
			System.out.print(year + "년은 윤년입니다.");
		} else {																//평년
			System.out.print(year + "년은 평년입니다.");			
		}
	}
}
/* if() {
 * } else {
 * }
 * 
 */
