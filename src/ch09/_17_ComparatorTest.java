package ch09;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// p437 Comparator의 compare() 재정의
class MyCompare implements Comparator<String> {
	
	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)*-1);	
	}
	
}

public class _17_ComparatorTest {
	public static void main(String[] args) {
		Set<String> set= new TreeSet<String>(new MyCompare());
		
		set.add("light");
		set.add("right");
		set.add("fight");
		System.out.println(set);
		
		// [right, light, fight] 알파벳의 역순으로 출력
	}
}
