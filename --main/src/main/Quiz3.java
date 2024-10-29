package main;

// 준수사항에 맞게 'Quiz3' 클래스를 생성하세요.
// 1부터 100까지 더하다가 합이 300이 넘어가면 중단하세요.
// 마지막으로 더한 수와 합을 출력하세요. 
public class Quiz3 {

	public static void main(String[] args) {

		int i;
		int sum = 0;
		
		
		for (i = 1; i <= 100; i++) {
				sum = sum + i;		
			if (sum >= 300) {
				break;
			}
			
		}
		
		System.out.println("i: "+ i + "," + "sum: " + sum);
	}

}
