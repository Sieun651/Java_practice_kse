import helper.FileHelper;

public class Exam5 {
	public static void main(String[] args) {
		String encType = "utf-8";
		String path = "myfile.txt";
		String content = "안녕하세요. 자바 프로그래밍";
		
		boolean result = FileHelper.getInstance().write(path, content, encType);
		if(result) {
			System.out.println("저장 성공");
		} else {
			System.out.println("저장 실패");
		}
		
		String read = FileHelper.getInstance().read(path, encType);
		if(read != null) {
			System.out.println(read);
		} else {
			System.out.println("파일 읽기 실패");
		}
	}
}
