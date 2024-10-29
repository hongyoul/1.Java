package finalex;

class Parents{
	
	final void method1() { // 변형하지 말아라 = 즉, final은 원형 그대로 사용하게 함
		
	}
	void method2() {
		
	}
}

class Child extends Parents{

	@Override
	void method2() {
		// TODO Auto-generated method stub
		super.method2();
	}
	
}