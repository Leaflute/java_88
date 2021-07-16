package ch14;

public class _05_VoteMain {
	public static void main(String[] args) {
		

	// 객체 5개. 쓰레드 5개
	// 각각 영향을 받지 않고, 각자 작업.
	
	Thread l1 = new Thread(new _05_VoteThread(), "서울");
	Thread l2 = new Thread(new _05_VoteThread(), "인천");
	Thread l3 = new Thread(new _05_VoteThread(), "수원");
	Thread l4 = new Thread(new _05_VoteThread(), "제주");
	Thread l5 = new Thread(new _05_VoteThread(), "부산");

	l1.start();
	l2.start();
	l3.start();
	l4.start();
	l5.start();
	}
}
