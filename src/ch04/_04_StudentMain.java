package ch04;

public class _04_StudentMain {
	public static void main(String[] args) {
		
		/*[면접]
	       * static 변수 = 정적변수 = 공유변수 = 클래스변수
	       * static 변수 :
	       * - 프로그램이 실행되어 메모리에 올라갔을 때 딱 한번 데이터영역 메모리 공간에 할당된다.
	       * - 객체를 생성하지 않고, 바로 클래스명으로 접근가능하다.
	       *   인스턴스마다 생성되는 변수가 아니라, 클래스에 속해 한번만 생성되는 변수이고, 여러 인스턴스가 공유하기 때문이다.
	       *   인스턴스가 생성되지 않아도 사용할 수 있기 때문에 클래스명.멤버변수, 클래스명.멤버메서드 사용가능
	       *   
	       * - static 변수나 메서드는 static 메서드에서 호출가능
	       * (정적메서드에서 인스턴스 변수나 메서드를 호출시 컴파일 오류가 난다.)
	       * static 메서드는 프로그램 실행시 자동으로 메모리에 올라가나, 일반메서드는 객체를 생성해야 메모리에 올라간다.
	       * 
	       */
		
		// 인스턴스 생성
		_04_Student lee = new _04_Student();

		// setter
		lee.setStudentName("이철진");
		lee.setStudentID(1);
		lee.printInfo();
		
		_04_Student.serialNum++; // 클래스명.static 변수
		lee.printInfo();
		
		System.out.println("-------------------");
		
		// 인스턴스2 생성
		_04_Student you = new _04_Student();

		// setter2
		you.setStudentName("유재석");
		you.setStudentID(2);
		you.printInfo();
		
		_04_Student.serialNum++; // 클래스명.static 변수
		you.printInfo();
		
	}

}
