package ch11;

import java.io.FileWriter;
import java.io.IOException;

// p538
public class _06_FileWriterTest {
	public static void main(String[] args) {
		
		FileWriter fw = null;
		try {
			
			fw = new FileWriter("D:\\Dev88\\file_test\\6_FileWriter.txt");	// 자동생성
			fw.write('A');	// 문자 하나를 출력
			char[] buf = {'B', 'C', 'D', 'E', 'F', 'G'};
			fw.write(buf);	// 배열값을 출력
			fw.write(" happy all sunday ");	// 문자열 출력
			fw.write(buf, 2, 3);	// 배열 일부를 출력
			fw.write("88기");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("출력완료");
		
	}
}
