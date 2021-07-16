package ch06;

// 자식클래스
public class _02_FireCar extends _02_Car {
	
	// 디폴트 생성자
	public _02_FireCar (){}
	
	// 멤버메서드 (고유)
	public void water() {
		System.out.println(kind + "는 물을 뿌렸다");
	}
}
