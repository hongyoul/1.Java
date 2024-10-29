package wrapper.quiz;

//<wrapper 클래스 메소드 사용하기>
//문자열 "10"을 byte, short, int, long 으로 변환하세요.
//문자열 "10.0" 을 float, double 로 변환하세요.

public class Quiz1 {

	public static void main(String[] args) {
		
		// 문자열 "10"을 byte, short, int, long 으로 변환하세요.
		// 또는 valueOf 함수 사용하기
		Integer iNum1 = Integer.valueOf("100");
		
		byte byte1 = Byte.parseByte("10");
		short short1 = Short.parseShort("10");
		int integer = Integer.parseInt("10");
		long long1 =Long.parseLong("10");

		
		//문자열 "10.0" 을 float, double 로 변환하세요.
		float fNum = Float.parseFloat("10.0"); //"10.0" -> 10.0
		double dNum = Double.parseDouble("10.0");
		
		Double double1 = Double.parseDouble("10.0"); // 오토박싱됨
		
	}

}
