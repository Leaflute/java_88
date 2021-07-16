package ch06;

// 자식클래스
public class _05_GoldMember extends _05_Member {
	
	// 멤버변수
	private String event; // goldMember event 
	
	// 디폴트생성자
	public _05_GoldMember() {}
	
	// 매개변수생성자
	public _05_GoldMember(String id, String pwd, String name, String event) {
		super(id, pwd, name);
		this.event = event;
	}
	
	// showInfo
	public void showInfo() {
		super.showInfo();
		System.out.println("\t이벤트: " + event);
	}
	

}
