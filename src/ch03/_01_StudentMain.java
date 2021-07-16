package ch03;

public class _01_StudentMain {
	public static void main(String[] args) {
		/*              int     i    =  10
		 * 인스턴스 생성 : 클래스명 참조변수명 = new 클래스명();  // new 생성자;
		 * 		   접근 : 참조변수명.멤버변수;
		 * 			      참조변수명.멤버메서드;
		 * - 참조변수명에는 생성한 인스턴스의 heap메모리 공간의 주소값이 들어있음. Stack메모리에 생성.
		 * - 앞의 클래스명은 데이터 타입이고, 참조변수로 접근할 때 사용.
		 * - 뒤의 클래스명은 heap메모리에 인스턴스에 생성시 사용되는 생성자이다.
		 * 
		 */
		
		// 인스턴스 생성 : 클래스명 참조변수명 = new 클래스명();
		_01_Student lee = new _01_Student();
		
		// 멤버변수에 값을 할당
		// 접근 : 참조변수명.멤버변수;
		lee.studentID = 202101;
		lee.studentName = "이박사";
		lee.grade = 3;
		lee.address = "서울특별시 중구";
		lee.email = "pflee0101@abcdef.com";
		
		// 출력(메서드 호출)
		// 참조변수명, 멤버메서드();
		lee.printInfo();
		
		System.out.println("===============");
		
		// park이라는 학생정보 출력
		
		_01_Student park = new _01_Student();
		
		park.studentID = 202102;
		park.studentName = "박지성";
		park.grade = 2;
		park.address = "경기도 수원시";
		park.email = "jspark13@korea.com";
				
		park.printInfo();
		
	}
}
