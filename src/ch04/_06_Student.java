package ch04;

// p181 static 변수, 메서드

public class _06_Student {
	
	// static 변수
	public static int serialNum = 1000;
	
	// 멤버 변수
	public int studentID;	// 학번
	public String studentName;	//이름
	
	// 디폴트 생성자
	public _06_Student() {
		serialNum++;
		studentID = serialNum;
	}
	
	// getter, setter
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getStudentID() {
		return studentID;
	}
	// 추가
	public static void setSerialNum(int serialNum) {
		// 클래스명.static 변수 : 클래스명을 붙인 이유는 매개변수와 구분하기 위해서
		_06_Student.serialNum = serialNum;	// static 변수 = 매개변수
	}
	
	// static 메서드 내에서 멤버변수 사용불가, 인스턴스가 생성될 때 만들어지는 인스턴스 변수이므로
	public static int getSerialNum() {
//		studentName = "이지원"; // studentName이 static으로 바꿔야 사용가능
		return serialNum;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentName() {
		return studentName;
	}
	
}

