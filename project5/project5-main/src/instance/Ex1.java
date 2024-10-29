package instance;

public class Ex1 {

	public static void main(String[] args) {

//		객체 생성
		student student = new student();
		
//		객체의 멤버뱐수를 사영하여 학번 수정
		student.studentID = 1001;
		student.studentName = "둘리";
		student.grade = 2;
		student.address = "인천 연수구 ~";
		
		System.out.println("학생의 모든 정보를 출력합니다.");
//		System.out.println("studentID = " + student.studentID);
//		System.out.println("studentName = " + student.studentName);
//		System.out.println("grade = " + student.grade);
//		System.out.println("address = " + student.address);
		
		student.showStudentInfo();
		
		System.out.println("객체의 주소: " + student);
	} 

}
