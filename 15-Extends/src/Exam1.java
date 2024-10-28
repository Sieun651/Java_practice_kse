
public class Exam1 {
	public static void main(String[] args) {
		CalcParent parent = new CalcParent();
		System.out.println(parent.plus(10,20));
		System.out.println(parent.minus(10,20));
		System.out.println("-------------------");
		
		CalcChild child = new CalcChild();
		System.out.println(child.plus(10,20));
		System.out.println(child.minus(10,20));
		System.out.println(child.multiply(10,20));
		System.out.println(child.divide(10,2));
		
	}
}
