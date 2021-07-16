package test;
// 자식클래스
public class _15_ManualCar extends _15_Car {

	// 메서드
	@Override
	public void drive(){
		System.out.println("사람이 직접 조작해 목적지로 향합니다.");
	}

	@Override
	public void stop(){
		System.out.println("목적지에 도달해 운행을 멈춥니다.");	
	}
}