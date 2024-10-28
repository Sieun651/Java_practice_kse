package prac1;

public class Salary {
	String name;	//이름
	int salary;		//연봉
	
	public Salary(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public void viewInformation() {
		System.out.println("이름 : " + name);
		System.out.println("연봉 : " + salary);		
	}
}
