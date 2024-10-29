package quiz;

public class Quiz9 {

	public static void main(String[] args) {
		
//		내가 작성한 오답
//      int x = 5; 
//		int y = 3;
//		
//		String str = (x >	y) ? "오" : "삼";
//		System.out.println(str);
		
    	// 정답
		char ch = (5 > 3) ? '오' : '삼';
	    System.out.println(ch);
	    
	    // 문자 타입 정리!!
	    // char - '문자(1개일때)' 사용, int - 정수, boolean - 거짓&참,
	    // string - "문자열(2개이상의 문자가 합쳐진 단어 혹은 문장)" 
	    // ** '',"" 사용 헷갈리지 말기
		
	    // 다음코드를 보고 풀이과정과 예상결과값을 주석으로 작성하세요.
		int x = 10;
		int y = 20;
		int result = ( x > 10) ? y + 10 : y - 10; // x는 10보다 크지 않기때문에 거짓인 y-10(=10)으로 나타난다.
		System.out.println(result); // 10 (false)
	}

}
