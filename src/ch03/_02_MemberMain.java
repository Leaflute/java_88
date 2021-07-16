package ch03;

public class _02_MemberMain {
	public static void main(String[] args) {
		
		_02_Member memberKim = new _02_Member();
		
		memberKim.name = "김철수";
		memberKim.birth = "1980년 1월 1일";
		memberKim.age = 42;
		memberKim.address = "서울특별시 강서구";
		
		memberKim.showInfo();
	}
}
