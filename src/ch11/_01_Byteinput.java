package ch11;

import java.io.IOException;

// p516
public class _01_Byteinput {
	public static void main(String[] args) {
		
		System.out.print("알파벳 하나를 쓰고  [Enter]를 누르시오.");
		try {
			int i = System.in.read();		//콘솔창에서 1Byte만 읽음
			System.out.println("i: " + i);	//ASCII값 출력 
			System.out.println((char)i);	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
