package ch07;

public class _04_Main {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		// 다형성 적용
		_04_Calc calc = new _04_CompleteCalc();
		System.out.println("덧셈: " +calc.add(num1, num2));
		System.out.println("뺄셈: " +calc.substract(num1, num2));
		System.out.println("곱셈: " +calc.times(num1, num2));
		System.out.println("나눗셈: " +calc.divide(num1, num2));
		allShowInfo(new _04_CompleteCalc());
	}	

	public static void allShowInfo(_04_Calc calc) {
		if (calc instanceof _04_CompleteCalc) {
			_04_CompleteCalc cal1 = (_04_CompleteCalc)calc;
			cal1.showInfo();
		}
		
	}
}