package ch06;

public class _03_Sawon extends _03_Employee {
	
	// 멤버변수
	private int sudang;
	
	// 기본생성자
	public _03_Sawon(){}
	
	// 매개변수생성자
	public _03_Sawon(int sudang) {
		this.sudang = sudang;
	}
	
	// getter setter
	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	public int getSudang() {
		return sudang;
	}
	
	// printInfo
	public void printInfo() {
		super.printInfo();
		System.out.println("수당: " + sudang);
	}
}
