package ch09;

import java.util.HashMap;
import java.util.Iterator;

public class _06_MemberHashMap {
	
	private HashMap<Integer, _06_Member> map;
	
	public _06_MemberHashMap() {
		map = new HashMap<Integer, _06_Member>();	// map을 외부에서 사용하기 위해 따로 선언하고 생성자에 넣음
	}
	
	// 회원추가
	public void addMember(_06_Member member) {
		map.put(member.getMemberId(), member);	// key는 id, value(주소)
	}
		
	// 회원탈퇴
	public boolean removeMember(int memberId) {
			if(map.containsKey(memberId)) {
				map.remove(memberId);
				return true;
			}
			System.out.println(memberId + "가 존재하지 않습니다.");
			return false;
	}
	
	// 회원정보 출력
	public void showAllMember() {
		Iterator<Integer> itr = map.keySet().iterator();
		while(itr.hasNext()) {	//다음 값이 있으면
			int key = itr.next(); // key 값을 가져와서
			_06_Member member = map.get(key);
			System.out.println(member);	// member.toString();
		}
		System.out.println();
	}
	

	
	
}
