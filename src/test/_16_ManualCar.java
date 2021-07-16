package test;
// 자식클래스
public class _16_ManualCar implements _16_Car {

	// 메서드
	
	@Override
	public void startCar() {
		System.out.println("시동을 걸었습니다.");
	}

	@Override
	public void drive(){
		System.out.println("사람이 직접 조작해 목적지로 향합니다.");
	}

	@Override
	public void stop(){
		System.out.println("목적지에 도달해 운행을 멈춥니다.");	
	}


	@Override
	public void turnOff() {
		System.out.println("시동을 껐습니다.");
	}
	
}