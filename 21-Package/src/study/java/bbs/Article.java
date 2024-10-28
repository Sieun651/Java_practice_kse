package study.java.bbs;

public class Article {
	private static int count = 0;	// 전체 게시물 수 저장
	private static String category;	// 게시물 분류 저장
	
	private int num;				// 글 번호
	private String title;			// 글 제목
	private String regDate;			// 작성일
	
	public Article(int num, String title, String regDate) {
		super();
		this.num = num;
		this.title = title;
		this.regDate = regDate;
		Article.count++;
	}

	@Override
	public String toString() {
		return "글분류=" + category + ", 전체 글 수=" + count +
				", Article [num=" + num + ", title=" + title + ", regDate=" + regDate + "]";
	}

	// getter setter
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Article.count = count;
	}
	public static String getCategory() {
		return category;
	}
	public static void setCategory(String category) {
		Article.category = category;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}	
}
