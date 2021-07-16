package ch01;

public class _04_VariableEx {
	public static void main(String[] args) {
		
		/*
		 *  아스키코드 10진수값
		 *  A : 65
		 *  B : 66
		 *  Z : 90
		 *  a : 97
		 *  z : 122
		 */
		
		char ch1 = 'A';
		System.out.println("ch1 : " + ch1); // A
		
		// 문자에 해당하는 정수값(아스키코드값) 출력 -> 인코딩
		System.out.println((int)ch1);       // 65
		
		char ch2 = 66;    
		System.out.println("ch2 : " + ch2); // B
		
		int ch3 = 67; 
		System.out.println("ch3 : " + ch3); // 67
		
		
		// 정수값(아스키코드값)에 해당하는 문자를 출력 -> 디코딩
		System.out.println("ch3 : " + (char)ch3); // C
		
		System.out.println("---------------------");
		
		char ch4 = 'a';
		System.out.println("ch4 : " + ch4);	// ch4 : a
		
		// 문자에 해당하는 정수값(아스키코드값) 출력 -> 인코딩
		System.out.println("ch4 : " + (int)ch4); // ch4 : 97
		
		char ch5 = 'z';
		System.out.println("ch5 : " + ch5);	// ch5 : z
		
		// 문자에 해당하는 정수값(아스키코드값) 출력 -> 인코딩
		System.out.println("ch5 : " + (int)ch5); // ch5 : 122
				
		
	}
}
