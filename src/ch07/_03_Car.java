package ch07;

public abstract class _03_Car {

	/* 템플릿 메서드 p291
	 * - 메서드 실행순서와 시나리오를 정의하는 것
	 * - 로직 흐름이 이미 정해진 프레임워크에서 많이 사용하는 구현 방법
	 * - final로 선언한 이유는 모든 하위클래스가 공통으로 사용하고, 코드가 변경되면 안 되기 때문에
	 * final 메서드 : 상속받은 하위클래스가 부모메서드를 재정의할 수 없다.
	 * 
	 * final 예약어 p305
	 * - 변수를 상수로 지정
	 * - 메서드를 재정의 불가능하게 함
	 * - 클래스를 상속불가능하게 함
	 */
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnoff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 자동차가 달리는 법을 순서대로 구현
	final public void run() {
		startCar();
		drive();
		stop();
		turnoff();
	}
}
