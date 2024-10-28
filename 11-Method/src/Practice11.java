import java.util.Scanner;
// workspace복습
public class Practice11 {	
	static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**************");
		System.out.println("1. 입고");
		System.out.println("2. 출고");
		System.out.println("3. 목록");
		System.out.println("4. 종료");
		System.out.println("**************");
		System.out.printf("메뉴 : ");
		return sc.nextInt();
	}
	static void in_goods(int ip, String[] name, int[] gaesu, int[] price) {
		Scanner sc = new Scanner(System.in);
		System.out.print("품명 : ");
		name[ip] = sc.next();
		System.out.print("수량 : ");
		gaesu[ip] = sc.nextInt();
		System.out.print("단가 : ");
		price[ip] = sc.nextInt();
		System.out.println();
		
		
	}
	static void out_goods(int ip, int cul, String[] name, int[] gaesu) {
		Scanner sc = new Scanner(System.in);
		System.out.print("품명 : ");
		String str = sc.next();
		for(int i=0; i<name.length; i++) {
			if(name[i].equals(str)) {		
				System.out.print("수량 : ");
				gaesu[i] -= sc.nextInt(); break;
					
			} 
		}	
	}
	static void compute(int ip, int cul, int[] gaesu, int[] price, int[] tot) {
		tot[ip] = gaesu[ip]*price[ip]; 
		tot[cul] = gaesu[cul]*price[cul];
		
	}
	static void output_list(int ip, int cul, String[] name, int[] gaesu, int[] price, int[]tot) {
		System.out.printf("%s     %s     %s     %s", "품명", "수량", "단가(원)", "총액(원)\n");
		for(int i=0; i<name.length; i++) {
			System.out.printf("%s     %s         %s         %s\n", name[i], gaesu[i], price[i], tot[i]);
		}
	}
	public static void main(String[] args) {
		//선언
		String[] name = new String[5];
		int[] gaesu = new int[5];
		int[] price = new int[5];
		int[] tot = new int[5];
		int ip=0, cul=0;
		
		int num=0;
		//입력
		while(true) {
			num = menu();
		
		
			switch(num) {
			case 1: in_goods(ip, name, gaesu, price);				
					compute(ip, cul, gaesu, price, tot);
					ip++; break;
			case 2: out_goods(ip, cul, name, gaesu);
					compute(ip, cul, gaesu, price, tot); 
					 break;
			case 3: output_list(ip, cul, name, gaesu, price, tot); break;
			case 4: System.out.println(); 
					System.out.print("프로그램 종료");
					System.exit(0);
		}
		
		}
		
	}
}
