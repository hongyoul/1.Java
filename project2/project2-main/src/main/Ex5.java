package main;

public class Ex5 {

	public static void main(String[] args) {
		
		// char형는 한글자 문자 저장 가능
		char ch1 = 'A'; // 문자를 작은 따음표로 감싸야함
		System.out.println(ch1); // A
		
		// 문자를 int형으로 변환하면 그 문자에 해당되는 아스키값이 출력됨
		System.out.println((int) ch1); // 65
		
		char ch2 = 66; //cher형 변수는 숫자도 저장 가능
		System.out.println(ch2); // 문자가 출력됨
		
		char ch3 = '\n'; // 한줄띄긴
		char ch4 = '\t';
		System.out.print(ch3);
		System.out.print("안녕하세요");
		System.out.print(ch4);
		System.out.print("저는홍율입니다");

		System.out.println("\n안녕하세요\t저는홍율입니다");
	}

}
