package string.quiz;

import java.util.Scanner;

//Scanner 클래스의 nextLine 메소드를 사용하여 문자열을 입력받고,
//문자열을 거꾸로 뒤집어서 출력하세요.
//
//ex) "안녕하세요" -> "요세하녕안"

public class Quiz5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		
		System.out.print(string.charAt(4));
		System.out.print(string.charAt(3));
		System.out.print(string.charAt(2));
		System.out.print(string.charAt(1));
		System.out.println(string.charAt(0));
		
		// 무자열에서 뒤에서부터 한 글자씩 출력
		int i = string.length() - 1;
		while(i>=0) {
			System.out.print(string.charAt(i));
			i--;
		}
		
		// 3.
		for (int j = 4; j >= 0; j--) { // 1씩 감소
			System.out.print(string.charAt(j));
		}

		// 4.StringBuilder 클래스 사용
		StringBuilder builder = new StringBuilder(string);
		builder.reverse(); //문자열을 거꾸로 변경하기
		System.out.println(builder.toString());

	}

}
