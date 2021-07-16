package ch11;

import java.io.IOException;

// p516
public class _02_ByteIuputTest {
	public static void main(String[] args) {
		System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르시오.");
		
		try {
			while(true) {	// 무한루프
				int i = System.in.read();
				if (i == 13) {	// 13: ASCII값 Enter, 10: 줄바꿈
					System.out.println("출력완료");
					break;
				}
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
