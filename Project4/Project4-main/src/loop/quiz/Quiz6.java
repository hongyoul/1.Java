package loop.quiz;

public class Quiz6 {

	public static void main(String[] args) {
	
		// 1~100까지 더하고, 합이 500이 넘어가면 빠져나가게 한다
		int sum = 0;
		int i;
		
		for (i = 1; i <= 100; i++) {
			sum = sum + i;
		
			if (sum >= 500) {
				break;
			}
			
		}

		System.out.println("i : " + i + ", sum : " + sum);
	}

}
