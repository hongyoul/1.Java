package main;

// 준수사항에 맞게 'Quiz2'클래스를 생성하세요.
// 월에 따라 계절을 출력하는 프로그램을 구현하세요.
// 3~5월 "현재 계절을 봄입니다."
// 6~8월 "현재 계절은 여름입니다."
// 9~11월 "현재 계절은 가을입니다."
// 12월~2월 "현재 계절은 겨울입니다."
// 이외는 “잘못된 값입니다. "
public class Quiz2 {

	public static void main(String[] args) {
		
		int num = 3;
		
		if (num >= 3 && num <=5 ) {
			System.out.println(num + "월은 봄입니다.");
		}else if (num >= 6 && num <=8) {
			System.out.println(num + "월은 여름입니다.");
		} else if (num >= 9 && num <=11) {
			System.out.println(num + "월은 가을입니다.");
		} else if (num == 12 || num == 1 || num == 2) {
			System.out.println(num + "월은 겨울입니다.");
		} else {
			System.out.println("잘못된 값입니다.");
		}
	}

}
