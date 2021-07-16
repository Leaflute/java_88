package test;

import java.util.ArrayList;			//;생략
import java.util.List;		

public class _18_BookArrayList {

	//  다형성 적용한 ArrayList사용
	private List<_18_Book> list;

	// 생성자
	public _18_BookArrayList (){
		list = new ArrayList<_18_Book>();
	}

	// 책 정보 추가
	public void addBook(_18_Book book){
		list.add(book);		// add를 addmember로 침
	}
	
	
	// 해당 책 정보 삭제(103)
	public boolean removeBook(int bookNo){
		for(int i=0; i<list.size(); i++){
		_18_Book book = list.get(i);
		int tempNo = book.getBookNo();
			if (tempNo == bookNo){
				list.remove(i);
				return true;
			}
		}
		System.out.println(bookNo + "가 존재하지 않습니다.");
		return false;
	}

	// 책 정보 조회
	public void showAllBook(){
		for(_18_Book book : list){
			System.out.println(book);
		}
	}
}