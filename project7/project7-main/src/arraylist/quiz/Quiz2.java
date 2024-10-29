package arraylist.quiz;

import java.util.ArrayList;

// 논리형(Boolean)의 리스트를 생성하세요.
// 값 3개를 추가하세요.(true, true, false)
// 반복문을 사용하여 리스트의 모든 요소 출력하세요. 
// 리스트의 첫번째 요소와 마지막 요소를 출력하세요.

public class Quiz2 {

	public static void main(String[] args) {

		// 내가 작성한 답안 ↓
		ArrayList<Boolean> list = new ArrayList<Boolean>();

		list.add(true);
		list.add(true);
		list.add(false);

		boolean bool1 = list.get(0);
		boolean bool2 = list.get(1);
		boolean bool3 = list.get(2);
		System.out.println(list.get(0) + "," + list.get(2));
	}
	}

		// 모범답안 ↓

//		ArrayList<Boolean> list = new ArrayList<Boolean>();
//		list.add(true);
//		list.add(true);
//		list.add(false);

//		System.out.println("=== 일반 for문 사용 ===");
//		for (int i = 0; i < list.size(); i++) {
//			boolean bool = list.get(i);
//			System.out.print(bool + " ");
//		}
//		System.out.println();
//		System.out.println("=== 람다식 for문 사용 ===");
//		for (boolean bool : list) {
//			System.out.print(bool + " ");
//		}

// 		리스트의 첫번째 요소와 마지막 요소를 출력하세요.

//		int lastIndex = list.size() - 1; => lastIndex를 만들어 줘야함. 리스트의 크기 -1를 하면됨
//
//		System.out.println();
//		System.out.println();
//		System.out.println("첫번째 요소: " + list.get(0));
//		System.out.println("마지막 요소: " + list.get(lastIndex));
//
//	}
