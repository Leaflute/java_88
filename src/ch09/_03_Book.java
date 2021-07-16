package ch09;

public class _03_Book {
	private String bookName;
	private String author;
	
	// 기본 생성자
	public _03_Book() {}
	public _03_Book(String bookName,String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	// 멤버메서드 setter getter
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setName(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	
	@Override
	public String toString() {
		return "bookName : " + bookName + ", author :  " + author;
	}
}
