package ch07;

// 부모
public interface _04_Calc {
	
	// 상수
	// public static final 생략  - 컴파일 시점에서 추가
	double PI = 3.14;	
	int ERROR = -999999999;
	
	// 추상메서드 
	// public abstract 생략 - 컴파일과정에서 추상메서드로 변환	
	int add(int num1, int num2); 
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
}
