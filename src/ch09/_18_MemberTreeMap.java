package ch09;

import java.util.Iterator;
import java.util.TreeMap;


// p443
public class _18_MemberTreeMap {

	private TreeMap<Integer, _18_Member> treeMap;
	
	public _18_MemberTreeMap() {
		treeMap = new TreeMap<Integer, _18_Member>();
	}
	
	public void addMember(_18_Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)){
			treeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return true;
	}
	
	public void showAllMember() {
		Iterator<Integer> itr = treeMap.keySet().iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			_18_Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
