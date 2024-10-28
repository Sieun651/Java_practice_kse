
class Student {
	String name = "홍길동";
	int age = 25;
}

public class Exam1 {
	public static void main(String[] args) {
		Student student = new Student();   //객체명은 일반적으로 클래스명의 소문자 사용(편리함)
		System.out.println(student.name);
		System.out.println(student.age);
		
		student.name = "김철수";
		student.age = 30;
		System.out.println(student.name);
		System.out.println(student.age);
		
	}
}
