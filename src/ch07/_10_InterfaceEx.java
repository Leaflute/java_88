package ch07;

public class _10_InterfaceEx {
	public static void main(String[] args) {
		A10 a10 = new A10();
		a10.methodA();
	}
}

class A10 {
	public void methodA() {
		// 인터페이스타입 다형성 적용
		I10 i10 = InstanceManager.getInstance();	// 클래스명.메서드
		i10.methodB();
	}
}

class B10 implements I10{
	public B10() {					// 생성자
		System.out.println("B10 디폴트 생성자 호출");
	}

	@Override
	public void methodB() {
		System.out.println("B10 클래스 - methodB()");
	}
}

interface I10 {
	public void methodB();
}

class InstanceManager {
	
	/*
	 * factory method
	 * - 객체를 생성하는 정적 팩토리 메서드
	 * - 디자인 패턴의 하나로 객체 만드는 부분을 자식클래스에게에 위임.
	 * - new 연산자를 호출해 객체를 생성하는 코드
	 * - 사용하는 이유는 하나의 클래스가 변경되었을 경우 다른 클래스의 변경을 최소화하기 위함.
	 * 
	 * 팩토리 메서드 이름으로 많이 사용되는 것은 getInstance()이다.
	 * 인터페이스에서 팩토리 메서드를 제공할 때 정적메서드를 사용하게 된다.
	 * static 이므로 클래스명.정적메서드로 접근	// I10 i10 = new B10();	// 다형성
	 */
	
	// 정적 메서드
	public static I10 getInstance() {
		return new B10();	// 호출되면 20행 실행
	}
}