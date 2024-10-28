
public class Exam3 {
	public static void main(String[] args) {
		int x = 30;
		
		class Inner3 {
			int y = 40;
			
			void output() {
				System.out.println("x = " + x);
				System.out.println("y = " + y);
			}
		}
		
		Inner3 inner3 = new Inner3();
		inner3.output();
	}
}
