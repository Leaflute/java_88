package ch07;

// 자식클래스 - _04_Calc 인터페이스를 구현 (+,-)
public abstract class _04_Calculator implements _04_Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	

}
