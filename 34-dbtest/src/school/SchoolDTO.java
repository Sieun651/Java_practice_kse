package school;

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
		return "SchoolDTO [name=" + name + ", value=" + value + ", code=" + code + "]";
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
