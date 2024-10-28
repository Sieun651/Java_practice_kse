// 쓰레드 정식상속 // 메인함수+쓰레드1개
package thread;
class ThreadExam1 extends Thread {
	@Override
	public void run() {
		System.out.println("Test thread1");
		for(int i=0; i<58; i++) {
			System.out.print((char)(i+65) + " ");
			if(i%10 == 0) System.out.println(); 	// 문자 10개 출력하고 줄넘김
		}
	}
}

public class Test1 {
	public static void main(String[] args) {
		ThreadExam1 threadExam1 = new ThreadExam1();
		System.out.println("run() 호출전");
		//threadExam1.run();	// 일반 함수로서 호출
		threadExam1.start();	// run() 함수를 쓰레드로 동작 시킴
		
		for(int i=0; i<500; i++) {
			System.out.print(i + " ");
			if(i%10 == 0) System.out.println(); 	// 숫자 10개 출력하고 줄넘김
		}
		
		System.out.println("run() 호출후");
	}
}
