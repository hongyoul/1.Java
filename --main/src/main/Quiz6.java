package main;
// 준수사항에 맞게 'Quiz6'클래스를 생성하세요.

// 아래 그림은 펜과 볼펜,만년필 클래스의 상속 관계를 표현한 것입니다.
// 다음과 같이 클래스를 만들고, 볼펜과 만년필 인스턴스를 생성하세요.


public class Quiz6 {

	public static void main(String[] args) {

		Bolpen bolpen = new Bolpen();
		bolpen.thickness = 2;
		bolpen.capacity = 100;
		bolpen.color = "파랑색";
		
		Mannyeonpil mannyeonpil = new Mannyeonpil();
		mannyeonpil.thickness = 3;
		mannyeonpil.capacity = 80;
		mannyeonpil.brand = "몽블랑";
		
	}
	
}
class Pan {
	int thickness;
	int capacity;
	
}

class Bolpen extends Pan {
	String color;
	
}

class Mannyeonpil extends Pan {
	String brand;

}