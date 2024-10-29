package object;

// 학생을 정의하는 클래스
public class Student {

	// 학생의 속성
	int studentID; // 학번(1001) -> 숫자
	String studentName; // 이름(지영) -> 문자
	int grade; //학년 (3) -> 숫자
	String assress; // 주소 (인천시 ~~~~) -> 문자
	
	// 학생의 기능(메소드)
	public void goSchool() {
		System.out.println("학교에 간다");
	}
	public void study() {
		System.out.println("공부를 한다");
		
	}

	}

