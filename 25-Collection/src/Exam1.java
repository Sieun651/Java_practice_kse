import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Map
// => (key, value)로 데이터 저장
// -> key값의 중복을 허락하지 않음
// =>저장된 데이터의 순서가 없음

public class Exam1 {
	public static void main(String[] args) {
		// 제너릭(Generic) : 클래스에 어떤 데이터를 사용할지를 설정하는 것
		// Map<String, Integer> : 키값으로는 문자열, 저장데이터는 정수를 쓰겠다고 설정
		// => key : 일반적으로 정수, 문자열 사용(알아보기 쉬움)
		// => value : 모든 데이터
		Map<String, Integer> map = new HashMap<String, Integer>();
		// 1) 저장
		map.put("aaa", 111);
		map.put("bbb", 222);
		map.put("ccc", 333);
		
		System.out.println("데이터 수 : " + map.size());	// 저장된 데이터 개수 확인
		System.out.println("--------------------");
		
		// 2) 읽기
		System.out.println(map);	// 전체 데이터 확인(순서없이 출력됨)(toString)
		System.out.println("--------------------");
		System.out.println(map.get("aaa"));	// 개별 데이터 확인
		System.out.println(map.get("bbb"));
		System.out.println(map.get("ccc"));
		System.out.println("--------------------");
		System.out.println(map.keySet());	// 키값만 확인 
		System.out.println("-----ddd---------------");

		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.printf("key : %s, value : %s\n", key, map.get(key));
		}
		System.out.println("--------------------");
		
		// 3) 수정
		map.put("aaa", 555);			// 저장과 수정
		System.out.println(map);
		System.out.println("--------------------");
		
		map.replace("bbb", 777);		// 수정
		System.out.println(map);
		System.out.println("--------------------");
		
		// 4) 삭제
		// 1개 삭제
		map.remove("aaa");
		System.out.println(map);
		System.out.println("--------------------");
		// 전체 삭제
		map.clear();
		System.out.println(map);
		System.out.println("--------------------");
	}
}
