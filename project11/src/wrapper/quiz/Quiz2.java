package wrapper.quiz;

//<wrapper 클래스 메소드 사용하기>

//정수 10을 문자열 변수에 저장하세요.
//실수 1.123을 문자열 변수에 저장하세요.
//문자 c를 문자열 변수에 저장하세요.
//boolean타입의 true 값을 문자열 변수에 저장하세요.

public class Quiz2 {

	public static void main(String[] args) {

		// 숫자를 문자열로 변환하려면 "toString" 메소드를 사용해야함	
		
		// 1.  래퍼클래스의 toString 사용하기
		String string1 = Integer.toString(10);
		
		String string2 = Double.toString(1.123);
		
		String string3 = Character.toString('c');
		
		String string4 = Boolean.toString(true);
		
		// 2. String 클래스의 valueOf 사용하기
		String string5 = String.valueOf(10);
		
		String string6 = String.valueOf(1.123);
		
		String string7 = String.valueOf('c');
		
		String string8 = String.valueOf(true);
		
		
		
	}

}
