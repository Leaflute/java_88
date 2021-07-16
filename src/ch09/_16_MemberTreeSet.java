package ch09;

// p432
public class _16_MemberTreeSet {
	public static void main(String[] args) {
		
		_16_MemberTreeSetTest memts = new _16_MemberTreeSetTest();
		
		_16_Member memjohn = new _16_Member(1003, "john");
		_16_Member mempaul = new _16_Member(1002, "paul");
		_16_Member memmark = new _16_Member(1001, "mark");
		memts.addMember(memjohn);
		memts.addMember(mempaul);
		memts.addMember(memmark);
		memts.showAllMember();
		
		memts.addMember(new _16_Member(1003, "ruke"));
		memts.showAllMember();
		
		// comparable 인터페이스 구현필요

	}
}
