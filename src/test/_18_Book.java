package test;

public class _18_Book {
	
	// 멤버변수
	private int bookNo;		// 101,102,103
	private String title;		// 연금술사, 누가 내 치즈를 옮겼을까, 더불어 숲 
	private String author;	// 파울로 코엘료, 스펜서 존슨, 신영복	//private 오타

	// 생성자
	public _18_Book (){}
	public _18_Book (int bookNo, String title, String author){
		this.bookNo = bookNo;	// int 삽입
		this.title = title;
		this.author = author;
	}

	// getter setter
	public void setBookNo(int bookNo){
		this.bookNo = bookNo;
	} 
	public int getBookNo(){
		return bookNo;
	}
	public void setTitle(String title){
		this.title = title;
	} 
	public String getTitle(){
		return title;
	}
	public void setAuthor(String author){
		this.author = author;
	} 
	public String getAuthor(){
		return author;
	}	
	
	@Override
	public String toString(){
		return "책 이름: " + title + ", 저자:" + author +", 책넘버: " + bookNo;
	}  
}