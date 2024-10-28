package thread;

class ThreadExam3 implements Runnable {

	@Override
	public void run() {
		System.out.println("Test thread3");
		for(int i=0; i<58; i++) {
			System.out.print((char)(i+65) + " ");
			if(i%10 == 0) System.out.println(); 	// 문자 10개 출력하고 줄넘김
		}
	}
	
}
public class Test3 {
	public static void main(String[] args) {
		ThreadExam3 threadExam3 = new ThreadExam3();
		Thread thread = new Thread(threadExam3);	//threadExam3의 run함수를 Thread에서 사용 가능
		
		System.out.println("run() 호출전");
		thread.start();	// runnable인터페이스는 start함수가 없기 때문에 Thread 객체를 생성해서 써야함
						// 다중상속을 하기위해서 runnable을 사용하는 것
		for(int i=0; i<500; i++) {
			System.out.print(i + " ");
			if(i%10 == 0) System.out.println(); 	// 숫자 10개 출력하고 줄넘김
		}
		
		System.out.println("run() 호출후");
	}
}
