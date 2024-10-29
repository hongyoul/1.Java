package loop.quiz;

public class Quiz10 {

	public static void main(String[] args) {

		// 중첩반복믄을 사용해서 삼각형을 그려보세요.
		for (int j = 1; j <=5; j++) { // 삼각형의 높이
			// 외부포문의 j를 사용
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
	
	
// 1. 반복문없이 작성
//System.out.println("*");
//System.out.println("**");
//System.out.println("***");
//System.out.println("****");
//System.out.println("*****");

//2. 반복문 사용하여 작성
//for (int i = 1; i <= 5 ; i++) {
//System.out.println("*****");

// 문제풀이
// 도형의 패턴을 찾아서 반복문과 조건문으로 표현
//* 패턴 찾기


