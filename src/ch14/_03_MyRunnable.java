package ch14;

public class _03_MyRunnable implements Runnable {
	
	// 멤버변수
	private String threadName;
	
	// 디폴트 생성자
	public _03_MyRunnable() {}
	// 매개변수 생성자
	public _03_MyRunnable(String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		// A10 A9 A8 ... A1
		// B10 B9 B8 ... B1
		for (int i = 10 ; i >= 1 ; i--) {
			System.out.print(threadName + i + " ");
		}
		System.out.println();	
	}

}
