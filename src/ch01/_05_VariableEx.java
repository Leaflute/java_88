package ch01;

public class _05_VariableEx {
	public static void main(String[] args) {
		
		/*
		 * 상수 : 프로그램이 실행되는 동안, 값이 변하지 않는 수 또는 변경 불가능한 수
		 * 		final 키워드는 변수에 값이 대입되고 나면, 변수값이 더이상 변경되지 않는다는 의미
		 * 		주로 대문자를 사용(가독성)
		 * 		값 변경 시 상수를 선언한 부분의 값을 변경
		 * 
		 * 		final
		 * 		1) 변수(상수) : 변수에 값 대입불가
		 * 		2) 메서드 : 재정의 불가
		 *		3) 클래스 : 상속불가 
		 */
	final double PI = 3.14; // 상수선언 및 초기화 [면접]
	double value = 0.5;
	
	double result = PI * value;
	System.out.println("result : " + result);
	
	// PI = 3.15; // 오류 : 상수는 final로 선언하며, 변경불가
	
	System.out.println("----------------");
	
	// 상수(MY_NAME, MY_AGE)를 이용하여 이름과 나이를 출력하시오
	final String MY_NAME = "나도웅";
	final int MY_AGE = 35;
	System.out.println("이름 : " + MY_NAME + ", 나이 : " + MY_AGE);
	
	}
}
