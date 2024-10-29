package main;

//준수사항에 맞게 'Quiz8'클래스를 생성하세요.

// 아래 그림은 계산기 인터페이스와 구현 클래스의 상속 관계를 표현한 것입니다.
//상속 관계와 결과를 참고하여 인터페이스와 클래스를 만드세요.
//곱하기 함수에서 곱하는 수가 0 또는 음수라면, 에러코드를 반환하고
// 나누기함수에서 첫번째 숫자가 두번째 숫자보다 더 작다면, 에러코드를 반환하세요.


public class Quiz8 {

	public static void main(String[] args) {

		Calc calc = new Calculator(); 
		System.out.println(calc.add(10, 5));
		System.out.println(calc.substract(10, 5));
		System.out.println(calc.times(10, 5));
		System.out.println(calc.divide(10, 5));
		System.out.println();
		System.out.println(calc.times(10, 0));
		System.out.println(calc.divide(10, 20));

	}

}
interface Calc {
	
	int ERROR = -9999; 

	int add(int num1, int num2); 

	int substract(int num1, int num2); 

	int times(int num1, int num2); 

	int divide(int num1, int num2); 
}

class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		if ( num1 > 0 && num2 > 0) {
			return num1 * num2;
		} else {
			return Calc.ERROR;
		}
	}

	@Override
	public int divide(int num1, int num2) {
		if (num1 > num2) {
			return num1 / num2;
		} else {
			return Calc.ERROR;
		}
	}
	
}
