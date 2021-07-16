package ch05;

public class _04_StudentMain {
	public static void main(String[] args) {
		
		// 3명의 student 정보를 배열로 출력

		_04_Student[] student = new _04_Student[3];
		
		student[0] = new _04_Student("가",18,"fadfad@adfasfd.com");
		student[1] = new _04_Student("나",16,"asdf@adfasfd.com");
		student[2] = new _04_Student("다",19,"qeqwe@adfasfd.com");
		
		for (int i=0; i<student.length; i++) {
			student[i].showInfo();
		}
	}
}
