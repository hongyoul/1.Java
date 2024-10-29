package quiz;

public class Quiz3 {

	public static void main(String[] args) {
		
		// 다음코드를 실행하면 에러가 발생합니다.
		// Q. 프로그램이 정상적으로 종료되도록 예외 처리하세요.
		
		Object obj = new Integer(0);
		
		try {
			String str =(String) obj;
		} catch (Exception e) {
			System.out.println("프로그램이 정상 종료됩니다.");
		}

	}

}
