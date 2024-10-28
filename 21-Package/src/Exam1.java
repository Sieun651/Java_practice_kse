import study.java.bbs.Article;		//다른 패키지 안의 클래스는 import 하지 않으면 사용할 수 없다.
									//또는 패키지 풀네임으로 사용(비효율적)
public class Exam1 {
	public static void main(String[] args) {
		Article.setCategory("자유게시판");
		Article a1 = new Article(1, "첫번째 글 제목입니다.", "2024-04-10");
//import안한경우 //study.java.bbs.Article a1 = new ~ ;
		Article a2 = new Article(2, "두번째 글 제목입니다.", "2024-04-11");
		Article a3 = new Article(3, "세번째 글 제목입니다.", "2024-04-12");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println("-------------------");
		
		Article.setCategory("공지사항");
		Article a4 = new Article(1, "첫번째 공지사항입니다.", "2024-04-10");
		Article a5 = new Article(2, "두번째 공지사항입니다.", "2024-04-11");
		Article a6 = new Article(3, "세번째 공지사항입니다.", "2024-04-12");
		System.out.println(a4.toString());
		System.out.println(a5.toString());
		System.out.println(a6.toString());		
	}
}
