package method;

public class Ex1 {

	public static void method1() {
		System.out.println("매개변수와 리턴타입이 둘 다 없는 메소드입니다.");
		return; // 생략 가능
	}
	
	public static String method2() {
		return "매개변수가 없지만 반환값이 있는 메소드"; // return 뒤에 타입이 일치하지 않으면 에러가 발생
	}
	
	// 매개변수가 있고 반환값이 없는 메소드
	public static void method3(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("sum: " + sum);
	}
//	
	// 매개변수가 있고 반환값이 있는 메소드
	public static int method4(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void main(String[] args) {
	
		method1();
		
		String str = method2();
		System.out.println(str);
		
		method3(13, 42);
		
		int i = method4(15, 25);
		System.out.println(i);

	}

}
