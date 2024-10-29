package quiz;

public class Quiz7 {

	public static void main(String[] args) {
		
		double d =1.2;
		float f = 0.9f;
				
		int i = (int) d; // 1
		int i2 =(int) f; // 0
		int i3 = (int) d + (int) f; // 1 + 0
		int i4 = (int) (d + f); // int보다 ()이 우선 계산 1.2 + 0.9 = 2.1이고 (int)를 후에 계산하여 소수점 날려버리면 2가 된다.
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);		
		System.out.println(i4);		
	}

}
