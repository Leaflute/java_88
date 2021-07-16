package ch02;

public class _12_WhileEx {
	public static void main(String[] args) {
		/*
		 * 구구단을 출력
		 * === 2단 ===
		 * 2 * 1 = 2
		 * ...
		 * 2 * 8 = 16
		 * 2 * 9 = 18
		 * ==========
		 */
		
		// 1. 초기값
		int dan = 2; // dan * i = result
		int i = 1;

		System.out.println("===== " + dan + "단 =====");
		System.out.println("==============");
		while (i<=9) {        // 2. 조건식  
			System.out.println(dan + " 곱하기 " + i + " 는 " + (dan * i));	
			   i++;           // 3. 증감식
		}

	}
	
}
