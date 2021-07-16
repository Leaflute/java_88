package test;

// 자식메서드 // 
public class _12_ShinhanBank extends _12_Bank {  

	// 멤버변수
	String event;
	
	// setter() getter()
	public void setEvent(String event) {
		this.event = event;
	}
	public String getEvent() {
		return event;
	}
	
	
	// 멤버메서드
	public void excuteLoan(){
		System.out.println("신한은행 대출");
	}
	
	// printInfo()
	@Override 
	public void printInfo(){
		super.printInfo();
		System.out.println(event);
	}

}





