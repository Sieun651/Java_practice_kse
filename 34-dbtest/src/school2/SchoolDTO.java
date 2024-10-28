package school2;

public class SchoolDTO {
	private String name;
	private String value;
	private int code;
	
	public SchoolDTO() {
	}

	public SchoolDTO(String name, String value, int code) {
		super();
		this.name = name;
		this.value = value;
		this.code = code;
	}

	@Override
	public String toString() {
		String str = "";
		if(code == 1) str = String.format("이름:%s\t학번:%s", name, value);
		if(code == 2) str = String.format("이름:%s\t과목:%s", name, value);
		if(code == 3) str = String.format("이름:%s\t부서:%s", name, value);
		return str;
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
}
