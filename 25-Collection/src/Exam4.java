import java.util.ArrayList;
import java.util.List;
import study.java.model.People;	

public class Exam4 {
	public static void main(String[] args) {
		List<People> list = new ArrayList<People>();
		
		// 데이터 저장
		People p1 = new People("홍길동", "010-1234-5678");
		list.add(p1);
		People p2 = new People("김철수", "010-2345-6789");
		list.add(p2);
		People p3 = new People("이영희", "010-3456-7890");
		list.add(p3);
		People p4 = new People("고길동", "010-4567-8901");
		list.add(p4);
		People p5 = new People("김길동", "010-5678-9012");
		list.add(p5);
		
		// 데이터 출력
		for(int i=0; i<list.size(); i++) {
			People people = list.get(i);
			System.out.println(people.toString());
		}
		
		// 홍길동 데이터 수정
		People people = list.get(0);
		people.setPhone("010-5555-7777");
		
		// 데이터 출력
		for(int i=0; i<list.size(); i++) {
			People people1 = list.get(i);
			System.out.println(people1.toString());
		}
	}
}
