package ch13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
	
	// create() - 회원정보생성
	public int create(_06_Member member) {
		
		// Optional : null처리를 직접하지 않고 Optional 클래스에 위임하기 위해 사용
		// key 회원 ID가 null인지의 여부, 이미 동일한 id가 존재하는 회원인지 체크
		Optional.ofNullable(map.get(member.getMemberId()))
		.ifPresent(targetMember -> {
			throw new _06_MemberIdDuplicationException("이미 존재하는 회원입니다.");
		});
		map.put(member.getMemberId(), member);
		return member.getMemberId();
	}
	
	// 회원정보 이름으로 조회
	public List<_06_Member> selectByName(String name){
		return map.values().stream()
				.filter(member -> member.getMemberName().equals(name))
				.collect(Collectors.toList());
	}
	
	// 아이디 조회
	public _06_Member selectById(int memberId){
		return map.get(memberId);
	}
	
	// 회원정보 수정 map.put(key, value);
}
