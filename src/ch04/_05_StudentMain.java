package ch04;

public class _05_StudentMain {
	public static void main(String[] args) {
		
		// 클래스명.static 변수 호출
		
		// 인스턴스 생성
		_05_Student lee = new _05_Student(); // 디폴트생성자 호출

		// setter
		lee.setStudentName("이철진");
		System.out.println(_05_Student.serialNum); // 클래스명.static 변수
		System.out.println("이름: " + lee.studentName + ", 학번: " + lee.studentID);
		
		System.out.println("-------------------");
		
//		1001
//		이름: 이철진, 학번: 1001
		
		// 인스턴스 생성
		_05_Student park = new _05_Student();
		// setter
		park.setStudentName("박명수");
		
		// 클래스명.static 변수
		System.out.println(_05_Student.serialNum); 
		// 참조변수.멤버변수;
		System.out.println("이름: " + park.studentName + ", 학번: " + park.studentID);
		
//		1002
//		이름: 박명수, 학번: 1002
		
		// 인스턴스 생성
		_05_Student iu = new _05_Student();
		// setter
		iu.setStudentName("박명수");
		System.out.println(_05_Student.serialNum); // 클래스명.static 변수
		System.out.println("이름: " + iu.studentName + ", 학번: " + iu.studentID);
				

	}

}
