package ch04;

public class _01_Calculator {

	/*
	 * p138
	 * 함수: 하나의 기능을 수행하는 일련의 코드
	 *
	 * 메서드 : 클래스 안에 정의된 함수
	 * 		    특정한 작업을 수행하는 문장들의 모임
	 * 		    입력을 받아서 처리기능을 반환하는 기능
	 * 		    메서드 호출시 메서드명이 일치해야하며, 매개변수 갯수와 자료 type이 일치해야한다. (중요)
	 * 
	 * public 반환형 메서드명(매개변수1, 매개변수2, ...){
	 *  return 반환값; // 처리 결과를 반환하며, 반환형과 일치해야한다. (중요)
	 * }
	 * 
	 *  
	 * 반환형이 void로 선언된 메서드는 결과값을 반환하지 않는다.
	 *  
	 */
	
	// 1. 함수(메서드) 생성
	// 2. heap메모리에 올림
	// 3. 주소값을 선언하고 리턴값과 같은 타입으로 주소값.메서드(매개변수);를 돌려받음 
	
	public double add(double num1, double num2) {
//		double result = num1 + num2;
//		return result;
		return num1 + num2;
	}
	
	//sub

	public double sub(double num1, double num2) {	
		return num1 - num2;
	}
	
	//mul
	
	public double mul(double num1, double num2) {
		return num1 * num2;
	}

	//div
	public double div(double num1, double num2) {
		return num1 / num2;
	}
	
}
