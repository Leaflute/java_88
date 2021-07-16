package test;

public interface _17_Library {
	
	// 상수
	int STATE_BORROWED = 0; // 대여상태
	int STATE_NORMAL = 1; // 반납상태

	// 추상메서드
	public void checkOut(String borrower, String checkOutDate);
	public void checkIn();

}