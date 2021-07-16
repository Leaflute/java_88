package ch10;

import java.util.Scanner;

// RuntimeException - ArithMeticException
public class _02_ArithMeticException {
	public static void main(String[] args) {
		/*
		 * p487
		 * [면접]
		 * 예외 처리 목적: 정상종료
		 * 
		 * - 문법
		 * try { 
		 * 		// 예외가 발생할 수 있는 코드 부분
		 * } catch (처리할 예외타입 e) {
		 * 		// try 블럭 안에서 예외가 발생했을 때 예외를 처리하는 부분
		 * } finally {
		 * 		// 항상 수행되는 부분(예외가 발생하지 않더라도), 주로 자원해제를 위한 close() 문장이 온다.
		 * }
		 * 
		 */
		
		System.out.println("=== 두 개의 정수를 입력 ===");
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("첫 번째 값 입력 : ");
			int num1 = input.nextInt();
			
			System.out.print("두 번째 값 입력 : ");
			int num2 = input.nextInt();
			
			System.out.println("몫 : " + num1 / num2);
			System.out.println("나머지: " + num1 % num2);
		} catch (ArithmeticException e) {
			System.out.print("0으로 나눌 수 없습니다. ");
			System.out.println(e.getMessage());		// / by zero
		} finally {
			System.out.println("=== 그냥 나옴 ===");
		}
		System.out.println("정상종료");
	}
}
