package ch10;

// 사용자 정의 Exception 
public class _08_InvalidNameException extends Exception {
	
	private String wrongName;
	
	public _08_InvalidNameException() {}
	public _08_InvalidNameException(String message) {
		super(message);
	}
	
	public String getWrongName() {
		return wrongName;
	}
	public void setWrongName(String wrongName) {
		this.wrongName = wrongName;
	}
	
	// 에러메시지 출력
	public void showWrongName() {
		System.out.println("잘못 입력된 이름: " + wrongName);
	}
}
