// 쓰레드 약식상속 // 메인함수+쓰레드1개
package thread;

public class Text2 {
	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("Test thread1");
				for(int i=0; i<58; i++) {
					System.out.print((char)(i+65) + " ");
					if(i%10 == 0) System.out.println(); 	// 문자 10개 출력하고 줄넘김
				}
			}
		};
		
		System.out.println("run() 호출전");		
		thread.start();
		
		for(int i=0; i<500; i++) {
			System.out.print(i + " ");
			if(i%10 == 0) System.out.println(); 	// 숫자 10개 출력하고 줄넘김
		}
		
		System.out.println("run() 호출후");
	}
}
