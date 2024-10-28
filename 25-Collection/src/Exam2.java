/* List의 특징
   1. 데이터의 순서가 있다.
   2. 데이터의 중복을 허용한다.
   3. 배열처럼 일렬번호로 데이터를 관리한다.(for문을 통한 관리 가능) 
 */

import java.util.ArrayList;
import java.util.List;

public class Exam2 {
	public static void main(String[] args) {
		// 상속된 클래스의 자식 클래스 기준 사용법
		// ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		// 상속된 클래스의 부모 클래스 기준 사용법(주로 많이 쓰임)
		List<Integer> list = new ArrayList<Integer>();
		
		// 1) 저장
		list.add(10);
		// 뒤에 추가
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		// 중간에 삽입
		list.add(2, 60);
		
		System.out.println("데이터 개수 : " + list.size());	// 데이터 개수 확인
		System.out.println("--------------------");
		
		// 2) 읽기
		// 전체 확인
		System.out.println(list);
		System.out.println("--------------------");
		
		// 개별 데이터 확인
		System.out.println(list.get(3));		// 3번 인덱스의 값
		System.out.println("--------------------");
		
		// for문으로 전체 데이터 확인
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------------");		
		
		// 3) 수정
		list.set(4, 500);		// 4번 인덱스의 값을 500으로 변경
		System.out.println(list);
		System.out.println("--------------------");
		
		// 4) 삭제
		// 1개 데이터 삭제
		list.remove(2);			// 2번 인덱스의 값을 삭제
		System.out.println(list);
		System.out.println("--------------------");
		
		// 전체 데이터 삭제
		list.clear();
		System.out.println(list);
		System.out.println("--------------------");
				
	}
}









