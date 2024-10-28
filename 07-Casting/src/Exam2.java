// 강제 형변환
public class Exam2 {
	public static void main(String[] args) {
	
		double d = 1234567890123456789L;
		float f = (float)d;
		long l = (long)f;
		int i = (int)l;
		short s = (short)i;	
	
	
	System.out.println("s = " + s);
	System.out.println("i = " + i);
	System.out.println("l = " + l);
	System.out.println("f = " + f);
	System.out.println("d = " + d);
	System.out.println("----------------");
	}
}
