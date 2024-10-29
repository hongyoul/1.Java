package string;

public class Ex3 {

	public static void main(String[] args) {

		// 문자열을 수정하면 인스턴스의 주소가 달라짐
		String str ="java";
		System.out.println("str의 주소: " + System.identityHashCode(str));
		str = str + " and";
		str = str + " android"; // 객체 새로 생성되어 주소가 변경됨 
		System.out.println("값 변경 후 str의 주소 " + System.identityHashCode(str));
		System.out.println(str);
		System.out.println();
		
		// String 클래스는 값을 변경하면 문자열리 계속 생성되기 때문에 메모리가 낭비됨
		// 문자열 자주 변경 된다면 StringBuffer를 사용 권장
		StringBuffer buffer = new StringBuffer("java");
		System.out.println("buffer의 주소: " + System.identityHashCode(buffer));
		buffer.append(" and"); // append는 
		buffer.append(" android");
		System.out.println("값 변경 후 bufferr의 주소 " + System.identityHashCode(buffer));
		System.out.println(buffer.toString());
	}

}
