package ch09;

import java.util.ArrayList;
import java.util.List;

public class _02_ArrayListEx {
	public static void main(String[] args) {
		/*
		 * 8. 검색 : list.indexOf(검색할 값);  // 중요
		 *          리스트에서 검색할 값과 똑같은 값을 갖는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
		 *          검색할 값과 일치한 데이터가 없으면 -1을 리턴한다.
		 *          
		 *         list.lastIndexOf(검색할 값);
		 *          리스트에서 검색할 값과 같은 값을 가지는 마지막번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
		 *          검색할값과 일치한 데이터가 없으면 -1을 리턴한다.
		 */
		
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("H");	// index no.0
		arrayList.add("O");
		arrayList.add("N");
		arrayList.add("G");
		arrayList.add("G");
		arrayList.add("I");
		arrayList.add("L");
		arrayList.add("D");
		arrayList.add("O");
		arrayList.add("N");
		arrayList.add("G");	// index no.10
		
		// 일치하는 첫 번째 데이터를 찾아서 그 위치의 인덱스를 리턴
		System.out.println("G의 인덱스: " + arrayList.indexOf("G"));
		System.out.println("N의 인덱스: " + arrayList.indexOf("N"));
		
		System.out.println("N의 마지막 인덱스: " + arrayList.lastIndexOf("N"));
		System.out.println("G의 마지막 인덱스: " + arrayList.lastIndexOf("G"));
		
		System.out.println("Z의 인덱스: " + arrayList.lastIndexOf("Z"));
		
		// 향상된 for문으로 전체 인덱스 출력
		for(String str : arrayList) {
			System.out.print(str + " ");
		}
		
		System.out.println();
		arrayList.clear();
		System.out.print("리스트 삭제 후");
		System.out.println(" 리스트: " + arrayList);	// arrayList = []
		
	}
}
