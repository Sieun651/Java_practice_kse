
public class Exam3 {
	static double plus(double x, double y) {
		return x + y;
	}
	static double minus(double x, double y) {
		return x - y;
	}
	public static void main(String[] args) {
		double x = 100.5, y = 200.7;
		double r = plus(x, y);
		System.out.println(x + " + " + y + " = " + r);
		
		r = minus(x,y);
		System.out.println(x + " - " + y + " = " + r);
	}
}
