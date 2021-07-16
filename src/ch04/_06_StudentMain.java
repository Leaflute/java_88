package ch04;

public class _06_StudentMain {
	public static void main(String[] args) {
		
		// 클래스명.static 메서드 호출
		
		// 인스턴스 생성
		_06_Student lee = new _06_Student(); // 디폴트생성자 호출

		// setter
		lee.setStudentName("이철진");
		System.out.println(_06_Student.getSerialNum()); // 클래스명.static 메서드
		System.out.println("이름: " + lee.studentName + ", 학번: " + lee.studentID);
		System.out.println("-------------------");
		
//		1001
//		이름: 이철진, 학번: 1001
		
		// 인스턴스 생성
		_06_Student park = new _06_Student();
		// setter
		park.setStudentName("박명수");
		System.out.println(_06_Student.getSerialNum()); // 클래스명.static 메서드
		System.out.println("이름: " + park.studentName + ", 학번: " + park.studentID);
		System.out.println("-------------------");
		
//		1002
//		이름: 박명수, 학번: 1002
		
		// 인스턴스 생성
		_06_Student iu = new _06_Student();
		// setter
		iu.setStudentName("아이유");
		System.out.println(_06_Student.getSerialNum()); // 클래스명.static 메서드
		System.out.println("이름: " + iu.studentName + ", 학번: " + iu.studentID);
		System.out.println("-------------------");		

	}

}
