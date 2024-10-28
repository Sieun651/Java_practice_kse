package school;

import java.util.List;
import java.util.Scanner;

public class SchoolController {
	Scanner sc = new Scanner(System.in);
	SchoolDAO dao = new SchoolDAO();
	
	public void input() {
		System.out.println("*****************");
		System.out.println("  1. 학생");
		System.out.println("  2. 교수");
		System.out.println("  3. 관리자");
		System.out.println("  4. 이전메뉴");
		System.out.println("*****************");
		System.out.print(" 번호선택 : ");
		int code = sc.nextInt();
		String name="";
		String value="";
		int result = 0;
		SchoolDTO dto = new SchoolDTO();
		
		System.out.println();
		switch(code) {		
		case 1: System.out.print("이름입력 : ");
				name = sc.next();
				System.out.print("학번입력 : ");
				value = sc.next();
				dto = new SchoolDTO(name, value, code);
				result = dao.insertInfo(dto);
				
				if(result > 0) {
					System.out.println("저장성공");
				} else {
					System.out.println("저장실패");
				}
				break;				
		case 2: System.out.print("이름입력 : ");
				name = sc.next();
				System.out.print("과목입력 : ");
				value = sc.next();
				dto = new SchoolDTO(name, value, code);
				result = dao.insertInfo(dto);
				
				if(result > 0) {
					System.out.println("저장성공");
				} else {
					System.out.println("저장실패");
				}
				break;
		case 3: System.out.print("이름입력 : ");
				name = sc.next();
				System.out.print("부서입력 : ");
				value = sc.next();
				dto = new SchoolDTO(name, value, code);
				result = dao.insertInfo(dto);
				
				if(result > 0) {
					System.out.println("저장성공");
				} else {
					System.out.println("저장실패");
				}
				break;
		case 4: break;
		}
		System.out.println();
	}
	
	public void search() {
		System.out.println("*****************");
		System.out.println("  1. 이름 검색");
		System.out.println("  2. 전체 검색");
		System.out.println("  3. 이전메뉴");
		System.out.println("*****************");
		System.out.print(" 번호선택 : ");
		int code = sc.nextInt();
		
		System.out.println();
		switch(code) {
		case 1: System.out.print("검색할 이름 입력 : ");
				String name = sc.next();
				
				List<SchoolDTO> list = dao.selectName(name);
				
				for(int i=0; i<list.size(); i++) {
					list.get(i);
					switch(list.get(i).getCode()) {
					case 1: System.out.println("이름=" + list.get(i).getName() + "  학번=" + list.get(i).getValue());
							break;
					case 2: System.out.println("이름=" + list.get(i).getName() + "  과목=" + list.get(i).getValue());
							break;
					case 3: System.out.println("이름=" + list.get(i).getName() + "  부서=" + list.get(i).getValue());
							break;
					}					
				}
				break;
		case 2: List<SchoolDTO> list2 = dao.selectAll();
				for(int i=0; i<list2.size(); i++) {
					list2.get(i);
					switch(list2.get(i).getCode()) {
					case 1: System.out.println("이름=" + list2.get(i).getName() + "  학번=" + list2.get(i).getValue());
							break;
					case 2: System.out.println("이름=" + list2.get(i).getName() + "  과목=" + list2.get(i).getValue());
							break;
					case 3: System.out.println("이름=" + list2.get(i).getName() + "  부서=" + list2.get(i).getValue());
							break;
					}					
				}
				break;
		case 3: break;
		}
	}
	
	public void delete() {
		System.out.print("삭제를 원하는 이름 입력 : ");
		String name = sc.next();
		int result =  dao.deleteArticle(name);
		
		if(result > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제  실패");
		}
		System.out.println();
	}

}
