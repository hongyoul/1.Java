package quiz;

public class Quiz1 {

	public static void main(String[] args) {

		// 다음코드를 실행하면 에러가 발생합니다.
		// Q. 프로그램이 정상적으로 종료되도록 예외 처리하세요.

		try {
			int num = 5/0;
		} catch (Exception e) {
			System.out.println(e.getMessage()); // 에러 메세지만 출력 예시) / by zero => Msg
			e.printStackTrace(); // 에러 메세지와 에러의 위치를 함께 출력
								// 예시) java.lang.ArithmeticException: / by zero
								// 		at Project14/quiz.Quiz1.main(Quiz1.java:11).. => Msg+위치
		} 
		System.out.println("프로그램이 정상 종료됩니다.");
	}

}