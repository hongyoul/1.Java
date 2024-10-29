package scope;

/* 
 * 모든 변수의 유효범위를 작성하세요 (블록스코프)
 * */

public class Quiz3 {
	
	// 블록에 따라 변수의 유효범위를 작성하세요(참조변수1, 기초변수3개 있음)
	public static void main(String[] args) { // 범위를 찾을때 가장 가까운'{중가로}'를 찾으면 됨
		
		Person person = new Person(); // 기초변수: 'person'는 메인함수가 끝나기 전까지 사용 가능
		
		int i = 10; // 기초변수: 'i'는 메인함수가 끝나기 전까지 사용 가능
		
		if(i > 1) {
			String str = "안녕하세요"; // 기초변수: 'str'은 'if'문 블록이 끝나기 전까지 사용 가능
		}
		
		for(int k=0; k<10; k++) { // 참조변수: 'k'는 'for'문 블록이 끝나기 전까지 사용 가능
			System.out.println();
		}
		
		//지역변수의 유효 범위는 변수가 선언된 블록 스코프에 따라 달라진다
	}
}

