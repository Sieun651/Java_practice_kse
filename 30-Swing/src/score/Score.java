package score;

import java.util.List;

// 목차 역할(강제상속)
// => 함수의 구성을 한눈에 파악하기 위해서 
public interface Score {
	public String input(ScoreVO vo);		// 입력
	public String print();		// 출력
	public String printTitle();	// 제목 출력
	public String searchHak(String hak);	// 검색 : 학번
	public String searchName(String name);	// 검색 : 이름
	public void descSortTot();	// 정렬 : 총점기준, 내림차순
	public void ascSortHak();	// 정렬 : 학번기준, 오름차순
	public String write_file();	// 파일 저장
	public String read_flie(); 	// 파일 읽기
}
