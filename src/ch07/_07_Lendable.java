package ch07;

public interface _07_Lendable {

	// 상수
	int STATE_BORROWED = 1;	//대출상태
	int STATE_NORMAL = 0;	//반납상태
	
	// 추상메서드
	public void checkOut(String borrower, String date);	// 대출하다
	public void checkIn();	// 반납하다
}
