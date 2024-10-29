package arraylist;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);

		for (int i = 0; i < list.size(); i++) { // list.size = 크기를 받아오기 위해 'size'를 사용, 배열에서는 'legth'로 사용함
			int num = list.get(i);
			System.out.print(num + " ");
		}
	}

}
