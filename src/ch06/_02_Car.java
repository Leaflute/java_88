package ch06;

	/*
	 * [면접]
	 * 상속: 자식클래스 extends 부모클래스 {}
	 * extends : 확장하다의 의미
	 * 공통으로 사용하는 멤버변수와 멤버메서드를 부모클래스에서 정의한다.
	 * 부모클래스는 일반적이고 공통적이며, 자식클래스는 구체적이며 유일하다.
	 * 부모클래스의 멤버변수와 멤버메서드를 재사용하기 위해 씀
	 * 
	 * 중복되는 코드를 줄여서 손쉽게 개발, 유지보수 
	 * 
	 * 부모클래스의 멤버를 private로 선언한 경우, 자식클래스에서 접근할 수 없다.
	 * 접근제어자가 protected면 자식클래스에서 접근 가능함.
	 */

public class _02_Car {
	
	// 멤버 변수
	protected String kind;
	protected int speed;
	
	// 기본생성자
	public _02_Car(){}
	
	// 매개변수 생성자
	public _02_Car(String kind, int speed){
		this.kind = kind;
		this.speed = speed;
	}
	
	// setter getter 메서드
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}	
	
	// 멤버 메서드
	public void carInfo() {
		System.out.println(kind + "의 속도는 " + speed + "km/h 이다.");
	}
}
