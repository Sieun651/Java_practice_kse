class Charactor {
	String name;
	int age;
}
public class Exam2 {
	public static void main(String[] args) {
		
		// 일반 객체 1개 
		Charactor d = new Charactor();
		d.name = "둘리";
		d.age = 19;
		
		Charactor h = new Charactor();
		h.name = "희동";
		h.age = 3;
		
		System.out.println("이름 : " + d.name + ", 나이 : " + d.age);
		System.out.println("이름 : " + h.name + ", 나이 : " + h.age);
		
		System.out.println("----------------------");
		
		// 객체 배열
				Charactor[] charactor = new Charactor[2];
				charactor[0] = new Charactor();
				charactor[1] = new Charactor();
				
				charactor[0].name = "둘리";
				charactor[0].age = 19;
				
				charactor[1].name = "희동";
				charactor[1].age = 3;
				
				for(int i=0; i<charactor.length; i++) {
					System.out.println("이름 : " + charactor[i].name + ", 나이 : " + charactor[i].age);
				}				
	}
}
