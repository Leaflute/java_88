package ch13;

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

		System.out.println("========= stream 사용해보기  =========");
		_06_Member memberIu = new _06_Member(1004, "아이유");	//1003 입력하면 박서훤과 중복
		/* key 중복시의 _06_MemberIdDupException
		 * Exception in thread "main" ch13._06_MemberIdDuplicationException: 이미 존재하는 회원입니다.
			at ch13._06_MemberHashMap.lambda$0(_06_MemberHashMap.java:48)
			at java.util.Optional.ifPresent(Unknown Source)
			at ch13._06_MemberHashMap.create(_06_MemberHashMap.java:47)
			at ch13._06_Main.main(_06_Main.java:28)
		 */
		
		memberHashMap.create(memberIu);
		System.out.println("아이유 조회 => " + memberIu);
		
		// 멤버 이름으로 조회
		System.out.println("아이유 조회 => " + memberHashMap.selectByName("아이유"));
		
		// 멤버 아이디로 조회
		System.out.println("아이유 조회 => " + memberHashMap.selectById(1001));

	}
}
