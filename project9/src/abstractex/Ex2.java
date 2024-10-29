package abstractex;

public class Ex2 {

	public static void main(String[] args) {
		
		// 형변환 방식(상속이니까 형변환 가능)
		Animal animal1 = new Dog();
		animal1.sound();
		
		Animal animal2 = new Cat();
		animal2.sound();
	}

}

//동물 클래스
abstract class Animal{
	// 공통기능 = 일반메소드 선언
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 동물마다 내는 소리가 다르니까(각각 다르게 사용) = 추상메소드로 선언
	public abstract void sound();
}

// 고양이 클래스
class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("야옹");
		
	}
	
}

// 강아지 클래스
class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("멍멍");
		
	}
	
}