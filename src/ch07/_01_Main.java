package ch07;

public class _01_Main {
	public static void main(String[] args) {
		
		// 추상클래스는 인스턴스 생성불가(추상클래스가 가지고 있는 추상메서드는 바디가 없는 불완전 메서드이므로)
//		_01_Computer com = new _01_Computer();
		
		// 다형성 적용
		_01_Computer deskTop = new _01_DeskTop();
		deskTop.display();	// 오버라이드에 의해 자식메서드가 호출
		deskTop.typing();	// 오버라이드에 의해 자식메서드가 호출
		deskTop.turnOn();
		deskTop.turnOff();
		
		System.out.println();
		_01_Computer myLt = new _01_MyLaptop();
		myLt.display();
		myLt.typing();
		myLt.turnOn();
		myLt.turnOff();
	}
}
