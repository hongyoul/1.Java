package hiding.test2;

public class Test2 {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.name = "둘레";
		person.height = 175;		
		//몸무게는 클래스 외부에서 사용이 불가능하여 "person."를 찍었을때 자동완성에서 나오지 않음

	}

}

class Person{
	public String name; // 이름
	int height; // 키
	private double weight; // 몸무게는 'private'이기 때문에 'showInfo'클래스를 벗어나면 사용이 불가능
	
	public void showInfo() {
		System.out.println("이름: " + name + "키: " + height + "몸무게: " + weight);
	}
}
