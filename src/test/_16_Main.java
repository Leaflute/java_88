package test;

public class _16_Main{
	public static void main(String[] args){

		// 다형성 적용
		_16_Car ai = new _16_AICar();
		_16_Car man = new _16_ManualCar();

		// 메서드 호출
		ai.startCar();
		ai.drive();
		ai.stop();
		ai.turnOff();
		System.out.println("---------------");
		man.startCar();
		man.drive();
		man.stop();
		man.turnOff();
		
	}

}	