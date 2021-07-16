package test;

public class _11_StudentMain {

	public static void main (String[] args){

		_11_Student[] student = new _11_Student[5];
		
		student[0] = new _11_Student("000001", "유재석", 18, "독서");
		student[1] = new _11_Student("000002", "박명수", 19, "자전거");
		student[2] = new _11_Student("000003", "정준하", 19, "음악감상");
		student[3] = new _11_Student("000004", "정형돈", 17, "게임");
		student[4] = new _11_Student("000005", "하동훈", 16, "낚시");	
	
		for(int i=0; i<student.length; i++){
			student[i].showInfo();				// 멤버메서드 출력 실수 System.out 사용
			System.out.println("------------");
		}

	}

}