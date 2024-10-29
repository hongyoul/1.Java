package wrapper.quiz;

import java.util.Scanner;

//Scanner 클래스의 nextLine 메소드를 사용하여 정수 두개를 입력받으세요.
//그리고 두 수를 더한 결과를 출력하세요.
//ex) 10, 5 => 15

public class Quiz4 {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	
	String string1 = sca.nextLine(); // 첫번째 숫자 입력
	String string2 = sca.nextLine(); // 두번째 숫자 입력

	System.out.println(string1 + string2); // '+'는 더하기가 아닌 연결로 사용
	
	
	// 문자열을 숫자로 변환하고 더하기(형변환) : "10" + "5" -> 10 + 5
	int sum = Integer.parseInt(string1) + Integer.parseInt(string2);
	
	System.out.println("두 수의 합: " + sum);
	
	}

}
