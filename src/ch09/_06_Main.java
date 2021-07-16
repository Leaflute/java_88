package ch09;

public class _06_Main {

	public static void main(String[] args) {
		_06_MemberHashMap memberHashMap = new _06_MemberHashMap();
		
		// 매개변수 생성자 호출
		_06_Member memberLee = new _06_Member(1001, "이지원");
		_06_Member memberSon = new _06_Member(1002, "손민국");
		_06_Member memberPark = new _06_Member(1003, "박서훤");
		_06_Member memberHong = new _06_Member(1004, "홍길동");
		
		//회원추가 메서드
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		System.out.println("------홍길동 삭제후----");
		memberHashMap.showAllMember();

		
	}

}
