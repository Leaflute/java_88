package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_FileInputStream {
	public static void main(String[] args) throws IOException {
		
		// 3_InputStrea.text를 byte 단위로 읽어서 콘솔에 출력, 한글은 2Byte이므로 깨짐.
		// 탐색기의 파일명이 보이도록 체크
		
		FileInputStream fis = null;
		
		// 예외 발생 => try -> catch -> finally
		// 예외 발생 안 할 시 => try -> finally
		
		try {
			fis = new FileInputStream("D:\\Dev88\\file_test\\3_InputStream.txt");	// 먼저 파일을 작성해 경로와 같이 복사해서 가져와야함
			
			int i;
			while((i = fis.read()) != -1) {	// 파일의 끝에 도달하면 -1을 반환
				System.out.print((char)i);// 출력
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fis.close();
		}
		System.out.println();
		System.out.println("-----");
		System.out.println("~end~");
	}
}
