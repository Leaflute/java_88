package ch04;

public class _07_Company {
	
	/*
	 * [면접] 싱글톤 패턴 p193
	 * - 동일한 인스턴스를 단 하나만 생성하는 디자인 패턴
	 * - 접근할 클래스에 여려 메서드가 있을 때, 외부 클래스가 해당 메서드에 접근할 때마다 
	 * 인스턴스를 생성할 필요없이 getInstance()를 통해 참조변수만 리턴받아 접근한다
	 * 몇 번을 호출해도 항상 같은 주소의 인스턴스가 반환된다.
	 * 
	 * - 싱글톤패턴 생성
	 * - 1. 생성자를 private로 만들기
	 * - 2. 클래스 내부에 static으로 유일한 인스턴스를 생성
	 * - 3. 외부에서 참조할 수 있는 public메서드 만들기
	 * 
	 * - 호출 방법
	 * - 접근클래스명 참조변수 = 접근클래스명.getInstance();
	 * 예) _07_Company company = _07_Company.getinstance(); // 클래스명.메서드명
	 */
	
	// 멤버변수
	private String companyName;
	private String address;
	private String telno;
	
	// 1. 생성자를 private로 만들기
	private _07_Company() {}
	
	// 2. 클래스 내부에 static으로 유일한 인스턴스를 생성
	private static _07_Company instance = new _07_Company();
	
	// 3. 외부에서 참조할 수 있는 public메서드 만들기 
	public static _07_Company getInstance() {
		if(instance == null) {
			instance = new _07_Company();
		}
		return instance;
	}

	// getter setter
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}	
	public void setTelno(String telno) {
		this.telno = telno;
	}
	public String getTelno() {
		return telno;
	}
	
	// printInfo();
	public void printInfo() {
		System.out.println("회사명: " + companyName + ", 주소: " + address + ", 전화번호: " + telno);
	}
}
