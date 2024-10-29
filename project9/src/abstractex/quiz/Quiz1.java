package abstractex.quiz;

//아래 그림은 자동차, 아반떼, 소나타 클래스의 상속관계를 표현한 것입니다.
//다음과 같이 클래스를 구현하고, 객체를 생성하세요.
//그리고 다음과 같이 결과가 출력되도록 메소드를 재정의하세요.

public class Quiz1 {

	public static void main(String[] args) {
		
		Sonata sonata = new Sonata();
		sonata.start();
		sonata.drive();
		sonata.stop();
		sonata.turnoff();
		
		System.out.println();
		
		Avante avante = new Avante();
		avante.start();
		avante.drive();
		avante.stop();
		avante.turnoff();

	}

}

// 자동차 클래스
abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
}

// 아반떼 클래스
class Avante extends Car{

	@Override
	public void start() {
		System.out.println("Avante 시동을 켭니다.");
		
	}

	@Override
	public void drive() {
		System.out.println("Avante 달립니다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		System.out.println("Avante 멈춤니다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnoff() {
		System.out.println("Avante 시동을 끕니다.");
		// TODO Auto-generated method stub
		
	}
	
}

// 소나타 클래스
class Sonata extends Car{

	@Override
	public void start() {
		System.out.println("Sonata 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Sonata 달립니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("Sonata 멈춤니다.");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Sonata 시동을 끕니다.");
		
	}
	
}