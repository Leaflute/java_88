package ch02;

public class _14_ForEx {
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
		
		//GoodLuck1 GoodLuck2 GoodLuck3 GoodLuck4 GoodLuck5
		
		for (int i=1; i<=5; i++) {
			System.out.print("GoodLuck" + i + " ");
		}
		
		System.out.println();
		
		for (int i=5; i>0; i--) {
			System.out.print("GoodLuck" + i + " ");
		}
		
		// Hello~ 무한루프 (멈추기 위해서는 터미네이터 버튼을 누름)
		for( ; ; ) {                // 조건이 없음
			System.out.println("Hello~~");
		}
	}
}
