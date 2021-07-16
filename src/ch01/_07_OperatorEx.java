package ch01;

public class _07_OperatorEx {
	public static void main(String[] args) {
		/*
		 * 연산
		 * 1. 사칙연산자
		 */
		System.out.println("=== 사칙 연산자 예제 ===");
		
		int num1 = 8; // 변수선언, 초기화
		int num2 = 4; // 변수선언, 초기화
		
		int addR = num1 + num2;
		int subR = num1 - num2;
		int mulR = num1 * num2;
		int divR = num1 / num2;
		int modR = num1 % num2;
		
		System.out.println("addR : " + addR);
		System.out.println("subR : " + subR);
		System.out.println("mulR : " + mulR);
		System.out.println("divR : " + divR);
		System.out.println("modR : " + modR);
		System.out.println(addR + "," + subR + "," + mulR + "," + divR + "," + modR);
		
		/*
		 * 연산 p.
		 * 2. 증감연산자 (증가연산자 ++, 감소연산자 --)
		 * 1) 전위연산자 : y = ++x  -> ++x; y = x;
		 *   a. x값을 1증가한 후  b. 증가값을 y에 대입한다.
		 *  
		 * 2) 후위연산자 : y = x++  -> y = x; x++;
		 *   b. x값을 y에 대입 한 후  b. x값을 증가시킴.
		 *  
		 */
		
		System.out.println("=== 사칙 연산자 예제 ===");
		
		// 전위연산자(앞에 붙이는 순간 변수가 영향을 받음)
		int c = 5;
		int nextC = ++c; // ++c => c = c+1;
		System.out.println("c : " + c); // C : 6
 		System.out.println("nextC : " + nextC); // nextC : 6
 		
 		// 후위연산자(연산이 끝나고 나오는 변수에 영향이 생김)
 		int d = 5;
 		int nextD = d++; // nextD = d++ ==> next에 d를 대입, d를 1증가
 		System.out.println("d : " + d); // d : 6
 		System.out.println("nextD :" + nextD); // nextD : 5
 		
 		int e=2, f=3, result=0;
 		System.out.println(++e + --f * e--); // 9 = 3 + 2 * 3
 		System.out.println("e = " + e); // e = 2 // 후위연산자 작동
 		System.out.println("f = " + f); // f = 2
 		
 		result = ++e + --f * e--;
 		System.out.println("result = " + result); // 6 = 3 + 1 * 3
 		System.out.println("e = " + e); // e = 2
 		System.out.println("f = " + f); // f = 1
 		
 		int h = 2, i = 3;
 		System.out.println(h++ + --i * h--); // 8 = 2 + 2 * 3 (맨 앞 h변수의 후위연산자 작동)
 		System.out.println("h = " + h); // h = 2 (후위연산자 작동)
 		System.out.println("i = " + i); // i = 2
 		
 		/*
 		 *  3. 관계연산자 : 같다(==), 같지 않다(!=), >, <, >=, <=
 		 *  	- 결과값은 boolean 타입 : 참(true) 거짓(false) 
 		 */
 		
 		System.out.println("===== 관계연산자 예제 =====");
 		int c1 = 10;
 		int c2 = 20;
 		System.out.println("c1 == c2 : " + (c1 == c2)); // false
 		System.out.println("c1 != c2 : " + (c1 != c2)); // true
 		System.out.println("c1 > c2 : " + (c1 > c2)); // false
 		System.out.println("c1 >= c2 : " + (c1 >= c2)); // false
 		System.out.println("c1 < c2 : " + (c1 < c2)); // true
 		System.out.println("c1 <= c2 : " + (c1 <= c2)); // true
 		
 		/*
 		 *  연산
 		 *  4. 복합연산자
 		 */
 		System.out.println("====== 복합연산자 예제 ======");
 		int ii = 5;
 		ii += 10; // ii = ii + 10 ; 
 		System.out.println("ii : " + ii); // ii = 15 
 		
 		ii -= 10; // ii = ii - 10;
 		System.out.println("ii : " + ii); // ii = 5
 		
 		ii *= 10; // ii = ii * 10;
 		System.out.println("ii : " + ii); // ii = 50
 		
 		ii /= 10; // ii = ii / 10;
 		System.out.println("ii : " + ii); // ii = 5
 		
 		/*
 		 * 연산 p77
 		 *  5. 논리연산자 : 1 ==> 참(True), 0 ==> 거짓(false) 
 		 *  &&(논리곱) :  x && y = x와 y가 둘 다 참일 때 참, 그렇지 않으면 거짓
 		 *  ||(논리합) :  x || y = x와 y 둘 중 하나가 참이면 참, 둘 다 거짓이면 거짓
 		 */
 		System.out.println("===== 논리연산자 예제 =====");
 		int z1 = 4, y1 = 5;
 		
 		System.out.println((z1 == 4) && (y1 == 5)); // T && T ==> true
 		System.out.println((z1 == 4) && (y1 == 10)); // T && F ==> false
 		
 		System.out.println((z1 == 4) || (y1 == 8)); // T || F ==> true
 		System.out.println((z1 == 8) || (y1 == 10)); // T || F ==> false
 		
 		/*
 		 * 연산
 		 *  6. 삼항연산자 : 항이 3개인 연산자를 의미
 		 *  			 결과 = 조건식? 결과1 : 결과;
 		 *  			 조건식이 참이면 결과 1을 수행해서 결과 대입, 거짓이면 결과 2를 수행해서 대입
 		 */
 		int score = 90;
 		
 		// 결과 = 조건식 ? 참결과 : 거짓결과
 		String resultStr = (score >= 60) ? "합격" : "불합격";
 		System.out.println("합격여부 : " + resultStr); // 합격여부 : 합격
 		
	}
	
}
