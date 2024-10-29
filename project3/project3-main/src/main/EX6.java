package main;

public class EX6 {

	public static void main(String[] args) {
		
		boolean resul1 = (5 > 0) && (10 > 0); // true && true
		boolean resul2 = (5 > 0) && (10 < 0); // true && false
		boolean resul3 = (5 > 0) || (10 > 0); // true || true
		boolean resul4 = (5 > 0) || (10 < 0); // true || false
		boolean resul5 = !(5 > 0); // !(true)
		
		System.out.println(resul1);
		System.out.println(resul2);
		System.out.println(resul3);
		System.out.println(resul4);
		System.out.println(resul5);
		
	}

}
