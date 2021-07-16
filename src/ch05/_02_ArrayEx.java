package ch05;

public class _02_ArrayEx {
	public static void main(String[] args) {
		
	   	  /* 배열(Array) : 같은 타입의 대량의 데이터를 저장할 수 있는 저장장소이다.
	       * 방법1) 선언과 생성을 따로 한다.
	       *       int[] scores; // 선언
	       *      scores = new int[갯수];   // 생성
	       *      scores[index] = 값;
	       * 
	       * 방법2) 선언과 생성을 동시에 한다... 추천
	       *      배열자료형[] 배열명 = new 배열자료형[배열갯수];
	       *      배열명[index] = 값;
	       *      
	       * 방법3)  int[] scores = new int[] {1,2,3,4,5}  // 개수는 생략해야 함   
	       *     오류) int[] scores = new int[5]{1,2,3,4,5}; // 갯수가 있으므로 오류발생
	       *     int[] 배열명;
	       *     배열명 = new 자료형[] {값1, 값2, 값3..값n};  //  new 자료형[] 생략시 오류발생
	       * 
	       * 방법4) 선언과 할당을 동시에 한다... 제일 많이 사용한다.
	       * 		배열자료형[] 배열명 = {값1, 값2, 값3..값n};
	       */      
		
		// 방법2.
		String[] drink = new String[5];
		
		drink[0] = "아메리카노";
		drink[1] = "카페모카";
		drink[2] = "에스프레소";
		drink[3] = "카페라떼";
		drink[4] = "헤이즐넛";
		
		for (int i=0; i<drink.length; i++) {
			System.out.println(drink[i]);
		}
		
		System.out.println();
		
		// 방법4.
		String[] soda = {"코카콜라", "칠성사이다", "닥터페퍼", "밀키스", "마운틴듀"};
		
		for (int i=0; i<soda.length; i++) {
			System.out.println(soda[i]);
		}
		
	}
}
