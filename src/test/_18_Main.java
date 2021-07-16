package test;

public class _18_Main {
	public static void main(String[] args){
	
	// 참조변수 bookList를 통해 _18_BookArrayList 불러옴
	_18_BookArrayList bookList = new _18_BookArrayList();

	// _18_Book 생성자에 초기화값 전달
	_18_Book alchemist = new _18_Book(101, "연금술사", "파울로 코엘료");
	_18_Book cheeze = new _18_Book(102, "누가 내 치즈를 옮겼을까", "스펜서 존슨");
	_18_Book forest = new _18_Book(103, "더불어 숲", "신영복");
	
	// 책추가	
	bookList.addBook(alchemist);
	bookList.addBook(cheeze);	
	bookList.addBook(forest);

	// 책정보
	bookList.showAllBook();
	
	// 책삭제
	bookList.removeBook(103);
	
	System.out.println("---------------------------------");
	
	// 책 정보 출력		
	bookList.showAllBook();
	}
}	