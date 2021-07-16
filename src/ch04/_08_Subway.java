package ch04;

public class _08_Subway {
	
	// 멤버변수
	int lineNumber; // 버스 번호
	int passengerCount; // 승객 수
	int money; // 버스 수입
	
	// 디폴트 생성자
	public _08_Subway() {}
	
	// 매개변수 생성자
	public _08_Subway(int lineNumber, int passengerCount, int money) {
		this.lineNumber = lineNumber;
		this.passengerCount = passengerCount;
		this.money = money;
	}
	
	public _08_Subway(int lineNumber) {
		this.lineNumber = lineNumber;
		
	}
	
	// 멤버 메서드 - 지하철을 타다
	public void take(int money) {
		this.money += money; // 지하철 수입 증가 1500
		this.passengerCount++; // 승객수 증가
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "호선의 승객 수는 " + passengerCount + "이고 수입은 " + money + "이다.");
	}
}
