package score;

// 목차 역할(강제상속)
// => 함수의 구성을 한눈에 파악하기 위해서 
public interface Score {
	public void input();		// 입력
	public void print();		// 출력
	public void printTitle();	// 제목 출력
	public void searchHak();	// 검색 : 학번
	public void searchName();	// 검색 : 이름
	public void descSortTot();	// 정렬 : 총점기준, 내림차순
	public void ascSortHak();	// 정렬 : 학번기준, 오름차순
}
