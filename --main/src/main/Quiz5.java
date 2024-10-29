package main;

// 준수사항에 맞게 'Quiz5'클래스를 생성하세요.
// 다음과 같이 학생 클래스(Student)를 만드세요. 속성: 학번, 이름
// 모든 멤버변수를 초기화하는 생성자
// 학생의 정보를 반환하는 메소드
// Student형 리스트를 생성하고 학생 3명을 추가하세요
// 그리고 리스트에 저장된 모든 학생정보를 출력하세요

public class Quiz5 {

	public static void main(String[] args) {
		
		Student student1 =new Student(1001, "둘리");
		Student student2 =new Student(1002, "또치");
		Student student3 =new Student(1003, "도우너");
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);

	}

}

class Student {
	int studebtID;
	String studebName;
	
	public Student(int studebtID, String studebName) {
		super();
		this.studebtID = studebtID;
		this.studebName = studebName;
	}

	@Override
	public String toString() {
		return "Student [studebtID=" + studebtID + ", studebName=" + studebName + "]";
	}
	
	
}