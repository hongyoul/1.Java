package abstractex.quiz;

//아래 그림은 자동차, 버스, 오토카 클래스의 상속관계를 표현한 것입니다.
//다음과 같이 클래스를 구현하고, 객체를 생성하세요.
//그리고 다음과 같이 결과가 출력되도록 메소드를 재정의하세요.

public class Quiz2 {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		bus.run();
		bus.refuel();
		bus.takePassenger();
		
		System.out.println();
		
		AutoCar autoCar = new AutoCar();
		autoCar.run();
		autoCar.refuel();
		autoCar.load();
		
	}

}
// 지동치 클래스
abstract class Car1 {
	
	public abstract void run();
	public abstract void refuel();
	public abstract void takePassenger();
	public abstract void load();
	
}

// 버스 클래스
 class Bus extends Car1{

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("천연가스를 충전합니다.");
		
	}

	@Override
	public void takePassenger() {
		System.out.println("승객를 버스에 태웁니다.");
		
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}
}

	
// 오토카 클래스
class AutoCar extends Car1{

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("천연가스를 충전합니다.");
	}


	@Override
	public void load() {
		System.out.println("짐을 싣습니다.");
		
	}

	@Override
	public void takePassenger() {
		// TODO Auto-generated method stub
		
	}
	
}
