package ch09;

import java.util.ArrayList;
import java.util.List;

public class _04_MemberArrayList {

		private List<_04_Member> arrayList;	// <>에 들어갈 클래스타입(변수,메서드 포함)
		
		// 기본생성자
		public _04_MemberArrayList() {
			arrayList = new ArrayList<_04_Member>();
		}
		
		// 회원추가 메서드
		public void addMember(_04_Member member) {		// call by reference
			arrayList.add(member);						// 참조변수를 list에 넘김
		}
		
		// 회원삭제 메서드
		public boolean removeMember(int memberId) {
			for (int i=0; i<arrayList.size(); i++) {
				_04_Member member = arrayList.get(i);
				int tempId = member.getMemberId();
				if (tempId == memberId) {
					arrayList.remove(i);	// 삭제성공
					return true;	// 삭제성공후 함수종료
				}
			}
			System.out.println(memberId + "가 존재하지 않습니다.");
			return false;	
		}
		
		// 전체회원정보출력 메서드
		public void showAllMember() {
			// 향상된 for문(자료형, 변수명){} => 배열 안의 자료를 변수에 담아 배열건수만큼 출력 
			for (_04_Member member : arrayList) {
				System.out.println(member);		// member.toString()
			}
		}
}
