package method.quiz;

public class Quiz2 {

	//문제
	//  두 수를 비교하는 함수 만들고 호출하세요.
    //  두 수를 입력받아 n1부터 n2까지의 합을 반환하세요.
    //  예시) 5,10 => 5+6+7+8+9+10
	
	//풀이
	//매개변수ㅇ 리턴ㅇ
	//n1부터 n2까지의 합을 구하는 함수 선언
	public static int add(int n1, int n2) {
		//1. 결과값을 저장할 변수를 지정한다.
		int result = 0;
		// 2. 반복문을 지정해준다.
		for (int i = n1; i <= n2; i++) {
			result = result + i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int sum1 = add(5,10);
		int sum2 = add(3,7);
		System.out.println("5부터 10까지의 합은: " + sum1);
		System.out.println("3부터 7까지의 합은: " + sum2);
	}

}
