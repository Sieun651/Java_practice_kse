package prac3;

public class CustomerVO {
	private String name;
	private String cus_num;
	private String phone;
			
	@Override
	public String toString() {
		return cus_num + "\t" + name + "\t" + phone;
	}
	
	// getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCus_num() {
		return cus_num;
	}
	public void setCus_num(String cus_num) {
		this.cus_num = cus_num;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
