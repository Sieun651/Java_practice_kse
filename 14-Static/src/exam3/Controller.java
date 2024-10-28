package exam3;

import java.util.Scanner;

// personVO 객체를 관리하는 클래스
public class Controller {
	Scanner scanner = new Scanner(System.in);
	PersonVO[] arr = new PersonVO[5];		// 객체 배열 : 클래스 레퍼런스 배열
	int personCnt = 0;	// 객체의 개수를 관리하는 변수
	
	void input() {
		if(personCnt <5) {
			arr[personCnt] = new PersonVO();
			System.out.print("이름 : ");
			arr[personCnt].setName(scanner.next());
			System.out.print("나이 : ");
			arr[personCnt].setAge(scanner.nextInt());
			System.out.print("전화 : ");
			arr[personCnt].setTel(scanner.next());
			
			personCnt++;
		} else {
			System.out.println("인원은 5명까지 입니다.");
		}
	}
	
	void output() {
		for(int i=0; i<personCnt; i++) {
			System.out.println(arr[i].toString());
		}
	}
}
