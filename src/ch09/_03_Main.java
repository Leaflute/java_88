package ch09;

import java.util.ArrayList;
import java.util.List;

public class _03_Main {
	public static void main(String[] args) {
		
		// ArrayList 생성 후 book 정보를 추가
		List<_03_Book> list = new ArrayList<_03_Book>();
		list.add(new _03_Book("태백산맥","조정래"));	//[0]
		list.add(new _03_Book("데미안","헤르만 헤세"));
		list.add(new _03_Book("토지","박경리"));
		
		// 출력 
		for(int i=0;i<list.size();i++) {
			_03_Book book = list.get(i);
			System.out.println(book.toString());
		}
		
		System.out.println("====================");
		for(_03_Book book : list) {
			System.out.println(book);
		}
		
		
	}
}
