package main;

// 준수사항에 맞게 'Quiz4'클래스를 생성하세요.

// 다음과 같이 함수를 만드세요. 정수형 배열을 입력 받아 합계를 구하고 반환하세요.
// 단, 배열의 크기가 3보다 작으면, -999을 반환하고 함수를 종료하세요.
// 메인함수에서 5개 크기의 정수형 배열을 생성하세요.
// 값의 목록을 다음과 같이 초기화하세요 {2, 4, 6, 8, 10} 배열을 전달하여 함수를 호출하고 결과를 출력하세요. 그리고 2개 크기의 정수형 배열을 생성하세요. 
// 값의 목록을 다음과 같이 초기화하세요 {2, 4} 배열을 전달하여 함수를 호출하고 결과를 출력하세요.

public class Quiz4 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		int[] arr = new int[5];
		
		int[] arr1 = { 2, 4, 6, 8, 10 };
		
		for (int i = 0; i < arr1.length; i++) {
			sum = arr1[i];
		}
			System.out.println("첫번째 배열의 합계:" + sum);
		
			
			
		int sum1 = 0;
		
		int[] arr2;
		arr2 = new int[] {2,4};
		for (int j = 0; j < arr2.length; j++) {
			if (arr2[j] >3) {
				sum1 = arr2[j];
			} else {
				System.out.println("두번째 배열의 합계: -999");
			}
		}
			
	}

}
