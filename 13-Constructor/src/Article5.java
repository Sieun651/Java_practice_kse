// 게시판 프로그램에서 1개 게시글의 데이터를 저장하는 용도로 사용하는 클래스
// 여러개 데이터를 묶어서 관리하기 위한 java beans
public class Article5 {
	private int seq;			// 글 번호
	private String subject;		// 글 제목
	private String content;		// 글 내용
	private String writer;		// 작성자
	private int hit;			// 조회수
	private String regDate;		// 작성일시
	
	public Article5() {
	}
	public Article5(int seq, String subject, String content, String writer, int hit, String regDate) {
		super();
		this.seq = seq;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.hit = hit;
		this.regDate = regDate;
	}
	
	// 모든 멤버변수 값 확인
	// 주로 테스트용으로 멤버변수에 데이터가 잘 저장되었는지 확인하는 용도로 사용함
	@Override
	public String toString() {
		return "Article5 [seq=" + seq + ", subject=" + subject + ", content=" + content + ", writer=" + writer
				+ ", hit=" + hit + ", regDate=" + regDate + "]";
	}
	// getter & setter
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}	
}
