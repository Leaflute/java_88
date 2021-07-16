package ch14;

// Thread 클래스를 상속 - 잔액합계 쓰레드
public class _06_PrintTotalThread extends Thread {
	_06_SharedArea sharedArea;
	
	// 디폴트 생성자
	public _06_PrintTotalThread() {}
	
	// 매개변수 생성자
	public _06_PrintTotalThread(_06_SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}
	
	// 추상메서드 재정의
	@Override
	public void run() {
		for(int cnt=0; cnt<3; cnt++) {
			// 잔액 합계 출력
			int sum = sharedArea.getTotal();
			System.out.println("계좌 잔액 합계: " + sum);
			
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
}
