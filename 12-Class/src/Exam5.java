
class Member{
	String name;
	int age;
	
	void setName(String name) {
		this.name = name;		//멤버변수와 매개변수의 이름이 같은 경우 this. 반드시 적어줘야함
	}
	String getName() {
		return name;
	}
	void setAge(int age) {
		this.age = age;
	}
	int getAge() {
		return age;
	}
	void say() {
		System.out.println(name);
		System.out.println(age);
	}
}

public class Exam5 {
	public static void main(String[] args) {
		Member member = new Member();
		member.setName("홍길동");
		member.setAge(25);
		member.say();
	}
}
