package method.quiz;

public class Quiz3 {

	// 두수를 비교하는 함수를 만들고 호출하세요.
	// 둘 중에 더 큰 수를 구하고 반환하세요.
	// 10,5 / 2,3
	
	public static int max(int n1, int n2) {
		if (n1 > n2) {
			return n1; //n1 반환
		} else {
			return n2; //n2 반환
		} //return 의 의미는 2가지 = 값을 반환한다, 함수를 종료한다
	}

	public static void main(String[] args) {
		int result1 = max(10,5);
		System.out.println(result1);
		int result2 = max(2,3);
		System.out.println(result2);
		

	}

}
