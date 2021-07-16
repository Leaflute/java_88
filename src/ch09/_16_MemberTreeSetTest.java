package ch09;

import java.util.Iterator;
import java.util.TreeSet;

// p431
public class _16_MemberTreeSetTest {
	
	// TreeSet선언
	private TreeSet<_16_Member> treeSet;
	
	// 생성자
	public _16_MemberTreeSetTest() {
		treeSet = new TreeSet<_16_Member>();
	}

	public void addMember(_16_Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<_16_Member> itr = treeSet.iterator();
		
		while(itr.hasNext()) {
			_16_Member member = itr.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(_16_Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
