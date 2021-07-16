package ch14;

public class _02_ThreadMain {
	
	/*
	 * [면접]
	 * Thread 생성과 실행
	 * (2) Runnable 인터페이스 구현
	 * 
	 * 1. Runnable 인터페이스를 implements 받아서 클래스를 작성한다.
	 * 2. 추상메서드 run() 메서드를 재정의 
	 * 3. main() 메서드에서  Thread라는 객체를 생성하고, implements받은 클래스 객채를 매개변수로 전달
	 * 4. start() 메서드 호출해서 스레드를 실행한다.
	 * 5. run() 메서드가 실행된다.
	 * 
	 */
	public static void main(String[] args) {
		

	Thread thread = new Thread(new _02_MyThread());
	thread.start();
	}
}
