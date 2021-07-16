package ch02;

public class _13_WhileEx {
	public static void main(String[] args) {
		/*
		 * test02 1. 초기값(dan) int dan = 2;
		 * 
		 * while (dan 2.조건식) {
		 * 
		 * s-1. 초기값(i) while(i s-2.조건식(i)) {
		 * 
		 * s-3. i 증감식 }
		 * 
		 * 3. dan 증감식
		 */
		
		// dan    i=1       i=2         i=9 
		// 2	  2*1=2    2*2=4  ... 2*9=18
		// 3      3*1=3    3*2=6  ... 3*9=27
		// ...
		// 9 	  9*1=9    9*2=18 ... 9*9=81

		int dan = 2; // dan * i = result

		while (dan <= 9) {                   // 2. 조건식
			System.out.println("===== " + dan + "단 =====");
			System.out.println("==============");
			int i = 1;
			while (i <= 9) {                 // 2-1. 조건식
				System.out.println(dan + " 곱하기 " + i + " 는 " + (dan * i));
				i++;                         // 3-1. 증감식
			}
			dan++;                           // 3. 증감식
		}
		System.out.println("===== 구구단 종료 =====");

	}
}
