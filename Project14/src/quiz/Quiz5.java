package quiz;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {

		// 다음코드를 실행하면 에러가 발생합니다.
		// Q. 프로그램이 정상적으로 종료되도록 예외 처리하세요.
		
		// 프로그램이 정상적으로 종료되도록 예외를 처리하세요.

		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");

		// "abc" 를 입력하세요!
		int num = scanner.nextInt(); // 다른 타입의 데이터가 들어와서 에러남

//		try {
//			Scanner scanner = new Scanner(System.in); 
//			System.out.println("정수를 입력하세요.");
//			int num = scanner.nextInt(); // 다른 타입의 데이터가 들어와서 에러남
//		} catch (InputMismatchException e) {
//			System.out.println(e);
//		}

	}

}
