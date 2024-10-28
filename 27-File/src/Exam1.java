import java.io.File;
import java.io.IOException;

public class Exam1 {
	public static void main(String[] args) {
		// 1. 파일
		File f1 = new File("src/Main01.java");
		System.out.println(f1);		//상대경로
		System.out.println("-------------------");
		
		// 1) 절대 경로 확인
		System.out.println("절대경로 : " + f1.getAbsolutePath());	//절대경로
		System.out.println("-------------------");
		
		// 2) 저장된 경로가 파일인지 검사
		// => 파일이 존재하지 않으면 무조건 false 
		System.out.println("is_File : " + f1.isFile());
		System.out.println("-------------------");
		
		// 3) 저장된 경로가 폴더인지 검사
		// => 폴더가 존재하지 않으면 무조건 false 
		System.out.println("is_Directory : " + f1.isDirectory());
		System.out.println("-------------------");
		
		// 4) 저장된 경로가 숨김형태인지 검사
		// => 파일이나 폴더가 존재하지 않으면 무조건 false
		System.out.println("is_Hidden : " + f1.isHidden());
		System.out.println("-------------------");
		
		// 5) 파일 또는 폴더가 실제로 존재하는지 검사
		System.out.println("존재 여부 : " + f1.exists());
		System.out.println("-------------------");
		
		// 6) 파일 만들기
		try {
			f1.createNewFile();
		} catch (IOException e) {
			System.out.println("HDD에 문제가 있습니다.");
			e.printStackTrace();
		}
		System.out.println("존재 여부 : " + f1.exists());
		System.out.println("-------------------");
		
		// 7) 파일 삭제하기
		// => 파일 삭제 후, 성공하면 true 실패하면 false 리턴
		if(f1.delete()) {
			System.out.println("파일 삭제 성공");
		} else {
			System.out.println("파일 삭제 실패");
		}
		System.out.println("존재 여부 : " + f1.exists());
		System.out.println("-------------------");
		
		// 2. 폴더
		File f2 = new File("a/b/c/target");
		
		System.out.println("절대경로 : " + f2.getAbsolutePath());
		System.out.println("is_File : " + f2.isFile());
		System.out.println("is_Directory : " + f2.isDirectory());
		System.out.println("is_Hidden : " + f2.isHidden());
		System.out.println("존재 여부 : " + f2.exists());
		System.out.println("-------------------");
		
		// 1) 폴더 만들기
		f2.mkdir();		// 중간에 존재하지 않는 폴더가 있을 경우 폴더를 생성안함
		System.out.println("존재 여부 : " + f2.exists());
		System.out.println("-------------------");
		
		f2.mkdirs();	// 중간에 존재하지 않는 폴더까지 다 생성함
		System.out.println("존재 여부 : " + f2.exists());
		System.out.println("-------------------");
		
		// 2) 폴더 삭제
		// => 마지막 폴더만 삭제됨
		if(f2.delete()) {
			System.out.println("폴더 삭제 성공");
		} else {
			System.out.println("폴더 삭제 실패");
		}
		System.out.println("존재 여부 : " + f2.exists());
		System.out.println("-------------------");
		
		// 3) 마지막 "/" 이후의 경로 얻기
		System.out.println(f1.getName());
		System.out.println(f2.getName());
		System.out.println("-------------------");
		// 4) 처음부터 마지막 "/" 이전까지 경로 얻기
		System.out.println(f1.getParent());
		System.out.println(f2.getParent());
	}
}





