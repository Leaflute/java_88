package ch02;

public class _19_ForEx {
	public static void main(String[] args) {
		
		/*
		 * continue문 예제
		 * continue문은 반복문과 함께 쓰인다.
		 * 반복문 안에서 continue문을 만나면, 그 이후의 문장은 수행하지 않음.
		 * for문의 처음으로 돌아가 증감식을 수행한다
		 * 
		 */
		
		// 1~100 홀수의 합계 : total
		
		int total = 0;
		
		for (int num=1; num<=100; num++) {			
			if (num%2==0) continue; // if문 수행문에 한 단어만 오는 경우에는 {}를 사용하지 않아도 됨
			total += num;	
		}
		System.out.println("1부터 100까지의 홀수의 합계는 " + total);
		
	}
}
