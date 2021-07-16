package ch02;

import java.util.Scanner;

public class _16_ForEx {
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
		
		// 3단을 입력받아 구구단 출력
		/*
		 * ----------
		 * *** 3단 ***
		 * ----------
		 * 3 * 1 = 3
		 * 3 * 2 = 6
		 * ...
		 * 3 * 9 = 27
		 * ----------
		 */
		
		int dan = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("몇 단을 출력하시겠습니까? ");
		dan = input.nextInt();
		
		System.out.println("----------");
		System.out.println("***" + dan + "단***");
		for (int i = 1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		System.out.println("----------");
		System.out.println(dan + "단을 출력했습니다.");
		input.close();
	}
}
