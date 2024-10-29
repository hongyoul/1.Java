package loop.quiz;

public class Quiz8 {

	public static void main(String[] args) {
		
		for (int dan = 2; dan <= 9; dan++) {
			for (int times = 1; times <= 9; times++) {
				if ( dan % 3 == 0) {
					System.out.println(dan + "X" + times + "=" + dan * times);
			}
			}
			System.out.println();				
		}

	}

}


// 1. continue 사용
//    for (int dan = 2; dan <= 9; dan++) {
//		if ( dan % 2 == 0) {
//        continue;
//      	for (int times = 1; times <= 9; times++) {
//		 System.out.println(dan + "X" + times + "=" + dan * times); }}}

// 2. continue 사용 X
//    for (int dan = 2; dan <= 9; dan++) {
//	    if ( dan % 2 == 1) {
//	   for (int times = 1; times <= 9; times++) {
//	 System.out.println(dan + "X" + times + "=" + dan * times); }}}

