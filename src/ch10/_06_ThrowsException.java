package ch10;

import java.util.Scanner;

public class _06_ThrowsException {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// readAge() : 나이 입력받아 출력
		// 입력받은 나이가 0세 미만이면 예외발생 : ArithmeticException
		
		try {
			int age = readAge();
			System.out.println("나이: " + age);
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.out.println("경고: " + e.getMessage());
		} finally {
			input.close();
		}
		System.out.println("정상 종료");
		
	}
	
	static int readAge() throws ArithmeticException {
		System.out.print("나이를 입력하시오. ");
		int age = input.nextInt();
		if(age<0) {
			throw new ArithmeticException("나이는 0세 이상으로 입럭하시오.");
		} else {
			return age;
		}
	}
}
