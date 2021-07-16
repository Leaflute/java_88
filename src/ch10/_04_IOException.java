package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _04_IOException {
	// JVM(java vitual machine)이 main() 호출
	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * p501 예외처리 미루기 - throws
		 * - 예뢰를 해당 메서드에서 처리(try-catch)하지 않고 미룬 후, 메서드를 호출해 사용할때 예외처리하는 방법
		 * - throw Exception
		 * 
		 */
		
		FileInputStream fis = null;
		
		fis = new FileInputStream("a.txt");
		
		System.out.println("정상종료");
	}
}
