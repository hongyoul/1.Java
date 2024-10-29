package hiding.test2;

import hiding.test1.A;

public class Test {

	public static void main(String[] args) {
		
		A a = new A(); // 접근제어자가 'public'으로 되어있어 외부 패키지에서 사용이 가능
//		B b = new B(); // B는 'default'로 되어있어 외부 패키지에서 사용이 불가능
		
	}

}
