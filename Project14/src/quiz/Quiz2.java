package quiz;

public class Quiz2 {

	public static void main(String[] args) {

		// 다음코드를 실행하면 에러가 발생합니다.
		// Q. 프로그램이 정상적으로 종료되도록 예외 처리하세요.
		
		String s = null;
		
		try {
			System.out.println(s.length()); // 빈 객체를 참조하여 에러남
		
		} catch (Exception e) {
			System.out.println("프로그램이 정상 종료 됩니다.");
		}
		
	}

}