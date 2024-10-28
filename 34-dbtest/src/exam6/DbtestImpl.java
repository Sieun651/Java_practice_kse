// 실제 기능들을 처리하는 클래스
package exam6;

import java.util.List;
import java.util.Scanner;

public class DbtestImpl implements Dbtest {
	Scanner sc = new Scanner(System.in);
	DbtestDAO dao = new DbtestDAO();

	@Override
	public void input() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		DbtestDTO dto = new DbtestDTO(name, age, height, null);
		int result = dao.insertArticle(dto);
		
		if(result > 0) {
			System.out.println("저장 성공");
		} else {
			System.out.println("저장 실패");
		}
	}

	@Override
	public void printlAll() {
		List<DbtestDTO> list = dao.selectArticle();
		System.out.printf("%s\t%s\t%s\t%s\n", "이름", "나이", "키", "등록일");
		
		for(int i=0; i<list.size(); i++) {
			DbtestDTO dto = list.get(i);
			System.out.println(dto.toString());
		}
	}

	@Override
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		
		DbtestDTO dto = dao.selectOne(name);
		if(dto != null) {
			System.out.printf("%s\t%s\t%s\t%s\n", "이름", "나이", "키", "등록일");
			System.out.println(dto.toString());
		} else {
			System.out.println(name + "님의 정보가 없습니다.");
		}
	}

	@Override
	public void modifyAge() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		int result = dao.updateArticle(name, age);
		
		if(result > 0) {
			System.out.println("수정 성공");
		} else {
			System.out.println("수정 실패");
		}
	}

	@Override
	public void delete() {
		System.out.print("삭제할 이름 : ");
		String name = sc.next();
		
		int result = dao.deleteArticle(name);
		
		if(result > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
	}

	@Override
	public void endPgm() {
		System.out.println("프로그램 종료");
		System.exit(0);
	}

}
