package abstractex.quiz;

//아래 그림은 동물, 사람, 호랑이 클래스의 상속관계를 표현한 것입니다.
//다음과 같이 클래스를 구현하고, 객체를 생성하세요.
//그리고 다음과 같이 결과가 출력되도록 메소드를 재정의하세요.

public class Quiz3 {

	public static void main(String[] args) {
		Human human = new Human();
		human.sleep();
		human.move();
		human.reaBook();
		
		System.out.println();
		
		Tiger tiger = new Tiger();
		tiger.sleep();
		tiger.move();
		tiger.hunting();

	}

}

// 동물 클래스
abstract class Animal1{
	
	public void sleep() {
		System.out.println("동물은 잠을 잡니다.");
	}
	
	
	public abstract void move();
	
}

// 사람 클래스
class Human extends Animal1{

	
	@Override
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다.");
	}

	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}

	
	public void reaBook() {
		System.out.println("사람이 책을 읽습니다.");
		
	}
	
}
// 호랑이 클래스
class Tiger extends Animal1{

	@Override
	public void sleep() {
		System.out.println("호랑이가 잠을 잡니다.");
	}

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
		
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
		
	}
	
}