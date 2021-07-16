package ch12;

public class _05_SpreadArgs {
	
	// 디폴트 생성자
	public _05_SpreadArgs() {}
	
//	public void callArgs(String str1, String str2, String str3, String str4) {
//		System.out.println(str1 + " " + str2 + " " + str3 + " " + str4);
//	}
	
	/*
	 * 스프레드 매개변수
	 * 1. 용도 : 메서드 호출시 매개변수 인자의 일치아지 않아도 호출이 가능하도록 한다.
	 * 		   args는 인자의 수를 동적으로 처리할 수 있도록 유연성을 제공.
	 * 
	 * 2. 방법 : 메서드 인자(데이터Type ...변수)로 지정하나 스프레드 매개변수는 1개만 사용가능
	 * 		      컴파일시 매개변수 인자로 넘어온 개수만큼 배열이 생성된다.
	 * 
	 * 	
	 */
	
	public void callArgs(String ...str) {	// String[] str
		for (int i=0; i<str.length; i++){
			System.out.print(str[i] + " ");
		}
		System.out.println();
		
		for(String result : str) {
			System.out.print(result + " ");
		}
	}
	
	public void callArgs2(String name, int ...score) {	// int[] score
		System.out.println(name + " ");
		for(int iResult : score) {
			System.out.print(iResult + " ");
		}
	}
}
