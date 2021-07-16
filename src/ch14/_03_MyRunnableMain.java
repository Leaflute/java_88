package ch14;

public class _03_MyRunnableMain {
	public static void main(String[] args) {
		
		// 두 개의 스레드 A B
		
		Thread tA = new Thread(new _03_MyRunnable("A"));
		tA.start();
		
		Thread tB = new Thread(new _03_MyRunnable("B"));
		tB.start();
	}
}
