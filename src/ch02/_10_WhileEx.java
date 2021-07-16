package ch02;

public class _10_WhileEx {
	public static void main(String[] args) {
		/*
		 * 반복문: 조건식이 참인 동안 반복(while문, for문
		 *		 1. 초기값 -> 2. 조건식 -> 3. 증감식
		 * 초기값
		 * while(조건식) {
		 * 	수행문1;
		 * 	수행문2;  ....
		 * 	증감식;
		 * }
		 * 수행문3
		 */
		
		// 출력 =? Happy1~~ Happy2~~ Happy3~~ Happy4~~ Happy5~~
		// 1. 초기값
		int i = 1 ;
		while(i<=5) {                 // 2. 조건식
			System.out.println("Happy" + i + "~~");	
			i++;	                  // 3. 증감식			
		}
		System.out.println("끝");
		
	}
	
}
