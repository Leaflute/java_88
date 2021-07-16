package ch09;

import java.util.TreeSet;

// p428
public class _15_TreeSetTest {
	
	/*
	 * TreeSet
	 * - 자료의 중복을 허용하지 않는 출력결과 값을 정렬
	 * - String 클래스 안에 이미 정렬방식이 구현되어 있음
	 */
	
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}
	 
}
