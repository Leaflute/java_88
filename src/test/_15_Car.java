package test;
// 추상클래스
public abstract class _15_Car {
	
	// 추상메서드
	public abstract void drive();
	public abstract void stop();

	// 멤버메서드
	public void startCar(){
		System.out.println("시동을 켭니다.");
	}
	public void turnOff(){
		System.out.println("시동을 끕니다.");
	} 	
	
	// 템플릿 메서드	
	final public void run(){
		startCar();	
		drive();
		stop();
		turnOff();
	}

}

