package test;

public class _17_SubBookInfo extends _17_BookInfo implements _17_Library {
	
	// 멤버변수
	private String borrower;	// 대여자
	private String checkOutDate;// 대여일자
	private int state;		// 대여상태

	// 생성자
	public _17_SubBookInfo(){}
	public _17_SubBookInfo(String registerNo, String title, String author, String borrower, String checkOutDate){
		super(registerNo, title, author);
		this.borrower = borrower;		// borrower typo
		this.checkOutDate = checkOutDate;
		state = STATE_NORMAL;
	}

	// showInfo
	public void showInfo(){
		System.out.println("책이름: " + super.getTitle());	// getTitle로 접근했어야
		System.out.println("저자: " + super.getAuthor());		// 누락
		System.out.println("대여자: " + borrower);
		System.out.println("대여일자: " + checkOutDate);
	}

	// 메서드 구현
	public void checkOut(String borrower, String checkOutDate){
		if(state==STATE_NORMAL){
			System.out.println("*** 대여를 완료했습니다. ***");
			showInfo();
			System.out.println("*** 반납일자를 꼭 지켜주세요. ***");
			state = STATE_BORROWED;	// 누락
		} else {
			System.out.println("대여 상태: 대여중");	
			System.out.println("대여할 수 없습니다.");			
		}
	}

	public void checkIn(){
		if(state==STATE_BORROWED){
			System.out.println("*** 정상 반납처리되었습니다. ***");
			System.out.println("대여 상태: 대여 가능");
			showInfo();	
			state = STATE_NORMAL;	// 누락
		} else {
			System.out.println("이미 반납이 완료된 책입니다.");
		}
	}

}