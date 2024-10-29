package main;

// 준수사항에 맞게 'Quiz1'클래스를 생성하세요.
// 수학, 영어, 국어 과목의 점수가 각각 90점, 70점, 100점 입니다.
// 모든 과목의 총점과 평균을 구하세요. 
public class Quiz1 {

	public static void main(String[] args) {

		int Math = 90;
		int Eng = 70;
		int Kor = 100;
		
		int sum = Math  + Eng + Kor;
		double average = sum / 3.0;
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + average);
		
	}

}
