package collection;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		
		System.out.println("리스트 요소 삭제 전: " + list);
		
		//리스트 안에 'A'가 있는지 확인 
		for(int i=0; i<list.size(); i++){
			
			char ch = list.get(i); //오토박싱
			
			if(ch == 'A') {
				list.remove(i); //해당 문자가 A라면 리스트에서 삭제
			}

		}
		
		System.out.println("리스트 요소 삭제 후: " + list);
	}
}



