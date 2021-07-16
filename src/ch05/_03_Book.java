package ch05;

public class _03_Book {
	// 멤버변수
		private String bookName;
		private String author;
	
	// 디폴트 생성자
		public _03_Book() {}
	
	// 매개변수 생성자
		public _03_Book(String bookName,String author) {
			this.bookName = bookName;
			this.author = author;
		}	
	// 멤버 메서드 setter getter
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getBookName() {
			return bookName;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getAuthor() {
			return author;
		}

	// 멤버메서드 showBookInfo()
		public void showBookInfo() {
			System.out.println(bookName + ", " + author);
			
		}
		
}
