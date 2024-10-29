package quiz;

public class Quiz8 {

	public static void main(String[] args) {
		
		int x = 80;
		int y = 5;

		boolean resul1 = (50 < x) && (x < 100);
		boolean resul2 = (y < 10) || (y > 30);
		System.out.println("x는50보다 크고 100보다 작다: " + resul1);
		System.out.println(resul2);
		
	}

}
