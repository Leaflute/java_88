package ch04;

public class _08_Bus {
	
	// 멤버변수
	int busNumber; // 버스 번호
	int passengerCount; // 승객 수
	int money; // 버스 수입
	
	// 디폴트 생성자
	public _08_Bus() {}
	
	// 매개변수 생성자
	public _08_Bus(int busNumber, int passengerCount, int money) {
		this.busNumber = busNumber;
		this.passengerCount = passengerCount;
		this.money = money;
	}
	
	public _08_Bus(int busNumber) {
		this.busNumber = busNumber;
		
	}
	
	// 멤버 메서드 - 버스를 타다
	public void take(int money) {
		this.money += money; // 버스 수입 증가 1000
		this.passengerCount++; // 승객수 증가
	}
	
	public void showInfo() {
		System.out.println(busNumber + "번 버스의 승객 수는 " + passengerCount + "이고 수입은 " + money + "이다.");
	}
}
