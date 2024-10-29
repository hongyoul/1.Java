package object;



//3번째 예제에서 작성한 Student클래스를 재사용하세요.
//Object형 변수를 선언하고 Student객체를 대입하세요.
//Object형 변수를 사용해서 학번과 이름을 출력하세요.

public class Quiz2 {

	public static void main(String[] args) {
		
		// Object는 모든 클래스의 부모이기 때문에 형변환 가능 단, 부모가 물려준 객체만 가능하여 다운캐스팅한 한다.
		// 하지만 Object 타입변수로는 학생의 정보를 사용할 수 없음
		Object object = new Student (1001, "지수");
		
		if (object instanceof Student) { // 타입 체크
			Student student = (Student)object; // 다운캐스팅
			System.out.println("학번: " + student.id);
			System.out.println("이름: " + student.name);
		}		

	}

}

