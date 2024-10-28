import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Exam3 {
	public static void main(String[] args) {
		String str = "가나다라마바사abcdefg";
		String path = "test3.txt";
		// byte[] 배열로 변경
		byte[] buffer = null;
		try {
			buffer = str.getBytes("utf-8"); 	
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}		
		// 파일 저장
		OutputStream out = null;	//try밖에서도 사용할 수 있게 밖에 입력	
		try {
			 out = new FileOutputStream(path);	//파일만들기 + 파일열기
			 out.write(buffer);		//파일출력
			 System.out.println("[INFO] 파일 저장됨 >> " + path);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 저장 경로를 찾을 수 없습니다.");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 저장에 실패했습니다.");
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERRPR] 알 수 없는 에러가 발생했습니다.");
			//e.printStackTrace();
		} finally {
			try {
				if(out != null) out.close();	// 파일닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
