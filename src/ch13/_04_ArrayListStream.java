package ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// p477
public class _04_ArrayListStream {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Paul");
		list.add("John");
		list.add("Joshua");
		
		// 스트림 생성
		Stream<String> stream = list.stream();	
		
		// 배열의 요소 추출
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();
		// stream.sorted().forEach(s -> System.out.println(s + " ")); -> 최종연산으로 소멸된 스트림이라 오류
		// Stream()이 임포트된 상태에서 ArrayList의 참조변수.stream()을 사용해서 새로 생성해야한다
		list.stream().sorted().forEach(s -> System.out.print(s + " "));
		
		
	}
}
