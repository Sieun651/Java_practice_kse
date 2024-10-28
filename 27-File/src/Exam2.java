import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exam2 {
	public static void main(String[] args) {
		String str = "가나다라마바사abcdefg";
		String path = "test2.txt";
		
		// 파일 출력 : 파일 만들기 + 파일에 데이터 쓰기
		try {
			FileWriter fileWriter = new FileWriter(path);	// 파일만들기 + 파일 열기
			fileWriter.write(str);	// 출력 작업
			fileWriter.close();		// 파일 닫기
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 파일 입력 : 파일이 존재하는지 확인 + 파일 읽기
		try {
			FileReader fileReader = new FileReader(path);	// 파일 열기
			// 문자로 1글자씩 읽어옴
			int data = 0;
			String result = "";
			while(true) {
				data = fileReader.read();	// 문자 1개를 uni code로 읽어옴(정수)
				if(data == -1) break;	// -1 : EOF (end of file)
				else {
					result += (char)data;
				}				
			}
			System.out.println(result);
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
