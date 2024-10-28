
public class Practice2 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
			
			if(i%10 == 1) {		// 1, 11, 21, .... , 91
				System.out.printf("%2d ~ ");
			}
			
			if(i%10 == 0) {		// 10. 20. 30. 
				System.out.printf("%3d = %3d\n", i, sum);
				sum = 0;
			}
		}
	}
}
