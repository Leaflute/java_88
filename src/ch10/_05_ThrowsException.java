package ch10;

import java.util.Scanner;

public class _05_ThrowsException {
	
	static Scanner input = new Scanner(System.in);	
	
	public static void main(String[] args) {	//throws Exception{	// 3. JVM에 예외처리를 넘김
		
		/*
		 * 1. 예외 발생
		 * throw new Exception(메세지);
		 * 2. 예외 던지기
		 * throws Exception
		 * 3. 예외 처리
		 * catch(던진 Exception e) { e.getMessage();}
		 */
		
		// 입력받은 이름이 두 자 미만이면 예외 발생
		// 3. 예외 처리: try-catcb-finally
		try {
			String strName = readName();
			System.out.println("이름: " + strName);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("예외메세지 : " + e.getMessage());
		} finally {
			input.close();
		}
		System.out.println("정상종료");
	}
	
	static String readName() throws Exception {	// 2. 상위 메서드에게 예외를 미루는 throws Exception
		System.out.print("이름을 입력하시오.");
		String name = input.next();
		if (name.length()<2) {
			// 1. 강제 예외 발생: throw new Exception(message);
			throw new Exception("이름은 두 글자 이상입니다.");	// Exception 클래스의 매개변수 생성자 호출.. 멤버변수 message 전달
		} else if (name.length()>5) {
			throw new Exception("이름은 네 글자보다 길면 안됩니다.");
		} else {
			return name; 
		}
		
	}
}
