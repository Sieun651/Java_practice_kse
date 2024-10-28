//정식상속
class Member implements MySite {
	@Override
	public void write() {
	}
	
	@Override
	public void delete() {
	}
}

//약식상속
public class Exam5 {
	public static void main(String[] args) {
		MySite mySite = new MySite() {	//대괄호부터
			
			@Override
			public void write() {
				System.out.println("새 글 쓰기");
			}
			
			@Override
			public void delete() {
				System.out.println("글 삭제");
			}
		};	//대괄호까지 자식클래스(약식클래스, 무명클래스)
		mySite.write();
		mySite.delete();
		System.out.println("----------------------");
		
		MySite member = new MySite() {
			
			@Override
			public void write() {
				System.out.println("회원 가입");
			}
			
			@Override
			public void delete() {
				System.out.println("회원 탈퇴");
			}
		};
		member.write();
		member.delete();
	}
}
