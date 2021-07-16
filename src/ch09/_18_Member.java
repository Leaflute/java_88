package ch09;

public class _18_Member {
	
	private int memberId;
	private String memberName;
	
	public _18_Member() {}
	public _18_Member(int memberId,String memberName) {
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
}
