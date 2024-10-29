package conditional.quiz;

public class Quiz5 {

	public static void main(String[] args) {
		
		int month = 13;
		if (3<=month && month<=5) {
			System.out.println("현재 계절은 봄입니다");
		} else if (6<=month && month<=8 ) {
			System.out.println("현재 계절은 여름입니다");
		}else if (9<=month && month<=11) {
			System.out.println("현재 계절은 가을입니다");
		}else if (month==12 || month==1 || month==2) { // 범위 측정이 안되기 때문에 하나씩 식을 만들어야 함.
			System.out.println("햔재 계절은 겨울입니다");
		}else {
			System.out.println("월이 잘못되었습니다");
		}
		

	}

}
