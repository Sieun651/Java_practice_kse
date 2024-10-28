import java.util.Random;
import java.util.Scanner;

// 6/45 로또
// 1. 번호 1세트 생성 : 1~45, 번호가 중복되면 안됨
// 2. 번호 1세트 정렬
public class Lotto {
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	private int[] m = new int[6];	// 로또 번호 1세트 저장
	private int buyNum;				// 구매 횟수 저장
	
	// 구매 횟수 입력
	public void input_buynum() {
		System.out.print("구매횟수를 입력하세요 : ");
		buyNum = scanner.nextInt();
		System.out.println();
	}
	
	// 로또 번호 1세트 생성
	//=> 1~45 사이의 정수 6개로 구성
	//=> 번호가 중복되면 안됨
	public void select_number() {
		boolean chk = false;	// 중복 여부 상태 저장, true : 중복, false : 중복안됨 ->flag변수
		m[0] = random.nextInt(45) + 1; // 0~44 + 1  =>  1 ~ 45
		
		for(int i=1; i<6; ) {
			m[i] = random.nextInt(45) + 1;
			chk = false;	
			// 번호중복검사
			for(int j=0; j<i; j++) {
				if(m[i] == m[j]) {	//번호가 같은지 검사
					chk = true;
					break;
				}
			}
			// 번호가 같지 않으면 i값 증가
			if(!chk) i++;
		}
		
	}
	
	// 오름차순 정렬
	// => 선택 정렬 알고리즘
	public void sort() {
		for(int i=0; i<5; i++) {		// 기준값
			for(int j=i+1; j<6; j++) {	// 비교값
				if(m[i]>m[j]) {			// 기준값이 비교값보다 큰 지 검사
					// 크면(true) 두 변수값을 바꿈
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
		}		
	}
	
	// 로또번호 1세트 출력
	public void outputResult() {
		for(int i=0; i<m.length; i++) {
			System.out.printf("%2d ", m[i]);
		}
		System.out.println();
	}
	
	// 구매횟수만큼 반복
	public void doLotto() {
		input_buynum();
		for(int i=0; i<buyNum; i++) {
			select_number();
			sort();
			outputResult();
		}
	}
	
}
