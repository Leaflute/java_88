package test;

public class _22_Main_Iterator {
	public static void main(String[] args) {
		
		_22_Student_Iterator stu = new _22_Student_Iterator();
		
		// 매개변수 생성자 호출
		_22_Student studentPark = new _22_Student(1, "박지성", "park13@manu.com");
		_22_Student studentSon = new _22_Student(2, "손흥민", "son7@spurs.com");
		_22_Student studentCha = new _22_Student(3, "차범근", "Cha11@bayer.com");

		// 학생추가
		stu.addStudent(studentPark);
		stu.addStudent(studentSon);
		stu.addStudent(studentCha);
		
		// 학생정보삭제
		stu.removeStudent(1);
		
		// 학생정보 출력
		stu.showAllStudent();
	}

}
