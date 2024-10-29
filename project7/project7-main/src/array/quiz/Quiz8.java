package array.quiz;

//학생(Student)을 정의하는 클래스를 만드세요.
//속성: 학번, 이름
//학번과 이름을 초기화하는 생성자
//학생의 정보를 출력하는 메소드 -> showInfo() 직접 만들어서 사용
//
//3개 크기의 Student형 배열을 생성하고, 3명의 학생정보를 저장하세요.
//그리고 배열에 저장된 모든 학생의 정보를 출력하세요.

public class Quiz8 {

	private static final Object[] Student = null;

	public static void main(String[] args) {
		Student[] students = new Student[3];

		
		students[0] = new Student("지구", 1001);
		students[1] = new Student("지연", 1002);
		students[2] = new Student("지후", 1003);
		
		// for문을 사용해서 배열의 모든 요소 출력
		for (int i = 0; i < students.length; i++) {
//			Student[i].showInfo();
		}
	}
}

class Student{
	String name;
	int studentID;
	
	public Student(String name, int studentID) {
			this.name = name;
			this.studentID = studentID;
	
	}
	public void showInfo() {
		System.out.println(name + "," + studentID);
	}
	}
