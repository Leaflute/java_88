package test;

public class _23_InvalidNameException extends Exception {

	private String wrongName;

	// 생성자
	public _23_InvalidNameException() {}			// 기본 생성자 누락
	public _23_InvalidNameException(String message){// String 누락	
		super(message);
	}
	
	// setter getter
	public void setWrongName(String wrongName){
		this.wrongName = wrongName;
	}
	public String getWrongName(){
		return wrongName;
	}
	
	// showWrongName
	public void showWrongName(){
		System.out.println("잘못된 이름 입력! " + wrongName);
	}
}