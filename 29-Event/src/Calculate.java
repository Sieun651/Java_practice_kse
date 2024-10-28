// 인터페이스에 함수가 1개인지를 검사하는 어노테이션
@FunctionalInterface			//이 인터페이스를 람다표현식으로 쓰겠다는 강조
public interface Calculate {
	int operation(int a, int b);
}
