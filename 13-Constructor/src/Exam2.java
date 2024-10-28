
class Article {
	int seq;
	String subject;
	String writer;
	
	Article() {			//직접만들어줘야함
		
	}
	
	Article(int seq, String subject, String writer) {
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	void print() {
		System.out.println(seq);
		System.out.println(subject);
		System.out.println(writer);
	}
}

public class Exam2 {	
	public static void main(String[] args) {
		Article article = new Article(1, "자바는 객체 지향 언어입니다.", "자바강사");
		article.print();
		Article article2 = new Article(); //생성자가 이미 만들어진 경우 default생성자는 자동생성X
		article2.print();					//직접만들어줘야함
	}
}
