package prac3;

import java.util.Scanner;

public class Customer {
	Scanner scanner = new Scanner(System.in);
	CustomerVO[] customerVOs = new CustomerVO[10];
	int customerCnt;
	String fix_name, search_name;
	
	public void input() {
		if(customerCnt<5) {			
			customerVOs[customerCnt] = new CustomerVO();
			System.out.println();
			System.out.print("고객번호 : ");
			customerVOs[customerCnt].setCus_num(scanner.next());  
			System.out.print("이름 : ");
			customerVOs[customerCnt].setName(scanner.next());
			System.out.print("전화번호 : ");
			customerVOs[customerCnt].setPhone(scanner.next());		
			customerCnt++;
			System.out.println();
		} else System.out.println("저장공간이 부족합니다.\n");
	}
	public void output() {
		System.out.println();
		System.out.println("고객번호\t이름\t전화번호");
		for(int i=0; i<customerCnt; i++) {
			System.out.println(customerVOs[i].toString());		
		}
		System.out.println();
	}
	public void fix() {
		System.out.println();
		System.out.print("수정할 이름? ");
		fix_name = scanner.next();
		for(int i=0; i<customerCnt; i++) {
			if(fix_name.equals(customerVOs[i].getName())) {
				System.out.println("고객번호\t이름\t전화번호");
				System.out.println(customerVOs[i].toString());	
				System.out.println();
				System.out.print("고객번호 : ");
				customerVOs[i].setCus_num(scanner.next());  
				System.out.print("이름 : ");
				customerVOs[i].setName(scanner.next());
				System.out.print("전화번호 : ");
				customerVOs[i].setPhone(scanner.next());
				System.out.println();
			} 
		} 
	}
		
	public void search() {
		System.out.println();
		System.out.print("검색할 이름? ");
		search_name = scanner.next();
		for(int i=0; i<customerCnt; i++) {
			if(search_name.equals(customerVOs[i].getName())) {
				System.out.println();
				System.out.println("고객번호\t이름\t전화번호");
				System.out.println(customerVOs[i].toString());
				System.out.println(); break;
			} else System.out.println("고객 없음");			
		}		
	}
}
