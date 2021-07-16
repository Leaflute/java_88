package ch14;

// Thread클래스를 상속 - 계좌이체 쓰레드
public class _06_TransferThread extends Thread { 
	_06_SharedArea sharedArea;
	
	// 디폴트 매개변수 생성자 ... 매개변수에 주소값을 전달해야 함
	public _06_TransferThread() {}
	public _06_TransferThread(_06_SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}
	
	// 추상메서드 재정의
	@Override
	public void run() {
		// 계좌이체 5번.. 이체금액은 1000원씩 5번
		for (int trans=1; trans<=5; trans++) {
			sharedArea.transfer(1000);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}

}
