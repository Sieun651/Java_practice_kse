
class Address {
	String name, phone, address;
	
	Address() {		
	}
	Address(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	void showAddress() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phone);
		System.out.println("주소 : " + address);
	}
}

public class Practice2 {
	public static void main(String[] args) {
		Address a1;
		a1 = new Address("홍길동", "010-1234-5678", "서울시 강남구 역삼동");
		a1.showAddress();
	}
}
// 자동 줄 맞춤 : ctrl + shift + f
// 주석 : ctrl + /