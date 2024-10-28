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
	
	// 입력
	@Override
	public void input() {
		ScoreVO vo = new ScoreVO();
		System.out.print("학번 : ");
		vo.setHak(scanner.next());
		System.out.print("이름 : ");
		vo.setName(scanner.next());
		System.out.print("국어 : ");
		vo.setKor(scanner.nextInt());
		System.out.print("영어 : ");
		vo.setEng(scanner.nextInt());
		System.out.print("수학 : ");
		vo.setMat(scanner.nextInt());
		
		int tot = vo.getKor() + vo.getEng() + vo.getMat();
		double avg = (double) tot/3;
		vo.setTot(tot);
		vo.setAvg(avg);
		// 리스트에 학생 1명 데이터 저장
		list.add(vo);
	}
	// 출력
	@Override
	public void print() {
		printTitle();
		for(int i=0; i<list.size(); i++) {
			ScoreVO vo = list.get(i);
			System.out.println(vo.toString());
		}
	}
	// 제목 출력
	@Override
	public void printTitle() {
		String str = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t", 
					"학번", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.println(str);
	}
	// 검색 : 학번
	@Override
	public void searchHak() {
		System.out.print("검색할 학번 : ");
		String hak = scanner.next();
		
		printTitle();
		for(int i=0; i<list.size(); i++) {
			ScoreVO vo = list.get(i);
			if(vo.getHak().equals(hak)) {				
				System.out.println(vo.toString());
			}
		}
	}
	// 검색 : 이름
	@Override
	public void searchName() {
		System.out.print("검색할 이름: ");
		String name = scanner.next();
		
		printTitle();
		for(int i=0; i<list.size(); i++) {
			ScoreVO vo = list.get(i);
			if(vo.getName().equals(name)) {
				System.out.println(vo.toString());
			}
		}
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
	
}








