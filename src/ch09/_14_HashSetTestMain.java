package ch09;

//p426
public class _14_HashSetTestMain {
	
	/*
	 * equals(), hashCode() 메서드가 재정의되어있지 않으므로 주소값을 비교한다.
	 * (1003, 박서훤)과 (1003, 홍길동)의 값은 인스턴스 생성시 주소값이 다르므로 다른 객체로 인식한다.
	 * 따라서 HashSet은 중복값을 허용하지 않지만, 서로 다로 인식하므로 중복추가가 된다.
	 * 재정의를 통해 중복추가를 막을 수 있다.
	 *
	 * String과 Integer 데이터는 eqauls(), hashCode()가 재정의되어 있으므로 같은 값은 중복추가가 안 된다.
	 */
	
	public static void main(String[] args) {
		
		// 인스턴스 생성
		_14_MemberHashSet memhs = new _14_MemberHashSet();
		
		// memberId, memberName 전달
		_14_Member memlee = new _14_Member(1001, "이지은");
		_14_Member memkim = new _14_Member(1002, "김현정");
		_14_Member memgang = new _14_Member(1003, "강호동");
		
		memhs.addMember(memlee);
		memhs.addMember(memkim);
		memhs.addMember(memgang);
		memhs.showAllMember();
		
		memhs.addMember(new _14_Member(1003, "홍길동"));
		memhs.showAllMember();;
		
		_14_Member memhong = new _14_Member(1003, "홍길동");
		memhs.addMember(memhong);
		memhs.showAllMember();

	}

}
