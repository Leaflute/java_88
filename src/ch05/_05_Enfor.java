package ch05;

public class _05_Enfor {
	public static void main(String[] args) {
		/*
		 * p218
		 * - 향상된 for문 = 중요
		 * 배열의 처음부터 끝까지 모든 요소를 참조할 때 사용하는 반복문
		 * 배열 요소값을 순서대로 하나씩 가져와서 변수에 대입한다.
		 * 따로 초기화와 종료조건이 없기 때문에  모든 배열의 시작요소부터 끝요소까지 실행
		 * 
		 * for(변수 : 배열명){
		 * 		반복실행문;
		 * }
		 */
		
		String[] strArray = {"java", "oracle", "html", "javascript", "jsp", "spring"};
		
		for (int i = 5; i>=0; i--) {
			System.out.println(strArray[i]);
		}
		
		System.out.println();
		
		for (String language : strArray) {
			System.out.println(language);
		}
 		
	}
}
