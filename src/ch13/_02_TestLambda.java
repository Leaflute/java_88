package ch13;

interface _02_PrintString {
	void showString(String str);
}

public class _02_TestLambda {
	public static void main(String[] args) {
		_02_PrintString lambdaStr = str -> System.out.println(str);
		lambdaStr.showString("Hello lamda_1");	// hello lamda_1
		showMyString(lambdaStr);	//  메서드의 매개변수로 람다식을 대입한 변수(lambdaStr) 전달
	}

	// 매개변수를 인터페이스형으로 받음.. call by reference
	public static void showMyString(_02_PrintString p) {
		p.showString("Hello lamda_2");
	}
}
