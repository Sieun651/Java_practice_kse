// 2차원 배열
public class Practice7 {
	public static void main(String[] args) {
		int[][] num = {{1,2,3,0},
					   {4,5,6,0},
					   {7,8,9,0},
					   {0,0,0,0}};
		
		for(int i=0; i<num.length; i++) {					// 행
			for(int j=0; j<num[i].length; j++) {			// 열
				System.out.printf("%2s ", num[i][j]);
				if(i!=3) {num[3][j] += num[i][j];}
				if(j!=3) {num[i][3] += num[i][j];}
				num[3][3] = num[3][0] + num[3][1] + num[3][2]; 
				if(j==3) {
					System.out.println();
				}
			}
		}	
	}
}
