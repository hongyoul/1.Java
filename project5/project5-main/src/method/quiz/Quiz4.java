package method.quiz;

public class Quiz4 {

	// 빼기 메소드를 만들고 호출하세요.
	// 두수를 입력받아 첫번째 수에서 두번째 수를 뺀 후에 그 결과를 반환하세요.
	// 단, 첫번째 수가 두번째 수 보다 작으면 -999을 반환하고 함수를 종료하세요.
	
	public static int subtract(int n1, int n2) {
		if (n1 < n2) { // 조건에 만족할때 차를 구하지 않아도 괜찮기 때문에 앞에 먼저 작성해야함 
			return -999;
		} 
		int result =  n1 - n2;
		return result;
	}
	
	public static void main(String[] args) {
		int result1 = subtract(20,10);
		System.out.println(result1);
		int result2 = subtract(10,20);
		System.out.println(result2);

	}

}
