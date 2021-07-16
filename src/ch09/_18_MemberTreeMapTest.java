package ch09;

public class _18_MemberTreeMapTest {
	public static void main(String[] args) {
		
		// 인스턴스 생성
		_18_MemberTreeMap memhm = new _18_MemberTreeMap();
		
		memhm.addMember(new _18_Member(1001, "버즈"));
		memhm.addMember(new _18_Member(1002, "얀"));
		memhm.addMember(new _18_Member(1003, "플라워"));
		memhm.addMember(new _18_Member(1004, "SG워너비"));
		
		memhm.showAllMember();
		memhm.removeMember(1004);
		
		memhm.showAllMember();
		
		// key값이 Integer클래스 이고 이미 Comparable 인터페이스가 구현되어있다
		// key값이 Integer나 String이면 인터페이스 Comparable 또는 인터페이스 Comparator를 구현해야한다.


	}
}
