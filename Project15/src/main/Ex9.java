package main;

import java.io.FileWriter;
import java.io.IOException;

public class Ex9 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("writer.txt");
		
		// 문자 하나 출력
		fw.write('A');
		
		// 문자열 출력
		fw.write("안녕하세요");
		
		// 특수기호 출력
		fw.write('\n');
	
		// 배열 출력
		char[] arr = {'a','b','c'};
		fw.write(arr);
		
		//fikewriter는 버퍼를 사용하여, 데이터를 모았다가 한번에 출력함
		//버퍼: 데이터를 임시로 저장하는 공간
		fw.flush();
		
	}

}
