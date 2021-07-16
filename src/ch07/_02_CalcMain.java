package ch07;

public class _02_CalcMain {
	public static void main(String[] args) {
		
		// 추상클래스는 인스턴스 생성불가(메서드가 불완전)
//		_02_Calc calc2 = new _02_Calc();
		
		_02_Calc calc = new _02_CompleteCalc();
		calc.add(4, 2);	
		calc.sub(6, 3);		// 재정의된 자식메서드가 호출
		calc.mul(3, 6);
		calc.div(10, 2);
	}
}
