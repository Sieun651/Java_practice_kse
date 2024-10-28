import java.util.Random;

public class Practice5 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		// 선언
		char[] ch = new char[50];
		int[] alpha = new int[26];
		
		// 입력
		for(int i=0; i<ch.length; i++) {
			ch[i] = (char)(rd.nextInt(26)+65);
		}	
		// 연산
		for(int i=0; i<ch.length; i++) {
			// 알파벳 : 'A' ~ 'Z' (65~90) => 26개
			for(int j=0; j<alpha.length; j++) {
				if(ch[i] == j+65) alpha[j]++;
			}			
		}
		// 출력	
		for(int i=0; i<ch.length; i++) {
			System.out.printf("%s ", ch[i]);
			if(i%10==9) System.out.println();
		}	
		// count 출력
		System.out.println();
		for(int i=0; i<alpha.length; i++) {
			System.out.printf("%s : %s\n", (char)(i+65), alpha[i]);
		}					
	}
}
// workspace 확인
// 어려운문제