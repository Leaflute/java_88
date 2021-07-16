package ch11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// p536
public class _05_FileReaderTest {
	public static void main(String[] args) throws IOException {
		
		// 문자를 읽어서 콘솔에 출력
		FileReader fr = null;
		try {
			// 파일 직접 생성(새로만들기 - 텍스트문서).. 저장시 인코딩을 UTF-8로 저장
			fr = new FileReader("D:\\Dev88\\file_test\\5_FileReader.txt");
			
			int i;
			while((i=fr.read()) != -1){
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(fr != null) fr.close();
		}
		
	}
}
