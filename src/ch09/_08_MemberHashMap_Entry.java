package ch09;

import java.util.HashMap;
import java.util.Map;

public class _08_MemberHashMap_Entry {
	public static void main(String[] args) {
		
		/*
		 * [시험]
		 */
		
		Map<String, _08_Member> map = new HashMap<String, _08_Member>();
		
		// HashMap에 멤버정보 추가
		// put(key, value)
		map.put("mem001", new _08_Member(1001, "홍길동"));
		map.put("mem002", new _08_Member(1002, "아이유"));
		map.put("mem003", new _08_Member(1003, "김태희"));
		
		//{mem002=아이디: 1002 이름: 아이유, mem001=아이디: 1001 이름: 홍길동, mem003=아이디: 1003 이름: 김태희}
		System.out.println(map);	// map.toString()
		
		// 멤버 삭제
		// remove(key)
		map.remove("mem002");
		System.out.println(map);	// map.toString()
		
		// 멤버 변경
		map.put("mem003", new _08_Member(1003, "김구라"));
		
		// 멤버 추가
		map.put("mem004", new _08_Member(1004, "유느님"));
		System.out.println(map);
		
		// 조회 - key, value
		// Map.Entry 자체가 인터페이스
		// Map.Entry<String, _08_Member> => get(), getValue()를 가진 인터페이스
		// map.entrSet() : map에 포함된 매핑 정보를 돌려줌
		for(Map.Entry<String, _08_Member> str : map.entrySet()) {
			String key = str.getKey();
			_08_Member member = str.getValue();
			System.out.println("key: " + key + ", value: " + member);
		}
	}
}
