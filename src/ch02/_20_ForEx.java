package ch02;

public class _20_ForEx {
	public static void main(String[] args) {
		/*
		 * break문 예제
		 * - 반복문이 중첩되어 있을 경우 break;는 가장 가까운 반복문만 종료
		 * - 바깥쪽 반복문도 종료시키려면 반복문에 이름(라벨)을 붙이고 , "break 이름;" 사용
		 * - continue문은 그 이후의 문장을 수행하지 않지만, break문은 반복문을 수행하지 않고 빠져나옴.
		 *  
		 */
		
		// p121 sum>=100이면 빠져나옴
		
		int sum = 0;
		int num = 1;

		for (num=1 ; ; num++) {
			sum += num;
			if (sum>=100) break;
		}
		System.out.println("num: " + num);
		System.out.println("sum: " + sum);
		

		
	}
}
