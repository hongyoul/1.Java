package conditional;

public class Ex7 {

	public static void main(String[] args) {
		
		int time = 8;
		
		switch (time) {
		case 8:
			System.out.println("출근합니다");
			// break; <- 삭제 시
		case 9:
			System.out.println("회의를 합니다");
			// break; <- 삭제 시
		case 10:
			System.out.println("업무를 봅니다");
			// break; <- 삭제 시
		default:
			System.out.println("외근을 나갑니다");
			// break; <- 삭제 시
			//브레이크가 없어 출력시 전부 출력되는 오류를 볼 수 있다.
		}
	}

}
