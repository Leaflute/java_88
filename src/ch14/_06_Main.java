package ch14;

public class _06_Main {
	public static void main(String[] args) {
		
		/*
		 * 1) 한 계좌의 금액을 다른 계좌로 이체
		 * 2) 공유영역(아이유 계좌(200만원) + 성시경 계좌(100만원)
		 * 3) 두 계좌의 잔액합계를 출력하는 일을 동시에 한다.
		 * 
		 */
		
		// "010-1111-1111", "아이유", 2000000
		// "010-2222-2222", "성시경", 1000000
		
		// 쓰레드 생성 _06_SharedArea 참조변수를 매개변수로 활용
		_06_SharedArea sa = new _06_SharedArea();
		sa.account1 = new _06_Account("010-1111-1111", "아이유", 2000000);
		sa.account2 = new _06_Account("010-2222-2222", "성시경", 1000000);
		
		// 계좌이체 5회
		_06_TransferThread t1 = new _06_TransferThread(sa);

		// 잔액합계 3회
		_06_PrintTotalThread p1 = new _06_PrintTotalThread(sa);
		
		// 쓰레드 실행
		t1.start();
		p1.start();
	
	}
}
