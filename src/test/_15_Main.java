package test;

public class _15_Main{
	public static void main(String[] args){

		// 다형성 적용
		_15_Car ai = new _15_AICar();
		_15_Car man = new _15_ManualCar();

		// 메서드 호출
		ai.run();
		System.out.println("---------------");
		man.run();
		
	}

}	