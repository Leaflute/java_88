package ch06;

public class _02_Main {
	public static void main(String[] args) {
		
		// 참조변수
		_02_FireCar fireCar = new _02_FireCar();
		_02_PoliceCar policeCar = new _02_PoliceCar();
		
		// setter로 값 지정
		fireCar.setKind("소방차");
		fireCar.setSpeed(2000);
		
		policeCar.setKind("경찰차");
		policeCar.setSpeed(4000);
		
		// 메서드 가져오기
		fireCar.carInfo();
		fireCar.water();
		
		policeCar.carInfo();
		policeCar.siren();
	}
}
