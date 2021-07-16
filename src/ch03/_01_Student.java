package ch03;

public class _01_Student {

	/*
	 * 클래스 : 객체에 대한 설계도, 디자인
	 * 		 - 멤버변수(속성, 필드) + 멤버메서드(기능, 동작) + 생성자
	 * 
	 * 클래스는 설계도(디자인)이며, 인스턴스는 이 설계도를 바탕으로 만들어진 Heap메모리 공간
	 * 그 결과 주소값이 만들어지며, 참조변수에 할당된다.
	 * 객체는 인스턴스라고도 한다.
	 */
	// 멤버변수 - 속성
	// 학번, 이름, 학년, 주소
	int studentID; // 학번
	String studentName; // 이름
	int grade; // 학년
	String address;  // 주소
	String email; // 이메일
	
	// 멤버메서드 - 기능
	public void printInfo() {
		System.out.println("학번: " + studentID);
		System.out.println("이름: " + studentName);
		System.out.println("학년: " + grade);
		System.out.println("주소: " + address);
		System.out.println("e-mail: " + email);
	}
}
