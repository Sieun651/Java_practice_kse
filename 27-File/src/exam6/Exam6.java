package exam6;

import java.util.ArrayList;
import java.util.List;

public class Exam6 {
	public static void main(String[] args) {
		ObjectInOut objectInOut = new ObjectInOut();
		List<StudentVO> list = new ArrayList<StudentVO>();
		String path = "Student.txt";
		
		list.add(new StudentVO("홍길동", 25, "수원"));
		list.add(new StudentVO("김철수", 27, "장흥"));
		list.add(new StudentVO("이영희", 26, "울산"));
		list.add(new StudentVO("고길동", 35, "강릉"));
		
		// 파일에 저장
		boolean result = objectInOut.write(path, list);
		if(result) {
			System.out.println("저장 성공");
		} else {
			System.out.println("저장 실패");
		}
		
		// 파일에서 읽어오기
		List<StudentVO> list_result = objectInOut.read(path);
		for(int i=0; i<list_result.size(); i++) {
			System.out.println(list_result.get(i).toString());
		}
	}
}
