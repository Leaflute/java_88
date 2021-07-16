package ch08;

//studentlee.equals(studentSang)이 동일하도록 예제
//p358 + p361 + p365 => hashCode() 오버라이드해서 studentID 리턴

//물리적 동일(주소 동일) : 1000 1000   .. 100, 이상원  => Object의 equals() : 주소값 비교 => 물리적 동일 :  "==", 오버라이드 안된 equals()
//논리적 동일(값 동일)    : 2000          ... 100, 이상원  => 오버라이드         :  값 비교 => 논리적 동일(값 동일) :  오버라이드된 equals()

public class _02_Student {
	
	// 멤버변수
	int studentID;
	String studentName;
	
	// 생성자
	public _02_Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	// 재정의된 toString
	@Override
	public String toString() {
		return studentID + "," + studentName;
	}
	
	// 재정의된 equals
	public boolean equals(Object obj) { // Object obj = new _02_Student
		if (obj instanceof _02_Student) {	// obj가 _02_Student의 여부인지를 체크
			_02_Student std = (_02_Student)obj;	// obj를 _02_Student클래스로 다운캐스팅
			if (this.studentID == std.studentID)// 학생의 학번이 같으면
				return true;					// true를 반환
			else return false;
	}
	return false;
	}
	
	// 재정의된 hashCode
	@Override
	public int hashCode() {
		return studentID;
	}
}
