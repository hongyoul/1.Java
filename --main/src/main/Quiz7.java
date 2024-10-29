package main;

import java.util.ArrayList;

// 준수사항에 맞게 'Quiz7'클래스를 생성하세요.
// 아래 그림은 동물 추상클래스와 사람, 호랑이 클래스의 상속 관계를 표현한 것입니다.
// 상속 관계와 결과를 참고하여 클래스를 정의하세요. 
// Animal형으로 리스트를 생성하고 사람 객체와 호랑이 객체를 저장하세요.
// 그리고 리스트에 저장된 사람과 호랑이를 꺼내서 모든 기능을 호출하세요.


public class Quiz7 {

	public static void main(String[] args) {
	
		ArrayList<Animal> list = new ArrayList<>();
		list.add(new Human());
		list.add(new Tiger());

		for (int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);
			animal.sleep(); 
			animal.move();
			
			if (animal instanceof Human) {
				Human human =(Human) animal;
				human.action();
			}else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunt();
			}
			System.out.println();
		}
		
	}

}

class Animal {
	
	public void sleep() {
		System.out.println("밤에 잠을 잡니다.");
	}
	
	public void move() {
		System.out.println("걷습니다.");
	}

}

class Human extends Animal {

	@Override
	public void sleep() {
		System.out.println("밤에 잠을 잡니다.");
	}

	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void action() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {

	@Override
	public void sleep() {
		System.out.println("밤에 잠을 잡니다.");
	}

	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}

	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}


