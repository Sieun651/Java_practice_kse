//private 처리된 멤버변수에 데이터 저장,출력시 setter, getter 함수 사용
package test;


public class Exam3 {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("홍길동");
		student.setAge(25);
		
		System.out.println("이름 : " + student.getName());
		System.out.println("나이 : " + student.getAge());
		
		
		//studnet.name = "홍길동";
		//studnet.age = 25;
		
		//System.out.println("이름 : " + studnet.name);
		//System.out.println("나이 : " + studnet.age);
	}
}
