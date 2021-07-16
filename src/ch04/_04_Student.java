package ch04;

// p181 static 변수, 메서드

public class _04_Student {
	
	// static 변수
	public static int serialNum = 1000;
	
	// 멤버 변수
	public int studentID;	// 학번
	public String studentName;	//이름
	
	// 디폴트 생성자
	public _04_Student() {
		
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
	
	public void printInfo() {
		System.out.println("serialNum : " + serialNum + ", 이름: " + studentName + ", 학번: " + studentID);
	}
}
