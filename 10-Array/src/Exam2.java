// 2차원 배열
public class Exam2 {
	public static void main(String[] args) {
		// 행 : 1차원 배열의 개수, 1차원 레퍼런스 배열의 크기
		// 열 : 1차원 배열의 크기
		int[][] score = new int[3][3];
		String[] name = {"홍길동", "김철수", "이영희"};		
		
		score[0][0] = 75;
		score[0][1] = 82;
		score[0][2] = 95;
		
		score[1][0] = 88;
		score[1][1] = 64;
		score[1][2] = 70;
		
		score[2][0] = 100;
		score[2][1] = 95;
		score[2][2] = 90;
		// 총점과 평균을 구해서 출력
		for(int i=0; i<score.length; i++) {			// 행
			int sum = 0;
			int avg = 0;
			
			for(int j=0; j<score[i].length; j++) {	// 열
				sum += score[i][j];				
			}
			avg = sum / score[i].length;
			
			System.out.printf("%s, 총점= %s, 평균= %s\n", name[i], sum, avg);
		}
	}
}
