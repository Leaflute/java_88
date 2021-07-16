package test;

public class _17_BookInfo {

	// 멤버변수
	private String registerNo;	// 등록번호
	private String title;	// 책제목
	private String author; // 작가

	// 생성자
	public _17_BookInfo (){}
	public _17_BookInfo (String registerNo, String title, String author){
		this.registerNo = registerNo;
		this.title = title;
		this.author = author;
	}
	
	// getter setter
	public void setRegisterNo(String registerNo){
		this.registerNo = registerNo;
	}
	public String getRegisterNo(){
		return registerNo;
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
	public String getAuthor(){	//누락
		return author;
	}	
}