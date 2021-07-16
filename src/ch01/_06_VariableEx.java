package ch01;

public class _06_VariableEx {
	public static void main(String[] args) {
		/*
		 *  형변환-1. p64
		 *  
		 *  1. 자동적인 형변환(확대 형변환, 묵시적 형변환)
		 *     - 데이터 손실되지 않거나 , 손실이 제한적인 범위 내에서  묵시적으로 형변환한다.
		 *       자료형이 다른 변수에 값을 할당하는 경우, 형변환을 생략할 수 있다.
		 *       
		 *     - 데이터 큰 타입 = 데이터 작은 타입; (예; float f = 10; // f에 10.0 대입
		 *     - 자료형이 다른 값을 연산하는 경우;  (예; double d = 10.0 + 30; // double d = 10.0 + 30.0;		 		 
		 *       
		 *  2. 강제적인 형변환(축소 형변환, 명시적 형변환)
		 *     - 명시적으로 형변환하는 것을 캐스팅(Casting)이라고 한다.
		 *     - Casting은 생략할 수 없으며, 생략시 컴파일 에러가 발생하므로 반드시 명시적으로 형변환해야 한다.
		 *     - 강제로 형변환하므로 데이터 손실 위험이 있다.
		 *     
		 *     - 데이터 작은 타입 = (작은 타입)데이터 큰 타입; 
		 */
		System.out.println("------ 형변환-1 예제 ------");
		
		// 1. 자동적인 형변환(확대 형변환, 묵시적 형변환) : 데이터 큰타입 = 데이터 작은타입;
		
		double dVal = 20;
		System.out.println("dVal : " + dVal); // dVal : 20.0
		
		float fVal = 20.5f; // 20.5f + 10.0f
		System.out.println("fVal : " + fVal); // fVal : 30.5
		
		// 2. 강제적인 형변환(축소 형변환, 명시적 형변환) : 데이터 작은 타입 = (작은 타입)데이터 큰 타입;
		int iVal = (int)10.5;
		System.out.println("iVal : " + iVal); // iVal : 10

		/*
		 *  형변환-2.
		 *  3. int(4Byte)보다 작은 작료형 int형으로 형변환 후 계산
		 *     예) byte + short -> int + int
		 *  
		 *  4. 두 개의 피연산자 중 표현 범위가 큰 쪽에 맞춰서 형변환 후 계산  		 
		 */
		
		System.out.println("------ 형변환-2 예제 ------");
		
		// int*int=int, int/int=int, int+int=int, int-int=int
		int iVal2;
		double fVal2;
		
		iVal2 = 5 / 4; // int = int / int; => int iVal2 = 1; 1.25 -> 1 - > 대입시 1
		System.out.println("iVal2 : " + iVal2); // iVal2 : 1 <--- 원래는 1.25인데 int로 강제변환
		
		fVal2 = 5 / 4; // int = int / int; => double fVal2 = 1.0; 1.25 -> 1 -> 대입시 1.0 
		System.out.println("fVal2 : " + fVal2); // fVal2 : 1.0
		
		fVal2 = 5.0 / 4.0; // double = double / double => double fVal2 = 1.25
		System.out.println("fVal2 : " + fVal2); // fVal2 : 1.0
		
		// 형변환보다 ()안의 계산이 우선
		iVal2 = (int)(2.5 + 3.3); // int iVal2 = (int)(double + double); // (int)(5.8) => 5
		System.out.println("iVal2 : " + iVal2); // iVal : 5
		
		// iVal2 = (int)2.5 + 3.3; // 컴파일 오류
		
		iVal2 = (int)2.5 + (int)3.3; // 2 + 3
		System.out.println("ival2 : " + iVal2); // iVal : 5
		
		int gg = 1000000;
		int jj = 2000000;
		long ll = 2000000L;
		
		int e1 = gg * jj;
		System.out.println("e1 : " + e1); // e1: -1454759936 // int형 범위를(-21억~21억) 초과
		
		long e2 = gg * jj;
		System.out.println("e2 : " + e2); // e2: -1454759936 // int형으로 연산 후에 대입 => long형에 대입되기 전부터 연산결과가 int형의 범위를 초과

		long e3 = (long)(gg * jj); 
		System.out.println("e3 : " + e3); // e3: -1454759936 // int형으로 연산 후에 대입 => long형으로 형변환하기 전부터 연산결과가 int형의 범위를 초과
		
		// 형변환2. 4번 적용
		long e4 = (long)gg * jj; // long * int -> long * long -> long
		System.out.println("e4 : " + e4); // e4 : 2000000000000
		
		long e5 = (long)gg * ll; // int * long -> long * long -> long
		System.out.println("e5 : " + e5); // e5 : 2000000000000
		
		float e6 = 1000000000L;
		System.out.println("e6 : " + e6); // e6 : 1.0E9
		
	}

}
