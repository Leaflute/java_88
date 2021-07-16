package ch04;

public class _03_Student {

	// 멤버변수
	private String studentID;   // 학번 : 200101
	private String name;        // 이름 : 홍길동
	private int score;          // 성적 : 90	
	
	//	생성자 이름은 클래스 이름과 같고, 생성자는 반환값이 없다.
	
	//  default 생성자 
	//  컴파일러가 자동으로 생성하며 매개변수가 없음(생성자가 하나도 없을 때)
	// 	매개변수가 없고 멤버변수를 초기화 할 수 있음
	public _03_Student() {}
	
	// 매개변수 생성자 => 먼저 디폴트 생성자를 생성 후에 매개변수 생성자를 만든다.
	// 생성자 오버로드 : 생성자가 두 개 이상 제공되는 경우를 생성자 오버로드라고 한다.
	// 오버로드 : 메서드나 생성자의 매개변수 갯수가 다르거나, 매개변수 타입이 다른 경우를 말한다.(단, 리턴타입과는 무관)
	public _03_Student(String studentID, String name, int score) {
		this.studentID = studentID;
		this.name = name;
		this.score = score;	
	}
	
	// 멤버메서드 (setter, getter)
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int score) {
		this.score = score;
	}	
	
	public String getStudentID() {
		return studentID;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	// printInfo() - 멤버변수, 멤버메서드 두 가지로 출력
	public void printInfo() {
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + score);
	}
	
}
