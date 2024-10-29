package instance;

public class Ex3 {

	public static void main(String[] args) {

		car car = new car(); // 객체생성
		car.setStatus(true); // 현재상태변경
		car.showstatus(); // 현재상태 출력
	}

}

	// 자동차를 정의하는 클래스
	class car{
	
		boolean status; // 현재상태 // 속성
	
	// 현재상태를 변경하는 메소드 선언
		public void setStatus(boolean stt) { // "set=수정" 이라고 생각
			status = stt;
	}
	// 현재 상채를 출력하는 메소드
		public void showstatus() {
			System.out.println(status);
	}

}