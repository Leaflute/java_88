package ch06;

// 부모클래스
public class _05_Member {
	
	// 멤버변수
	private String id;
	private String pwd;
	private String name;
	
	// 디폴트생성자
	public _05_Member() {}
	
	// 매개변수생성자
	public _05_Member(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.print("id: " + id + "\t패스워드: " + pwd + "\t이름: " + name);
	}

}
