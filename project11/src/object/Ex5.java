package object;

public class Ex5 {

	public static void main(String[] args) {
		
		
		String str1 = new String("test");
		System.out.println(str1.toString()); // 주소 대신 문자열 값 출력
		System.out.println(str1); // 참조변수를 출력시 자동으로 toString()메소드 호출
		
		String str2 = new String("test");
		
		// equals 구성을 보면 오버라이딩 값이 동일하게 구현되어 있어 주소가 아닌 ()안 내용물로 확인된다
		if (str1.equals(str2)) { // 주소 대신 문자열의 내용 비교
			System.out.println("str1와 str2은 같은 문자열입니다.");
		}

	}

}
