package ch09;

import java.util.HashSet;

//p423 
// HashSet의 특징 : 중복값이 없다. 순서가 없다.

public class _13_HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연희"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬"));	// 중복된 강감찬이 추가 안됨
		System.out.println(hashSet);
		
	}
}
