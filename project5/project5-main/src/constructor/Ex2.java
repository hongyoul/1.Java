package constructor;

import instance.student;

// 테스트 클래스
public class Ex2 {

	// 오버로드 예제
	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name="둘리";
		person1.weight=80;
		person1.height=180;
		
		Person person2 = new Person("또치");
		person2.weight=50;
		person2.height=160;
		
		Person person3 = new Person("도우너", 170,60);
	}

}

// 사람을 정의하는 클래스
class Person{
	String name; // 이름
	int height; // 키
	int weight; // 몸무게
	
//	디폴트 생성자: 객체만 생성
	public Person() {
	}
//	이름을 박아서 초기화하는 생성자
	public Person(String nm) {
		name = nm;
	}
	
//	이름,키,몸무게를 받아서 초기화하는 생성자
	public Person(String nm, int he, int we) {
		name = nm;
		height = he;
		weight = we;
	}
}