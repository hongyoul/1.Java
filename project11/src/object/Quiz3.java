package object;

public class Quiz3 {

	public static void main(String[] args) {
		
		
		Dog dog = new Dog("멍멍이", "진돗개");
		System.out.println(dog); //// dog.toString()과 같음
		System.out.println(dog.toString()); 
		// 중요!!  클래스(참조변수) 안에는 주소값이 들어있다

	}

}

class Dog {
	String name;
	String type;
	public Dog(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	@Override
	public String toString() {
		return  type + " " + name;
	}
	
}