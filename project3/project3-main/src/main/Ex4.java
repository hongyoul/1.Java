package main;

public class Ex4 {

	public static void main(String[] args) {
		
		// 수학점수와 영어점수 총점 구하기
		int mathScore = 93;
		int engScore = 70;

		// 총점 계산
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		// 평균 점수 계산
		// 1. int형 변수에 결과를 저장하고 2로 나누기
		int avgScore1 = totalScore / 2;
		System.out.println(avgScore1);
		
		// 2. double형 변수에 결과 저장하고 2로 나누기
		double avgScore2 = totalScore / 2;
		System.out.println(avgScore2);
		
		// 3. double형 변수에 결과 저장하고 2.0으로 나누기
		double avgScore3 = totalScore / 2.0;
		System.out.println(avgScore3);
		
	}

}
