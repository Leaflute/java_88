package ch01;

import java.util.Scanner;

public class _08_InOutEx {
	public static void main(String[] args) {
		/*
		 * https://docs.oracle.com/javase/8/docs/api/
		 * 
		 * 변수
		 * 1. 기초형(Primitive Type) : 실제 값이 저장
		 *    - 데이터타입 변수명 = 값;
		 *      int score = 70;
		 *      
		 * 2. 참조형(Reference Type): 실제 객체를 가리키는 주소값이 저장
		 *    - 클래스, 인터페이스, 배열, 열거형
		 *    - 클래스인 경우
		 *    // 인스턴스 생성
		 *    
		 *    클래스명 참조변수명 = new 클래스명();
		 *    참조변수명.멤버메서드;
		 *    참조변수명.멤버변수;
		 *    
		 *    예) Scanner Input = new Scanner(System.in);
		 *    - 참조변수명은 객체(인스턴스)를 가리키는 주소값이 들어있음
		 */
		 
		 int i = 0; 
		 int j = 0;
		 // 두 수를 콘솔에서 입력받아 합계를 구하기
		 
		 // new의 의미 : Heap메모리에  객체(인스턴스)를 생성하고, 그 주소값을 input에 대입하라
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("첫 번째 숫자를 입력하세요 : ");
		 i = input.nextInt();
		 
		 System.out.print("두 번째 숫자를 입력하세요 : ");
		 j = input.nextInt();
		 
		 int sum = i + j;
		 System.out.println("합 : " + sum);
		 System.out.println("프로그램 종료!");
		 input.close();   // 자원해제
		 
	}
}
