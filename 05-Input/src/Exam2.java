// 사용준비1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam2 {
	public static void main(String[] args) throws Exception {
		// 사용준비2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 선언
		String name;
		int kor, eng, mat, tot;
		
		// 입력
		System.out.print("이름 : ");
		name = br.readLine();
		
		System.out.print("국어 : ");
		// br.readLine() : buffer로부터 문자열 1개 읽어오기
		// Integer.parseInt(문자열) : 숫자로 된 문자열을 정수로 바꾸기
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("영어 : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("수학 : ");
		mat = Integer.parseInt(br.readLine());
		
		//연산
		tot = kor + eng + mat;
		
		// 출력
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + tot);
	}
}
