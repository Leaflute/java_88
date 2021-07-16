package ch01;

public class _03_VariableEx {
	public static void main(String[] args) {
		/*
		 * 메서드명, 변수명은 소문자로 시작한다(cf. 클래스명은 대문자로 시작한다.)
		 * 변수 : 프로그래밍에서 값(Data)를 저장하는 공간
		 * 		데이터의 저장과 참조를 위해 메모리 공간을 할당받는다.
		 * 		반드시 먼저 선언 : 컴파일러는 변수의 자료형에 맞는 기억공간을 미리 확보
		 * 		선언 : 자료형 변수명; Ex) int age;
		 * 		선언과 동시에 할당(초기화) : 자료형 변수명 = 초기화; Ex) int age = 30;
		 * 		
		 * [면접문제]
		 * 1. 기본 자료형이 무엇인가(Primitive Type) : 실제 값이 저장되는 공간
		 *    정수형 : byte(1바이트) -> short(2바이트) -> int(4바이트) -> long(8바이트)
		 *    실수형 : float(4바이트) -> double(8바이트)
		 *    문자형 : char(2바이트)
		 *    부울형 : boolean(true/false)
		 *     
		 * 2. 참조형이 무엇인가(Reference Type) : 실제 객체를 가리키는 주소값이 저장되는 공간 -> 참조변수의 자료형
		 *    - 클래스, 인터페이스, 배열 
		 *    
		 * 3. 문자열 : String 클래스 
		 */
		
		System.out.println("=== 정수형 변수 ===");
//		int num1;   // 선언
//		num1 = 10;  // 초기화 
		
		int num1 = 10;  // 선언과 동시에 초기화
		long num2 = 123456780L;  // long형은 숫자 뒤에 L이나 l을 붙인다
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		System.out.println("=== 실수형 변수 ===");
		float fnum1 = 3.14F;  // float 형은 F나 f를 붙인다
		double dnum1 = 3.14;  // double형은 기본형이며, 생략
		System.out.println("fnum1 : " + fnum1);
		System.out.println("dnum1 : " + dnum1);
		
		System.out.println("=== char형 변수 ===");
		char ch1 = ' ' ; // char형은 ' ' 초기화시 공백이 있어야 함
		ch1 = 'A'; // ch1을 A로 초기화
		System.out.println("ch1 : " + ch1);
		
		System.out.println("=== 문자열 변수 ===");
		String name = "";  // String형은 초기화시 공백이 없어도 됨
		name = "김태희";     // String은 클래스이므로 대문자로 시작해야함
		System.out.println("name : " + name);
		
		System.out.println("=== 부울형 변수 ===");
		boolean isMarried = true; // 참, 1 
		boolean isStudent = false; // 거짓, 0
		System.out.println("결혼여부 : " + isMarried);
		System.out.println("학생여부 : " + isStudent);
		
	}
	
}
