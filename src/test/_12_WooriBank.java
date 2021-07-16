package test;

/*
 * 2)상속의 개념 및 문법
 * 상속이란 어떤 클래스가 다른 어떤 클래스의 속성을 가지게 됨을 의미함.
 * 상속문법은 자식클래스 extends 부모클래스  {} 형태로 가지게 되며,
 * 이때 자식클래스는 부모클래스의 변수와 메서드, 생성자를 가지고 올 수 있으며 super예약어로 호출이 가능하다.
 */

// 자식메서드
public class _12_WooriBank extends _12_Bank {

	// 멤버변수
	String vipMember;
	
	// setter() getter()
	public void setVipMember(String vipMember) {
		this.vipMember = vipMember;
	}
	public String getVipMember() {
		return vipMember;
	}
	
	// 멤버메서드
	public void makeWooriProduct(){
		System.out.println("이율 높은 상품 출시");
	}
	
	// printInfo()
	
	/*
	 * 3) 오버라이드
	 * 부모클래스와 자식클래스가 완벽히 동일한 메서드나 변수를 보유하고 있는 경우
	 * 참조변수를 통해 자식클래스의 요소를 호출했을 때 자식메서드가 우선순위로 실행되게 한다.
	 * 다른 말로 재정의라고 함.
	 * @Override를 통해 재정의할 메서드를 지정할 수 있음.
	 */
	
	@Override
	public void printInfo(){
		super.printInfo();
		System.out.println(vipMember);
	}

}