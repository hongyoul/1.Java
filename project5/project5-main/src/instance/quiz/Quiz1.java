package instance.quiz;

import instance.student;


// 다음과 같이 사람 클래스(Person)를 정의하세요.
// 속성: 이름, 나이, 결혼여부 자식수
// 그리고 person 클래스를 사용하여 다음 정보를 가지는 인스턴스를 생성하세요.
// 이름: james, 나이:40세, 결혼여부:0, 자식:3
// person 클래스와 테스트 클래스 분리 필수
public class Quiz1 {

	public static void main(String[] args) {
		Person person = new Person(); // 두번째 학생 생성
		person.personName = "James";
		person.personage = "40세";
		person.personMarry = true;
		person.personChild = 3;
		
		System.out.println("이름 :" + person.personName);
		System.out.println("나이 :" + person.personage);
		System.out.println("결혼 여부 :" + person.personMarry);
		System.out.println("자녀 수 :" + person.personChild);
	}

}

// person를 정의하는 클래스
class Person {

	String personName;
	String personage;
	boolean personMarry;
	int personChild;

	

}