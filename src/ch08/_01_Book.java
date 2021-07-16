package ch08;

// p356


public class _01_Book {
	
	   /* 
	    * 모든 클래스의 최상위 클래스 Object
	    * toString() 메서드가 재정의 안되어있다.
	    * 컴파일과정에서 Extends Object가 자동으로 추가되고, Object의 toString() 메서드가 호출되었다.
	    * Object의 toString() : 패키지명.클래스명@해시코드값 => 주소값  예) ch08._01_Book@7852e922
	    * 재정의해서 객체 정보를 문자열로 반환해서 사용해야 원하는 정보를 출력할 수 있다.
	    */

	int bookNumber;
	String bookTitle;
	
	public _01_Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;			
	}
	
	@Override
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
	

}
