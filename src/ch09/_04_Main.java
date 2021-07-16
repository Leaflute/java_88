package ch09;

public class _04_Main {
	public static void main(String[] args) {
		
		_04_MemberArrayList memList = new _04_MemberArrayList();
		
		// 매개변수 생성자 호출 -> 멤버변수에 전달
		_04_Member lee = new _04_Member(1001,"이지원");	// lee 주소값 100번지
		_04_Member son = new _04_Member(1002,"손민국");	// son 주소값 200번지
		_04_Member park = new _04_Member(1003,"박서훤");	// park 주소값 300번지
		_04_Member hong = new _04_Member(1004,"홍길동");	// hong 주소값 400번지
		
		// 회원추가
		memList.addMember(lee);
		memList.addMember(son);
		memList.addMember(park);
		memList.addMember(hong);
		
		// 회원정보출력
		memList.showAllMember();
		
		// 회원삭제.
		memList.removeMember(hong.getMemberId());
		
		System.out.println("");
		// 회원정보출력
		memList.showAllMember();
				
	}
}
