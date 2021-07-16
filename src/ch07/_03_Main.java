package ch07;

public class _03_Main {
	public static void main(String[] args) {
		
		System.out.println("자율주행 자동차");
		_03_Car aiCar = new _03_AICar();
		aiCar.run();
		
		System.out.println("------------");
		
		System.out.println("사람이 운전하는 자동차");
		_03_Car manualCar = new _03_ManualCar();
		manualCar.run();
		
	}
}
