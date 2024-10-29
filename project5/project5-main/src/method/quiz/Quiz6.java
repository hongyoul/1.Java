package method.quiz;

public class Quiz6 {

	// 문제
	// 계산기 메소드를 만들고 호출하세요.
	// 연산을 수행하고 결과를 출력하세요.
	// 예시 1,5 / 6,2 / 2,5 / 10,2
	
	public static void calc ( int n1, int n2, char n3) {
		
		int result = 0;
		
		switch (n3) {
		case '+':
			result = n1 + n2;
			System.out.println(n1 + "+" + "=" + result);
			break;
		case '-':
			result = n1 - n2;
			System.out.println(n1 + "-" + "=" + result);
			break;
		case '*':
			result = n1 * n2;
			System.out.println(n1 + "*" + "=" + result);
			break;

		case '/':
			result = n1 / n2;
			System.out.println(n1 + "/" + "=" + result);
			break;
		}
	}
	public static void main(String[] args) {
		calc (1, 5, '+');
		calc (6, 2,'-');
		calc (2, 5,'*');
		calc (10, 2,'/');
		

	}

}
