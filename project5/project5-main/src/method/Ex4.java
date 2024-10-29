package method;

public class Ex4 {

	// 입력받은 숫자 만큼 "안녕하세요"를 출력하는 함수 선언
	public static void printHello(int cnt) { // 인자값 설정 -> 숫자 (int 매개변수)
		for (int i = 1; i <= cnt; i++) {
			System.out.println("안녕하세요");
		}
	}
	public static void main(String[] args) {
		printHello(5); // 함수 호출 함수명(인자값 = 출력하고자 하는 총횟수)

	}

}
