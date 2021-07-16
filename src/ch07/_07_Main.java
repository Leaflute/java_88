package ch07;

public class _07_Main {
	public static void main(String[] args) {
		// 자식매개변수 생성자를 통한 값 전달
		// 대출, 반납정보 호출
		
		_07_AppCDInfo jeon = new _07_AppCDInfo("novel1234","노인과 바다","전우치","20210526");
		jeon.checkOut(jeon.getBorrwer(), jeon.getCheckOutDate());
		jeon.checkOut(jeon.getBorrwer(), jeon.getCheckOutDate());
		
		System.out.println();
		jeon.checkIn();
		jeon.checkIn();
	}

	
}
