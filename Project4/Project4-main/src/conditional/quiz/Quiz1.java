package conditional.quiz;

public class Quiz1 {

	public static void main(String[] args) {

		//내가 처음 작성한 답안
//		int x = 10;
//		int y = 12;
//		if (x % 2 == 0)||(y % 3 == 0) {System.out.println("2 또는 3의 배수입니다");

		// 정답
		int x = 12;
		if ((x % 2 == 0) || (x % 3 == 0)) {
			System.out.println(x + "는 2 또는 3의 배수입니다");
		}
	}

}
