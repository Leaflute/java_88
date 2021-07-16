package ch09;

public class _08_Member {
	
	private int memberId;	//  회원 아이디
	private String memberName;	// 회원 이름
	
	// 생성자
	public _08_Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	// getter setter
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	/*
	 *  toString() : 모든 객체의 최상위 클래스인 Object에 들어간 메서드로
	 *  객체가 가진 주소값(참조변수)와 정보(멤버변수)를 반환하기 위해 사용
	 *  - 모든 클래스에서 재정의가 가능함
	 *  - 매개변수만으로도 생략된 채로 호출이 가능하다
	 */
	
	@Override
	public String toString() {	// Object의 toString()은 원래 주소값 출력이나, 재정의됨
		return "id: " + memberId + "Name: " + memberName;
	}
	
}
