
public class Exam2 {
	public static void main(String[] args) {
		FileArticle fileArticle = new FileArticle();
		fileArticle.setNum(1);
		fileArticle.setTitle("첫번째 자료 입니다.");
		fileArticle.setFileName("java.ppt");
		System.out.println(fileArticle.toString());
		System.out.println("-------------------");
		
		QNAArticle qnaArticle = new QNAArticle();
		qnaArticle.setNum(2);
		qnaArticle.setTitle("첫번째 질문 입니다.");
		qnaArticle.setAnswer("첫번째 답변 입니다.");
		System.out.println(qnaArticle.toString());
	}
}
