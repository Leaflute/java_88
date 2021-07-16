package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 입출력 예외처리 IOException - FileNotFoundException
public class _03_IOException {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("1.txt");
		} catch (FileNotFoundException e) {		// file이 존재하지 않을 경우
			System.out.println("getMessage() => " + e.getMessage());
			e.printStackTrace();
			return;	// 함수 종료: "정상종료"가 출력이 안됨
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("finally 문장이므로 항상 수행됩니다.");	//return이 있어도 출력이됨
		}
		System.out.println("정상종료");
	}
	
}
