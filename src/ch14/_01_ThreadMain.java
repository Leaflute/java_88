package ch14;

public class _01_ThreadMain {
	public static void main(String[] args) {
		
		/*
		 * [면접]
		 * Thread 생성과 실행
		 * (1) Thread 클래스를 상속하기
		 * 
		 * 1. Thread 클래스를 상속받아서 클래스를 작성한다.
		 * 2. run() 메서드를 재정의 
		 * 3. main() 메서드에서  Thread라는 객체를 생성한다.
		 * 4. start() 메서드 호출해서 스레드를 실행한다.
		 * 5. run() 메서드가 실행된다.
		 * 
		 */
		
		_01_MyThread t = new _01_MyThread();
		// start() : thread 실행 -> run() 호출
		t.start();
	}
}
