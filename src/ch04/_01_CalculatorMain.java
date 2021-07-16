package ch04;

public class _01_CalculatorMain {
	public static void main(String[] args) {
		
		_01_Calculator cal = new _01_Calculator();
		
		double num1 = 10.0;
		double num2 = 5.0;
		
		double addR = cal.add(num1, num2);
		double subR = cal.sub(num1, num2);
		double mulR = cal.mul(num1, num2);
		double divR = cal.div(num1, num2);
		
		System.out.println("두 수의 합 : " + addR);
		System.out.println("두 수의 차 : " + subR);
		System.out.println("두 수의 곱 : " + mulR);
		System.out.println("두 수의 나눔 : " + divR);
	}
}
