package ch04;

// p181 static 변수, 메서드
	/*
	 * static 변수 : static 자료형 변수이름;
	 * 정적 변수. 클래스 변수. 프로그램이 실행되어 데이터 영역 메모리에 올라가고
	 * 딱 한번 메모리 공간이 할당되며, 모든 인스턴스가 공유
	 * 클래스.변수이름으로 다른 클래스에서 호출 가능
	 */

public class _05_Student {
	
	// static 변수
	public static int serialNum = 1000;
	
	// 멤버 변수
	public int studentID;	// 학번
	public String studentName;	//이름
	
	// 디폴트 생성자
	public _05_Student() {
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
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentName() {
		return studentName;
	}
	
}

