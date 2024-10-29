package main;

public class Ex7 {

	public static void main(String[] args) {
		
		// 연산자 이해하기 전에는 옆에 내용을 사용해도 무관
		 int x = 10; // x = x + 10	*정수이기 때문에 int이고, 변수기준 때문에 기준을 준다.
		 System.out.println(x); // 20
		 
		 x -= 5; // x = x - 5	
		 System.out.println(x); // 20 - 5 = 15 여기서 20은 윗 코드부터 내려오기 때문에 위에 코드 확인 필수
		 
		 x *= 10; // x = x * 10		
		 System.out.println(x);  // 150
		 
		 x /= 10; // x = x / 10 
		 System.out.println(x); // 15
		 
		 x %= 10; // x = x % 10 
		 System.out.println(x);

	}

}
