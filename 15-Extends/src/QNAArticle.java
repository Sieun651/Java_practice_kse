
public class QNAArticle extends Article {
	private String answer;

	
	
	@Override
	public String toString() {
		return "질문/답변 [번호=" + getNum() + ", 제목=" + getTitle() + ", 답변=" + answer + "]";
	}

	//getter setter
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
