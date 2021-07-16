package ch10;

public class _07_Main {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws _07_IDFormatException {
		if(userID == null) {
			throw new _07_IDFormatException("아이디는 null일 수 없습니다.");
		} else if (userID.length() > 8 || userID.length() < 20) {
			throw new _07_IDFormatException("아이디는 8자이상 20자 이하여만 합니다.");
		}
		this.userID = userID;
	}
	
	
	public static void main(String[] args) {
		
		_07_Main test = new _07_Main();
		
		String userID = null;
		try {
			test.setUserID(userID);
		} catch (_07_IDFormatException e) {
			System.out.println(e.getMessage());	
			// e.printStackTrace();
		}
		
		userID = "15678";
		try {
			test.setUserID(userID);
		} catch (_07_IDFormatException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
	}
}