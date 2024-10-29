package string.quiz;

public class Quiz1 {

	public static void main(String[] args) {

		// 1. 문자열 "aa:bb:cc:dd"을 만드세요.
		// 그리고 문자열을 "aa#bb#cc#dd"로 변경하세요.
		String str2 = "aa:bb:cc:dd";
		String[] strArr = str2.split(":");
		
		for(int i=0;i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println(str2.replace(':', '#'));
		
		// 1. 모범답안
//				String a = "a:b:c:d";
//				String b = a.replace(":", "#");
//				System.out.println(b); a#b#c#d 출력
		
		// 2. "안녕하세요 저는 둘리입니다"라는 문자열을 만드세요.
		// 그리고 문자열에서 둘리 부분망 추출하세요.
		String str3 = "안녕하세요 저는 둘리입니다";
		System.out.println(str3.indexOf("둘"));
		System.out.println(str3.substring(9, 11)); // substring(시작위치, 마지막 위치)
	}

}
