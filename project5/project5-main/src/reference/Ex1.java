package reference;

public class Ex1 {

	public static void main(String[] args) {
		
		Subjrct math = new Subjrct("수학", 85);
		Subjrct korean = new Subjrct("국어", 100);
		
		Student student = new Student(1001, "둘리", math, korean);
		

	}

}

// 성적 클래스
class Subjrct{
	String subjectName;
	int scorePoint;
	// 모든 멤버변수를 초기화하는 생성자

	public Subjrct(String subjectName, int scorePoint) {
		super();
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}
	
}


class Student{
	int studentID; // 학번
	String studentName; // 이름
	Subjrct math; // 수학성적 Subjrct형을 사용하여 선언
	Subjrct korean; // 국어성적
	// 모든 멤버변수를 초기화하는 생성자 Subjrct형을 사용하여 선언
	
	public Student(int studentID, String studentName, Subjrct math, Subjrct korean) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.math = math;
		this.korean = korean;
	}
	
}