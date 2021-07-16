package ch04;

public class _03_StudentMain {
	public static void main(String[] args) {
		
		// 인스턴스 생성
		_03_Student stu = new _03_Student();
		
		System.out.println("=== 방법1. 디폴트 생성자, setter로 값 설정 ===");
		
		stu.setStudentID("200101");
		stu.setName("홍길동");
		stu.setScore(90);
		stu.printInfo();
		
		System.out.println();
		
		// 매개변수포함 인스턴스 생성
		_03_Student stu2 = new _03_Student("200102", "임꺽정", 50);
	
		System.out.println(" === 방법2. 매개변수 생성자로 값 설정 후 getter로 출력 ===");
		System.out.println("학번 : " + stu2.getStudentID());
		System.out.println("이름 : " + stu2.getName());
		System.out.println("점수 : " + stu2.getScore());
	}

}
