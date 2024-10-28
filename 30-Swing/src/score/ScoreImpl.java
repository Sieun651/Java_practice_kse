package score;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {
	Scanner scanner = new Scanner(System.in);
	// 전체 학생 데이터를 저장할 리스트
	List<ScoreVO> list = new ArrayList<ScoreVO>();	
	// 파일 입출력 클래스
	ObjectInOut oji = new ObjectInOut();
	String path = "Score.txt";
	
	public ScoreImpl() {
		read_flie();		//프로그램 시작하자마자 파일을 읽어와서 초기화
	}
	
	// 입력
	@Override
	public String input(ScoreVO vo) {
		int before = list.size();
		// 리스트에 학생 1명 데이터 저장
		list.add(vo);
		String result = "입력 실패";
		if(list.size() > before) {
			result = "입력 성공";
		}
		return result;
	}
	// 출력
	@Override
	public String print() {
		String result = printTitle() + "\n";
		for(int i=0; i<list.size(); i++) {
			ScoreVO vo = list.get(i);
			result += vo.toString() + "\n";
		}
		return result;
	}
	// 제목 출력
	@Override
	public String printTitle() {
		String str = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t", 
					"학번", "이름", "국어", "영어", "수학", "총점", "평균");
		return str;
	}
	// 검색 : 학번
	@Override
	public String searchHak(String hak) {	
		boolean isHak = false;		//flag변수( true:있음, false:없음 )
		String result = printTitle() + "\n";
		for(int i=0; i<list.size(); i++) {
			ScoreVO vo = list.get(i);
			if(vo.getHak().equals(hak)) {				
				result += vo.toString() + "\n";
				isHak = true;
			}
		}
		if(!isHak) result = null;		// 검색된 학번이 없음
		return result;
	}
	// 검색 : 이름
	@Override
	public String searchName(String name) {	
		boolean isName = false;
		String result = printTitle() + "\n";
		for(int i=0; i<list.size(); i++) {
			ScoreVO vo = list.get(i);
			if(vo.getName().equals(name)) {
				result += vo.toString() + "\n";
				isName = true;
			}
		}
		if(!isName) result = null;
		return result;
	}
	// 정렬 : 총점기준, 내림차순
	@Override
	public void descSortTot() {
		// 정렬 기준 설정 : 총점(숫자데이터)
		Comparator<ScoreVO> comparator = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot()? 1 : -1;
			}
		};
		// 정렬
		//Collections.sort(list, comparator); // 아래함수와 똑같은 기능
		list.sort(comparator);
		// 출력
		print();
	}
	// 정렬 : 학번기준, 오름차순
	@Override
	public void ascSortHak() {
		// 정렬 기준 설정 : 학점(문자열데이터)
		Comparator<ScoreVO> comparator = new Comparator<ScoreVO>() {
			
			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getHak().compareTo(vo2.getHak());
			}
		};
		// 정렬
		//Collections.sort(list, comparator);		
		list.sort(comparator);
		// 출력
		print();
	}
	// 파일 저장 
	@Override
	public String write_file() {
		boolean result = oji.write(path, list);
		if(result) {
			return "파일 저장 성공";
		} else {
			return "파일 저장 실패";
		}
	}
	// 파일 읽기
	@Override
	public String read_flie() {
		list = oji.read(path);
		if(list.size() > 0) {
			return "파일 읽기 완료";
		} else {
			return "파일 읽기 실패";
		}
	}
	
}








