package ch09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

	/*
	 * 컬렉션 프레임워크
	 * 
	 * Collection 인터페이스
	 * - List 인터페이스 : 클래스 종류는 ArrayList, Vector, LinkedList
	 * - Set 인터페이스 : 클래스종류는 HashSet, TreeSet
	 * - Map 인터페이스 : 클래스종류는 HashMap, HashTable, TreeMap
	 * 
	 *  <면접>
	 *  1. 특징
	 *  List 인터페이스 : 순서가 있는 자료관리, 중복허용한다.
	 *                 index를 사용하여 요소에 접근한다.
	 *                 리스트에 들어있는 요소들의 인덱스는 0부터 시작한다. 
	 *                 클래스종류는 ArrayList, Vector, LinkedList
	 *                 
	 *  Set 인터페이스 : 순서가 없는 자료관리, 중복허용 않는다.
	 *                클래스종류는 HashSet, TreeSet
	 *                
	 * [ArrayList]
	 * 2. 선언           
	 * ArrayList<데이터타입클래스> 참조변수 = new ArrayList<데이터타입클래스>();
	 * 
	 * 다형성 적용 
	 * List<데이터타입클래스> 참조변수 = new ArrayList<데이터타입클래스>();
	 *
	 * 3. 특징 : 데이터 순서가 있고, 중복허용된다.
	 * 4. 추가 : list.add(값);   // 앞에서부터 순서대로 추가
	 *         list.add(추가할 위치 index, 값);  // 지정한 인덱스에 값을 추가, 그 뒤값은 밀려난다.
	 *         
	 * 5. 값 가져오기 : list.get(가져올 index);  // list.size() 만큼 반복    
	 * 6. 교체 : list.set(교체할 위치 index, 값);  // 지정한 인덱스의 값을 변경.. 그 뒤값은 그대로이다.
	 * 7. 삭제 : list.remove(삭제할 위치 index);
	 * 8. 검색 : list.indexOf(검색할 값);  // 중요
	 *          리스트에서 검색할 값과 똑같은 값을 갖ㄴ는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
	 *          검색할 값과 일치한 데이터가 없으면 -1을 리턴한다.
	 * 9. 전체 삭제 : list.clear();
	 * 10. 반복자 : Iterator<E> iterator : while(hasNext()) { next() }          
	 */

public class _01_ArrayListEx {
	public static void main(String[] args) {
		
		// 클래스명 참조변수 = new 클래스명();
		// int -> Integer
		// <> 다이아몬드 연산자
		ArrayList<String> list = new ArrayList<String>();
		
		// 자료 추가 add();
		list.add("수박");			// index = 3
		list.add("피자");		
		list.add("떡볶이");		
		list.add("치킨");
		list.add(0, "국밥");		// index = 0 => 인덱스위치에 추가하고 나머지 밀려남
		list.add(1, "바나나우유");	// index = 1
		list.add(2, "냉면");		// index = 2
		
		
		System.out.println("=== 방법1. for문 ===");
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		list.set(2, "자장면");	// set(index, E) -> 인덱스의 값을 변경
		list.remove(2);
		
		System.out.println();
		System.out.println("=== 방법2. 향상된 for문 === "); 
		for(String str: list) {
			System.out.print(str + " ");
		}
		
		System.out.println("");
		System.out.println("=== 방법3. 반복자(Iterator) 사용 ==="); 
		
		/*
		 * 반복자(iterator) 
		 * - java.util 패키지에 정의되어 있는 인터페이스를 구현하는 객체
		 * - 컬렉션의 원소에 접근하는 목적으로 사용
		 * 
		 * - 사용메서드
		 * hasNext() : 아직 접근하지 않는 요소가 있으면 true를 반환
		 * next() : 있다면 해당 요소를 Object타입으로 반환 => Object 가장 큰 자료형
		 * remove() : 최근에 반환된 요소를 삭제
		 */
		
		List<String> season = new ArrayList<String>();
		
		season.add("봄");
		season.add("여름");
		season.add("가을");
		season.add("겨울");
		
		Iterator iterator = season.iterator();	// Iterator *인터페이스*의 메서드를 호출하기 위해 사용하는 메서드
		
		// 값이 존재하는 동안 이동해가면서 출력
		while(iterator.hasNext()) {		// ArrayList의 값이 존재하는지 체크, 리턴타입 boolean
			// String str = (String) Object;
			String str = (String) iterator.next();	// iterator.next()는 Object형을 반환
			System.out.print(str + " ");
		}
		
		System.out.println();
		System.out.println("==== 연습 ====");
		
		List<String> dream = new ArrayList<String>();
		
		dream.add("농부");
		dream.add("어부");
		dream.add("광부");
		dream.add("심마니");
		dream.add("망나니");
		
		Iterator itr1 = dream.iterator();
		
		while(itr1.hasNext()) {
			String str = (String) itr1.next();
			System.out.print(str + " ");
		}
	}
}
