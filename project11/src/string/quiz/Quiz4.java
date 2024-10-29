package string.quiz;

//이전 문제를 함수형태로 바꾸고 호출하세요.

//ex) getCharCount("자바 프로그래밍 입문") -> 9
//ex) getCharCount("equals 메소드는 두 객체가 같은지 비교한다") -> 21

public class Quiz4 {

	   public static void main(String[] args) { 
		   
		   
		   // 함수이름 (인자);
		   int result = getCharCount("자바 프로그래밍 입문"); // 9
		   System.out.println(result);
		   System.out.println(getCharCount("equals 메소드는 두 객체가 같은지 비교한다")); // 21
	   }
	   
	
	   // 메인 함수 안에 값을 정의하기 위해 함수 생성 (인스턴스 or static 사용 가능)
		static int getCharCount(String s) { // 해당 타입의 변수를 선언
	        int realLength = 0;
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) != ' ') {  // 공백이 아닌 경우에만 결과값을 증가
	            	realLength++;
	            }
	        }
	        return realLength; // 결과 값이 int이기 때문에 return를 사용해야 함 
	    }
    }
	