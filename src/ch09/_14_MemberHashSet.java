package ch09;

import java.util.HashSet;
import java.util.Iterator;

// p424
public class _14_MemberHashSet {
	
	private HashSet<_14_Member> hashSet;
	
	// 생성자
	public _14_MemberHashSet() {
		hashSet = new HashSet<_14_Member>();
	}
	
	// addMember
	public void addMember(_14_Member member) {
		hashSet.add(member);
	}
	
	// removeMember
	public boolean removeMember(int memberId) {
		Iterator<_14_Member> itr = hashSet.iterator();
		
		while(itr.hasNext()){
			_14_Member member = itr.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				hashSet.remove(member);	// 매개변수로 박은 객체를 삭제하고 true false로 반환
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	// showAllMember
	public void showAllMember() {
		for(_14_Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
