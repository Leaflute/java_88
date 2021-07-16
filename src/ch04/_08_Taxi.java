package ch04;

public class _08_Taxi {
	
	// 멤버변수
	String taxiKind; // 택시 종류
	int passengerCount; // 승객 수
	int money; // 택시 수입
	
	// 디폴트 생성자
	public _08_Taxi() {}
	
	// 매개변수 생성자
	public _08_Taxi(String taxiKind, int passengerCount, int money) {
		this.taxiKind = taxiKind;
		this.passengerCount = passengerCount;
		this.money = money;
	}
	
	public _08_Taxi(String taxiKind) {
		this.taxiKind = taxiKind;
	}
	
	// 멤버 메서드 - 택시를 타다
	public void take(int money) {
		this.money += money; 
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(taxiKind + " 택시의 승객 숫자는 " + passengerCount + "명 이며, 수입은 " + money + "이다.");
	}
}
