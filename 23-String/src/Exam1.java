
public class Exam1 {
	public static void main(String[] args) {
		// Index : 위치값
		// 			   01 234567890123
		String str1 = "자바 Programming";
		String str2 = new String("Java");
		System.out.println(str1);
		System.out.println(str2.toString());
		System.out.println("----------------");
		
		// 1) 문자열의 길이를 조회
		int len_str1 = str1.length();
		int len_str2 = str2.length();
		System.out.println("len_str1 = " + len_str1);
		System.out.println("len_str2 = " + len_str2);
		System.out.println("----------------");
		
		// 2) 특정 문자열이 처음으로 나타나는 위치 조회 (왼쪽 -> 오른쪽)
		System.out.println(str1.indexOf(" "));	// 공백문자가 처음 나타나는 위치
		System.out.println(str2.indexOf("a"));
		System.out.println("----------------");
		
		// 3) 특정 문자열이 나타나는 마지막 위치를 조회 (오른쪽 -> 왼쪽)
		System.out.println(str1.lastIndexOf("ra"));
		System.out.println(str2.lastIndexOf("a"));
		System.out.println(str2.lastIndexOf("z"));	//없는 문자를 찾으면 -1이 나옴
		System.out.println("----------------");		
		
		// 4) A를 B로 변경하기
		String new_str1 = str1.replace(" ", "_");	//공백문자를 언더바문자로 변경
		String new_str2 = str2.replace("a", "A");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(new_str1);
		System.out.println(new_str2);
		System.out.println("----------------");
		
		// 5) 대소문자 변경
		String upper = str1.toUpperCase();
		String lower = str2.toLowerCase();
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(upper);
		System.out.println(lower);		
		System.out.println("----------------");
		
		// 6) 문자열의 앞뒤 공백 제거
		String str3 = "     enjoy java programming     ";
		System.out.println(str3 + "tttt");
		System.out.println(str3.trim() + "tttt");
		System.out.println(str3.replace(" ", "")+"tttt");
		System.out.println("----------------");
		
		// 7) 문자열의 비교하기
		boolean isSame = str1.equals(str2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(isSame);
		
		if(str1.equals("test")) {
			System.out.println("문자열이 같습니다.");
		} else {
			System.out.println("문자열이 다릅니다.");
		}
		System.out.println("----------------");
		
		// 8) 문자열을 자르기
		// substring(start, end) : start 위치부터 (end-1)위치까지의 문자열을 잘라내서 읽어옴
		String sub_str1 = str1.substring(2, 6);
		String sub_str2 = str1.substring(6);
		System.out.println(str1);
		System.out.println(sub_str1);
		System.out.println(sub_str2);
		System.out.println("----------------");
		
		// 9) 서식문자로 문자열 만들기
		// %d, %f, %s, %c, %b
		String str4 = String.format("%d년 %02d월 %02d일", 2024, 4, 12);
		System.out.println(str4);
		System.out.println("----------------");
		
		// 10) 주어진 글자를 기준으로 잘라내어서 배열로 만들기
		String str5 = "c++/java/c#/javascript/python";
		String[] data = str5.split("/");
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
