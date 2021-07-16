package ch02;

public class _15_ForEx {
	public static void main(String[] args) {
		
		/*
		 * 반복문 - 조건이 만족하는 동안 실행
		 * 
		 * for문의 기본 구조
		 * for(초기값; 조건식; 증감식){
		 * 		수행문장1;
		 * 		수행문장2;
		 * }
		 */
		
		// 1~10까지의 합
		/*	num=1, sum=1
		 *  num=2, sum=3
		 *  ...
		 *  num=10, sum=55
		 */
		
		int sum = 0;
		
		for (int num = 1; num<=10; num++) {
			System.out.println(sum + " + " + num + " = " + (sum += num));
		}
		System.out.println("1 부터 10 까지의 합은 " + sum + "." );
	}
}
