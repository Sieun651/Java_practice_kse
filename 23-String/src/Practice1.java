
public class Practice1 {
	public static void main(String[] args) {
		String a = "D:/photo/2021/travel/food.jpg";
		
		int position = a.lastIndexOf("/");
		
		System.out.println("파일이름 : " + a.substring(position+1, position+5));
		System.out.println("확장자 : " + a.substring(position+6));
		System.out.println("파일이름 : " + a.substring(0, position));
				
	}
}
// workspace 다른 풀이