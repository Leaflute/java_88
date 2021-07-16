package ch02;

public class _11_WhileEx {
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
		
		// 1~10까지 출력 => 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		
		int i = 1;   		  // 1. 초기값 
		while (i<=10) {       // 2. 조건식      
			System.out.print(i + " "); 	
			i++; 		      // 3. 증감식
		}
		System.out.println("끝");	
		
		
		// 홀수 출력
		i = 1;
		while (i<=10) {
			System.out.print(i + " ");
			i += 2;
		}
		System.out.println("홀수");
		
		
		// 2의 승수 출력
		i = 1;
		while (i<=10) {
			System.out.print(i + " ");
			i *= 2;
		}
		System.out.println("2의 승수");
		
		System.out.println("--------------");
		
		int j = 1;
		int sum = 0;
		
		// 1~10까지의 합계 출력
		
		while (j<=10) {
			sum += j; // sum = sum + j;
			j++;		
		}
		System.out.println("1~10의 합: " + sum);
		
		j = 9;
		sum = 0;
		
		// 10 까지의 홀수의 합계 출력
				
		while(j>1) {
			sum += j;
			j -= 2;
		}
		System.out.println("10까지의 홀수 값의 합: " + sum);
	}
}		