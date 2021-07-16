package ch07;

// 자식클래스 - _04_Calculator 상속받아 추상메서드를 구현
public class _04_CompleteCalc extends _04_Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 == 0) {
			return _04_Calc.ERROR;
		} else {
			return num1 / num2;
		}
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

}
