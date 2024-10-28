package exam6;

import java.io.Serializable;

// java beans
public class StudentVO implements Serializable {
	private String name;
	private int age;
	private String addr;
	
	public StudentVO() {
		
	}
	public StudentVO(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}	
}
