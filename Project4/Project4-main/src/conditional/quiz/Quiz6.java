package conditional.quiz;

public class Quiz6 {

	public static void main(String[] args) {
		
//		int score = 90;
//		if (score>=90 && score<=99) { // 학생의 점수가 90점 이상이면
//			System.out.println("수");
//		}else if (score>=80 && score <=89) { // 점수가 80점 이상이면
//			System.out.println("우");
//		}else if (score>=70 && score<=79) { // 점수가 70점 이상이면
//			System.out.println("미");
//		}else {
//			System.out.println("양");
//		}
//		
//	}

		// 모범 정답
		int score = 82;
		if (score>=90 && score<=99) { // 학생의 점수가 90점 이상이면
			System.out.println("수");
		}else if (score>=80) { // 점수가 80점 이상이면 앞에 조건 if에서 이미 조건이 있기때문에 최대값을 적지 않아도 된다.
			System.out.println("우");
		}else if (score>=70) { // 점수가 70점 이상이면
			System.out.println("미");
		}else {
			System.out.println("양");
		}
		
	}
		
}
