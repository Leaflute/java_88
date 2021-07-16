package test;
// 자식클래스
public class _15_AICar extends _15_Car {
	
	// 메서드
	@Override
	public void drive(){
		System.out.println("자율주행장치가 목적지로 향합니다.");
	}

	@Override
	public void stop(){
		System.out.println("목적지에 도달해 자동으로 멈춥니다.");	
	}
}