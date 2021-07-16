package test;

public class _17_Main {
	public static void main(String[] args){
		
		// 매개변수 포함 참조변수 
		_17_SubBookInfo sbi = new _17_SubBookInfo("N-0001", "짜라투스트라는 이렇게 말했다", "니체", "홍길동", "2021-05-28"); 
		sbi.checkOut("홍길동", "2021-05-28");
		sbi.checkOut("홍길동", "2021-05-28");

		System.out.println("=============================");

		sbi.checkIn();
		sbi.checkIn();
	}
}	