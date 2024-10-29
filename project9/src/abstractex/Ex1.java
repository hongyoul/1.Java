package abstractex;

public class Ex1 {

	public static void main(String[] args) {
	
		// 추상클래스는 인스턴스를 생성할 수 없음!
		// Why? 추상클래스의 목적은 상속이기 때문
//		Computer computer = new Computer(); {
		
		// 완전한 클래스로 함수를 구현한다.
		DeskTop deskTop = new DeskTop();
		NoteBook noteBook = new NoteBook();
		
		deskTop.turnOn();
		deskTop.turnOff();
		deskTop.display();
		deskTop.typing();
		
		noteBook.turnOn();
		noteBook.turnOff();
		noteBook.display();
		noteBook.typing();
	
	}

}

//컴퓨터 클래스
abstract class Computer { // 일반 + 추상클래스로 지정
	
	// 자식들리 공통으로 사용하는 기능은 일반메소드로 선언
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	// 자식들마다 다르게 사용하는 기능은 추상메소드 선언
	// 컴퓨터마다 화면을 표시하는 방법이 다르니까 추상메소드로 선언
	
	public abstract void display(); // 바디없음

	// 컴퓨터마다 타이핑을 하는 방법이 다르니까 추상메소드로 선언
	public abstract void typing();
	// 즉, 자식들마다 공통으로 사용하면 일반메소드 / 각자 다르게 상속할 예정이면 추상메소드 사용
}

//데스크톱 클래스
class DeskTop extends Computer { // 컴퓨터클래스 상속받기. 구현되지 않은 메소드가 있으면 에러남

	@Override
	public void display() { // 물려받은 추상메소드 구현
		System.out.println("DeskTop Display()");
	}

	@Override
	public void typing() { // 물려받은 추상메소드 구현
		System.out.println("DeskTop Typing()");
	}

}

//노트북 클래스
class NoteBook extends Computer { // 컴퓨터클래스 상속받기

	@Override
	public void display() { // 물려받은 추상메소드 구현
		System.out.println("NoteBook Display()");
	}

	@Override
	public void typing() { // 물려받은 추상메소드 구현
		System.out.println("NoteBook Typing()");
	}

}
