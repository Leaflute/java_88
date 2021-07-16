package ch09;

import java.util.HashMap;
import java.util.Map;

public class _05_HashMap {
	public static void main(String[] args) {
		
		/*
		 * [면접] p439
		 * 해싱(hashing): key를 이용해서 hashtable로부터 데이터를 가져오는 과정
		 * 
		 * HashMap
		 * 1. 특징
		 * - 데이터의 순서를 보장하지 않음
		 * - key와 value의 한 쌍으로 되어 있음
		 * - key는 중복될 수 없음
		 * - key를 이용해 value를 반환할 수 있음
		 * - List 계열과 달리 index가 없다.
		 * - Map이라는 인터페이스를 구현한 클래스이다.
		 * 
		 * 2. 선언(문법)
		 * - HashMap<key 타입, value 타입> map = new HashMap<key 타입, value 타입>();
		 * - Map<key 타입, value 타입> map = new HashMap<key 타입, value 타입>();	// 다형성 적용
		 * 
		 * 3. 메서드
		 * - 데이터 추가: put(key, value);
		 * - 데이터 반환: get(key);
		 * - 데이터 삭제: remove(key)l
		 * - 데이터 공란 여부: isEmpty();
		 * - 키 공란 여부: containsKey(key);
		 * - 값 공란 여부: containsvalue(value);
		 * - 갯수 체크: size();
		 * 
		 */
		
		// 맵 생성
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// 데이터 추가: put(key, value);
		map.put(1, "한가인");
		map.put(2, "한예슬");
		map.put(3, "이나영");
		map.put(4, "김태희");
		map.put(5, "손예진");
		
		// 전체출력
		for(int i=1; i<=map.size(); i++) {
			System.out.print(map.get(i)+" ");
		} 
		
		System.out.println();
		
		// 데이터 가지고오기: get(key);
		System.out.println(map.get(5));// 손예진
		
		System.out.println("삭제 전 맵의 size() ==> " + map.size());
		
		// 데이터 삭제: remove(key);
		map.remove(2);
		
		System.out.println("삭제 후 맵의 size() ==> " + map.size());
		
		for(int i=1; i<=map.size(); i++) {
			System.out.print(map.get(i)+" ");
			// 한가인 null 이나영 김태희 => 중간 삭제시 null로 value가 대체되어서 index를 당기지 않는다.
		} 
		
		System.out.println();
		
		// 데이터가 비었는지 확인
		System.out.println("=== 데이터가 비었는지 여부: isEmpty() ===");
		System.out.println(map.isEmpty());	// 삭제를 해도 null로 남아있음
		
		System.out.println("=== 해당 키가 있는지 여부 : containsKey(key); ===");
		System.out.println(map.containsKey(2));
		System.out.println(map.containsKey(3));
		System.out.println(map.containsKey(4));
		System.out.println(map.containsKey(5));
		
		System.out.println("=== 해당 값이 있는지 여부 : containsValue(value); ===");
		System.out.println(map.containsValue("한예슬"));
		System.out.println(map.containsValue("한가인"));
		System.out.println(map.containsValue("김태희"));
		
		System.out.println("=== 해당 개수 : size() ===");
		System.out.println(map.size());
	}
}
