package conditional;

public class Ex2 {

	public static void main(String[] args) {
		
		// 나이가 8살이상이면 '학교에 다닙니다', 그렇지 않으면 '학교에 다니지 않습니다'
		int age = 10; 
		if (age >= 8) { //나이가 8살이상이면
			System.out.println("학교에 다닙니다"); // 참이면 수행
		} else { //그렇지 않다면
			System.out.println("학교에 다니지않습니다"); // 거짓이면 수행
		}
	}
}

