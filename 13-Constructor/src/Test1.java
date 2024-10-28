import test.Student;

public class Test1 {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("홍길동");
		student.setAge(25);
		
		System.out.println("이름 : " + student.getName());
		System.out.println("나이 : " + student.getAge());
	}
}
