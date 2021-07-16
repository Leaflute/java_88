package ch07;

// 자식클래스 - 부모클래스 상속받고 인터페이스 구현
public class _07_AppCDInfo extends _07_CDInfo implements _07_Lendable {
	
	// 멤버변수
	private String borrower;		// 대여자
	private String checkOutDate;	// 대여일자
	private int state;// 대여여부
	
	// 생성자
	public _07_AppCDInfo() {}
	public _07_AppCDInfo(String registerNo, String title, String borrower, String checkOutDate) {
		super(registerNo, title);
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;	
		state = STATE_NORMAL;
	}
	
	// getter setter
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
	public String getBorrwer() {
		return borrower;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	
	// 메서드 구현
	@Override
	public void checkOut(String borrower, String checkOutDate) {
		if (state == STATE_BORROWED) {
			System.out.println("================");
			System.out.println("대여중입니다.");
			System.out.println(super.getTitle() + " 대여할 수 없습니다.");
			System.out.println("================");
		} else if (state == STATE_NORMAL) {
			System.out.println("================");
			System.out.println("코드: " + super.getRegisterNo());
			System.out.println("책이름: " + super.getTitle());
			System.out.println("대여자: " + borrower);
			System.out.println("대여일자: " + checkOutDate);
			System.out.println("대여가 완료되었습니다.");
			System.out.println("================");
			state = STATE_BORROWED;
		}
	}
	
	@Override
	public void checkIn() {
		if (state == STATE_NORMAL) {
		System.out.println("================");
		System.out.println("반납할 수 없습니다.");
		System.out.println("대여가능.");
		System.out.println("================");
		} else if (state == STATE_BORROWED) {
			System.out.println("================");
			System.out.println("코드: " + super.getRegisterNo());
			System.out.println("책이름: " + super.getTitle());
			System.out.println("대여자: " + borrower);
			System.out.println("대여일자: " + checkOutDate);
			System.out.println("반납을 완료했습니다.");
			System.out.println("================");
			state = STATE_NORMAL;
		}
	}

	


}
