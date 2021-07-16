package ch09;

// p434 - Comparable 재정의하여 오름차순, 내림차순 정렬
public class _16_Member implements Comparable<_16_Member> {
	
	private int memberId;
	private String memberName;

	public _16_Member(int memberId,String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
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
	
	@Override
	public String toString() {
		return "학번: " + memberId + ", 이름: " + memberName;
	}
	
	// 구현된 추상메서드 compareTo
	@Override
	public int compareTo(_16_Member member) {	// member.memberId는 비교되는 값
		return (this.memberId - member.memberId);	// this.memberId는 새로 추가된 값
	}
	
	// 두 memberId의 차를 반환해 this.memberId가 크면 양수를 반환해 오름차순으로 정렬, 음수를 반환하면 내림차순 정렬한다.
	// *-1하여 순서를 바꿀 수 있음
}
