package ch07;

// 자식메서드
public class _02_CompleteCalc extends _02_Calc {
	
	// 두수의 합계: 결과
	@Override
	public void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("두 수의 합계: " + result);
	}

	@Override
	public void sub(int num1, int num2) {
		int result = num1 - num2;
		System.out.println("두 수의 차: " + result);
	}

	@Override
	public void mul(int num1, int num2) {
		int result = num1 * num2;
		System.out.println("두 수의 곱: " + result);
	}

	@Override
	public void div(int num1, int num2) {
		int result = num1 / num2;
		System.out.println("두 수의 나눗셈: " + result);		
	}

}
