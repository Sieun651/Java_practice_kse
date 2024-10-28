package customer2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CustomerImpl implements Customer {
	Scanner scanner = new Scanner(System.in);
	List<CustomerVO> list = new ArrayList<CustomerVO>();
	// //변수2개
	ObjectInOut objectInOut = new ObjectInOut();
	String path = "customer2.txt";

	@Override
	public void input() {
		CustomerVO customerVO = new CustomerVO();
		System.out.print("고객번호 : ");
		customerVO.setCus_Num(scanner.next());
		System.out.print("이   름 : ");
		customerVO.setName(scanner.next());
		System.out.print("전화번호 : ");
		customerVO.setPhone(scanner.next());
		
		list.add(customerVO);
		System.out.println();
	}

	@Override
	public void output() {
		System.out.println("고객번호\t이름\t전화번호");
		for(int i=0; i<list.size(); i++) {
			CustomerVO customerVO = list.get(i);
			System.out.println(customerVO.toString()); 
		}		
		System.out.println();
	}

	@Override
	public void searchCus_Num() {
		System.out.print("검색할 고객번호? ");
		String cus_Num = scanner.next();	
		System.out.println();
		
		System.out.println("고객번호\t이름\t전화번호");
		for(int i=0; i<list.size(); i++) {
			CustomerVO customerVO = list.get(i);
			if(customerVO.getCus_Num().equals(cus_Num))
				System.out.println(customerVO.toString());
		}
		System.out.println();
		
	}

	@Override
	public void searchName() {
		System.out.print("검색할 이름? ");
		String name = scanner.next();
		System.out.println();
		
		System.out.println("고객번호\t이름\t전화번호");
		// 부분 이름으로 검색
		for(int i=0; i<list.size(); i++) {
			CustomerVO customerVO = list.get(i);
			if(customerVO.getName().indexOf(name) >= 0)
				System.out.println(customerVO.toString());
		}
		// 풀네임검색
//		for(int i=0; i<list.size(); i++) {
//			CustomerVO customerVO = list.get(i);
//			if(customerVO.getName().equals(name))
//				System.out.println(customerVO.toString());
//		}
		System.out.println();
	}

	@Override
	public void searchPhone() {
		System.out.print("검색할 전화번호? ");
		String phone = scanner.next();
		System.out.println();
		
		System.out.println("고객번호\t이름\t전화번호");
		// 부분 번호로 검색
		for(int i=0; i<list.size(); i++) {
			CustomerVO customerVO = list.get(i);
			if(customerVO.getPhone().indexOf(phone) >= 0)
				System.out.println(customerVO.toString());
		}
		// 전체 번호로 검색
//		for(int i=0; i<list.size(); i++) {
//			CustomerVO customerVO = list.get(i);
//			if(customerVO.getPhone().equals(phone))
//				System.out.println(customerVO.toString());
//		}
		System.out.println();
	}

	@Override
	public void descSortName() {
		// 1) 정렬기준
		Comparator<CustomerVO> comparator = new Comparator<CustomerVO>() {	// 약식상속

			@Override
			public int compare(CustomerVO o1, CustomerVO o2) {
				return o2.getName().compareTo(o1.getName());		//내림차순
			}
		};
		// 2) 정렬
		list.sort(comparator);
		
		// 3) 출력
		output();
	}

	@Override
	public void ascSortCus_Num() {
		Comparator<CustomerVO> comparator = new Comparator<CustomerVO>() {
			
			@Override
			public int compare(CustomerVO o1, CustomerVO o2) {
				return o1.getCus_Num().compareTo(o2.getCus_Num());		//오름차순
			}
		};
		
		list.sort(comparator);
		output();
	}
	// //추상메소드 추가 구현
	@Override
	public void file_save() {				//파일저장		
		boolean result = objectInOut.write(path,list, "utf-8");
		if(result) {
			System.out.println("파일 저장 성공\n");
		} else {
			System.out.println("파일 저장 실패");
		}
	}

	@Override
	public void file_read() {				//파일읽기		
		list = objectInOut.read(path, "utf-8");
		if(list.size() > 0) {
			System.out.println("파일 읽기 성공\n");
		} else { 
			System.out.println("읽어올 데이터가 없습니다.");
		}
	}
}






