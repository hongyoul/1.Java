package method.quiz;

public class Quiz7 {

	// 문제
	// 세자리 정수의 각 자리수의 합을 구하는 메소드를 만들고 호출하세요.
	public static void resuit(int n1) {
//		모범 풀이
		int sum =0;
		//1의 자리
		sum = sum + (n1%10);
		//10의자리
		n1 = n1/10;
		sum = sum + (n1%10);
		//100의자리
		n1 = n1/10;
		sum = sum + n1;
 		System.out.println(sum);
		
//		내가 풀이한것 틀림
//		return sum = 0;
//		int sum1 = sum /100;
//		double sum2 = sum%10;
//		int sum3 = sum%10/10;
//		System.out.println(sum1 + sum2 + sum3);
	}
	public static void main(String[] args) {
		resuit(932);

	}

}
