package study.java.model;

// java beans (객체 1개당 고객 1명의 데이터를 저장)
public class People {
	private String name;
	private String phone;
	
	public People() {
	}
	
	public People(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", phone=" + phone + "]";
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
		
}
