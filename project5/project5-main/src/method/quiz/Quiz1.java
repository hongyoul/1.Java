package method.quiz;

public class Quiz1 {

	// 사착연산을 수행하는 함수를 만들고 호출하세요.
	// 두숫자를 입력받아 덧셈, 뺄샘, 곱셈, 나누셈, 나머지를 출력하세요.
	public static void result(int n1, int n2) {
		System.out.println(n1 + "+" + n2 + "=" +(n1 + n2));
		System.out.println(n1 + "-" + n2 + "=" +(n1 - n2));
		System.out.println(n1 + "*" + n2 + "=" +(n1 * n2));
		System.out.println(n1 + "/" + n2 + "=" +(n1 / n2));
		System.out.println(n1 + "%" + n2 + "=" +(n1 % n2));
	}

	public static void main(String[] args) {
		result(10, 5);
		System.out.println();
		result(20, 3);

	}

}
