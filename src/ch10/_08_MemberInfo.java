package ch10;

public class _08_MemberInfo {
	
	// 멤버변수
	private String name;
	private int age;
	
	// 생성자
	public _08_MemberInfo() {}
	public _08_MemberInfo(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter setter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// 멤버 출력정보
	public void showMemberInfo() {
		System.out.println("이름: " + name + "\n나이: " + age);
	}
}
