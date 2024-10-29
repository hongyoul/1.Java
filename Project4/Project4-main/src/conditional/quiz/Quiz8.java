package conditional.quiz;

public class Quiz8 {

	public static void main(String[] args) {
		
		// 내가 작성한 답
//		String score = "수";
		
//		switch (score) {
//		case "수":
//			System.out.println("90~99점은 '수'입니다");			
//			break;
//			
//		case "우":
//			System.out.println("80~89점은 '우'입니다");
//			break;
//	
//		case "미":
//			System.out.println("70~79점들은 '미'입니다");
//			break;
//
//		default:
//			System.out.println("그외는 점수는 '양'입니다");
//			break;
//		}
		
		// 모범답안
		int score = 88;
		int value = score / 10; // 몫을 먼저 구하고 switch에 명확한 제시값을 제안한다.

		switch (value) {
		case 9: // 90~99 이런식의 포괄적인 것을 나올수 없다.
			System.out.println("수");
			break;
		case 8: // 80~89
			System.out.println("우");
			break;
		case 7: // 70~79
			System.out.println("미");
			break;
		default:
			System.out.println("양");
			break;
		}
		// 이와 같이 조건이 복잡한 경우에는 switch문보다 if문이 편리하다.
	}

}
