package customer2;

public class CustomerVO  {		// 직렬화
	private String cus_Num;
	private String name;
	private String phone;
	
	@Override
	public String toString() {
		return cus_Num + "\t" + name + "\t" + phone;
	}

	// getter setter
	public String getCus_Num() {
		return cus_Num;
	}

	public void setCus_Num(String cus_Num) {
		this.cus_Num = cus_Num;
	}

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
