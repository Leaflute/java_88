package ch07;

public class _05_Main {
	public static void main(String[] args) {
		// 다형성 적용
		_05_TV tv = new _05_SamsungTV();
		tv.turnOn();
		tv.turnOff();
	}
}
