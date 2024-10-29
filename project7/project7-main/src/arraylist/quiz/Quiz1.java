package arraylist.quiz;

import java.util.ArrayList;

// 문자형(Character) 리스트를 생성하세요.
// 문자 3개를 추가하세요.
// 리스트의 모든 요소를 출력하세요.
public class Quiz1 {

	public static void main(String[] args) {
		
		// 문자타입 리스트 생성
		// 문자형이기 때문에 리스트는 char -> 문자형 클래스(Character) 으로 작성
		ArrayList<Character> list = new ArrayList<Character>();
		
		// 리스트에 데이터 추가
		list.add('A');
		list.add('B');
		list.add('C');
		System.out.println(list);
		
		// 리스에서 요소를 하나씩 꺼내기
		char char1 = list.get(0);
		char char2 = list.get(1);
		char char3 = list.get(2);

	}
}
