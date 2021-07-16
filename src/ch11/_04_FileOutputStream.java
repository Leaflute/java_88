package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _04_FileOutputStream {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("D:\\Dev88\\file_test\\4_inputStream.txt"); // 파일명은 직접 작성
			fos = new FileOutputStream("D:\\Dev88\\file_test\\4_OutputStream.txt", true); // 파일 자동 생성
			int i;
			while((i = fis.read()) != -1) {	// input 파일을 1바이트씩 읽어서 아스키 코드로 변환.. 파일 끝까지
				System.out.print((char)i);	// 아스키값을 char형으로 변환 후에 파일에 출력
				fos.write(i);				// input 파일을 읽어서 output파일에 출력
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) fis.close();
			if(fos != null) fos.close();
		}
		System.out.println();
		System.out.println("--- end ---");
		
	}
}
