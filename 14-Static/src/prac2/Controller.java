package prac2;

import java.util.Scanner;

public class Controller {
	Scanner scanner = new Scanner(System.in);
	EmpVO[] empVO = new EmpVO[5];
	
	int num, personCnt;
	
	public void input_num() {
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 종료");
			System.out.print("\n번호 입력 : ");
			num = scanner.nextInt();
			switch(num) {
			case 1: input_info(); break;
			case 2: output(); break;
			case 3: System.out.println(); 
					System.out.println("프로그램종료"); 
					System.exit(0);
			}
		}
	}
	public void input_info() {
		if(personCnt<5) {
			empVO[personCnt] = new EmpVO();
			System.out.println();
			System.out.print("이름 : ");
			empVO[personCnt].setName(scanner.next());
			System.out.print("연봉 : ");
			empVO[personCnt].setSalary(scanner.nextInt());
			System.out.print("부서 : ");
			empVO[personCnt].setDepartment(scanner.next());
			personCnt++;		//직원수증가
			System.out.println();
		} else {
			System.out.println("인원은 5명까지 입니다.");
		}
	}
	public void output() {
		for(int i=0; i<personCnt; i++)
			System.out.println(empVO[i].toString());
	}
}
