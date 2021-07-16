package ch10;

// 실행 예외처리 RuntimeExption - ArrayException
public class _01_ArrayException {
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
		
		int[] array = new int[5];
		
		try {
			System.out.println("=== try 부분 ===");
			for(int i=0; i<=array.length; i++) {
				array[i] = i;
				System.out.println(array[i]);
			}	
		} catch (ArrayIndexOutOfBoundsException e) {	// 다형성이 적용되어 예외처리 타입에 Exception으로 줘도 차이가 없음
			System.out.println("=== 예외처리부분 ===");	
			System.out.println("e.getMessage() : " + e.getMessage());
			e.printStackTrace();	// 예외의 종류를 제공
		} finally {
			System.out.println("=== finally부분 ===");
		}
		System.out.println("정상 종료");
	}
}
