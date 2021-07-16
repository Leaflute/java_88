package ch02;

public class _17_ForEx {
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
		
		// 구구단 전체 출력

		System.out.println("==== 구구단을 외자 ====");
		System.out.println("-------------------");
		
		for (int dan=2; dan<=9; dan++) {
			System.out.println("******* " + dan + "단 *******");
			System.out.println("-------------------");
			for (int i = 1; i<=9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
		}
		System.out.println("-------------------");		
		System.out.println("구구단 종료");
	}
}
