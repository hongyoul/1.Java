package quiz;

public class Quiz7 {

	public static void main(String[] args) {

		// 코드를 보고 연산과정과 결과값을 주석으로 작성하세요.
		boolean resul1 = (1 == 2) || (1 < 2); // true , 연산자 총 4개 사용됨
		// *우선순위: 비교연산자>논리연산자

		boolean resul2 = true && false; // false
		boolean resul3 = !false; // true
		// *논리연산과 비교연산의 식은 여러개(2개이상) 사용이 가능하고
		// *연산자는 식이 여러개일 때 동일한 연산자만 사용하는게 아니라 다양하게 사용가능하다.

		int x = 1;
		int y = 5;
		boolean resul4 = (x < y) || (x == y); // true

	}

}
