package method.quiz;

public class Quiz5 {

	// 문제
	// 나누기 함수를 만들고 호출하세요.
	// 두수를 입력받아 첫번째수에서 두번째수를 나눈 몫을 출력하세요.
	// 단, 두번째 수가 0이면 "나누는 수는 0이 될 수 없습니다."를 출력하고 함수를 종료하세요.
	
	public static void divide(int n1, int n2) {
		if (n2 == 0) {
			System.out.println("나누는 수는 0이 될수없습니다."); 
			return;
		}
		int result =  n1 / n2;
		System.out.println(n1 + "/" + n2 + "=" + result);
	}
	public static void main(String[] args) {
	
		divide(10,2);
		divide(15,5);
		divide(10,0);
	}
}
	


