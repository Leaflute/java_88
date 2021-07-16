package ch03;

public class _02_Member {

	// 멤버변수가 private이면 값 할당 불가 => 1. 생성자로 초기화, 2. setter 메서드로 초기화
	// 멤버변수
	String name;
	String birth;
	int age;
	String address;
	
	// 생성자
	public _02_Member() {}
		
	// 멤버메서드
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("생년월일 : " + birth);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
	}
}
