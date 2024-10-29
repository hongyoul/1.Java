package wrapper;

public class Ex2 {

	public static void main(String[] args) {
		
		// Integer의 객체 생성  
		Integer integer = new Integer(100);
				
		// 자바 버전이 올라가면서 생성자 생략 가능 (자바5 버전부터)
		Integer integer2 = 100; //new Integer(100);로 변환됨 = '오토박싱'이라 부름
		
		// Integer 객체에서 값 꺼내기
		int num1 = integer.intValue();
		int num2 = integer; // integer.intValue();로 변환됨 = '언박싱'이라 부름
				
		// 참조형과 기본형간의 연산 기능
		int num3 = integer + 100; // integer.intValue() + 100 => 100 + 100
//				 = 참조타입 + 기본타입;
		
		System.out.println("num1: " + num1);
		System.out.println("num1: " + num2);
		System.out.println("num1: " + num3);
		
		// Boolean 클래스
		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = false; //오토박싱으로 객체 생성
		
		boolean bool1 = boolean1.booleanValue(); // boolean값 꺼내기
		boolean bool2 = boolean2; // 언박싱으로 값 꺼내기
		
		System.out.println("bool1: " + bool1);
		System.out.println("bool2: " + bool2);
		
		// Character 클래스
		Character character1 = new Character('A');
		Character character2 = 'B'; // 오토박싱으로 객체 생성
		
		char char1 = character1.charValue();
		char char2 = character2; // 언박싱으로 값 꺼내기
		
		System.out.println("char1: " + char1);
		System.out.println("char2: " + char2);
		
	}
}
