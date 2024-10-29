package scope;

/* 
 * 모든 변수의 유효범위를 작성하세요.
 * 인스턴스변수,클래스변수 / 전역변수, 지역변수
 * 구분에 따라 변수의 유효범위를 작성하세요.
 * */

class Person {
	
	// 인스턴스 변수라서 객체 생성 후에 사용가능
	// 전역변수라서 클래스 끝나기 전까지 사용가능
	String personName; // 인스턴스변수 개별 속성
	int personAge; // 인스턴스 변수 개별 속성

	// 클래스 변수라서 객체없이도 사용 가능
	// 전역변수라서 클래스 끝나기 전까지 사용가능
	static char gender = 'F'; // static 사용 => 공통 속성 클래스 변수 *클래스 상단에 있다면(위치로 구분 가능) 전역변수로도 볼 수 있다

	// 지역변수는 메소드 안에서만 사용가능
	public void setPersonName(String name) {
		this.personName = name; // 지역변수 : 잠깐 사용
	}
	
}



