package prac2;

public class EmpVO {
	private String name;		//이름
	private int salary;			//연봉
	private String department;	//부서명
	
	public EmpVO() {		
	}
	public EmpVO(String name, int salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "EmpVO [name=" + name + ", salary=" + salary + ", department=" 
															+ department + "]";
	}
	// getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}	
}
