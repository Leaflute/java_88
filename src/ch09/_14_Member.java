package ch09;

//p427 , hashCode와 equals를 재정의
public class _14_Member {
	
	private int memberId;
	private String memberName;
	
	public _14_Member() {}
	public _14_Member(int memberId,String memberName) {
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
	
//	@Override
//	public int hashCode() {
//		return memberId;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof _14_Member) {
//			_14_Member member = (_14_Member)obj;
//			if(this.memberId == member.memberId)	// 매개변수로 받은 회원 아이디가 자신의 회원 아이디와 동일하면 true를 반환
//				return true;
//			else
//				return false;
//		}
//		return false;
//	}
	
	@Override
	public String toString() {
		return "학번: " + memberId + ", 이름: " + memberName;
	}
}
