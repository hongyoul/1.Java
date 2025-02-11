package main;

import java.io.FileReader;
import java.io.IOException;

public class Ex8 {

	public static void main(String[] args) throws IOException {
		
		// reader.txt 파일 먼저 만들기
		//바이트 입력 스트림 생성
//		FileInputStream fis = new FileInputStream("reader.txt");
//		
//		while (true) {
//			int i =fis.read(); //1바이트씩 읽어오기
//			if (i==-1) { // 파일 끝에 도달하면 반복 종료
//				break;
//			}
//			System.out.print((char)i); //바이트->문자로 변환 실행 = 깨짐
//		}
		
		//문자 기반 입력 스트림 생성
		FileReader fr = new FileReader("reader.txt");
		
		while (true) {
			int i =fr.read(); //2바이트씩 읽어오기
			if (i==-1) { // 파일 끝에 도달하면 반복 종료
				break;
			}
			System.out.print((char)i); //한글이 제대로 읽어옮(출력됨)
		}
		
		
		
	}
}
