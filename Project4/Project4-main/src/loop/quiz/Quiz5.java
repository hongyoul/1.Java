package loop.quiz;

public class Quiz5 {

	public static void main(String[] args) {

		// continue를 사용했을 때
		for (int i = 1; i <= 100; i++) { // Ex9은에서는 for문 밖에 변수 i을 지정한것은 좀 특별한 경우

			if (i % 3 != 0) { // 3의 배수가 맞지 않다면
				continue;
			}
			System.out.println(i);
		}
		
	}

}

//      continue를 사용하지 않았을 때
//       for (int i = 1; i <= 100; i++) {
//
//			if (i % 3 == 0) { *3의 배수가 맞다면
//				continue;
//			System.out.println(i);
//			}
//		}
