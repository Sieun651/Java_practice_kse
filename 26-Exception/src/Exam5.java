
public class Exam5 {
	public static void main(String[] args) {
		String[] src = {"2", "가", "aaa", "ccc"};
		int[] arr = new int[3];
		
		try {
			for(int i=0; i<src.length; i++) {
				arr[i] = Integer.parseInt(src[i]);
				System.out.println(arr[i]);
			}
		} catch(NumberFormatException e) {
			System.out.println("입력값에 오류가 있습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("데이터가 너무 많습니다.");
		} catch(Exception e) {
			System.out.println("알 수 없는 에러가 발생했습니다.");
		} finally {
			System.out.println("데이터 변환 종료");
		}
		
		System.out.println("프로그램 종료");
	}
}
