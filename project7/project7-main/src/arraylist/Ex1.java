package arraylist;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		
		// 리스트 생성
		// 기초타입: int를 사용하지 못하기 때문에 -> 클래스 Integer 로 사용
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 새로운 요소 추가
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		// 2번째 위치에 요소 추가
		list.add(1, 40); // 두번째 인텍스에 40을 추가한다
		System.out.println(list);
		
		// 3번째 요소 삭제
		list.remove(2); // remove(인텍스번호 추가) 
		System.out.println(list);
		
		// 리스트에 저장된 요소 꺼내기
		int num1 = list.get(0);
		int num2 = list.get(1);
		int num3 = list.get(2);
	}

}
