package test;

public class _12_Main{
	public static void main(String[] args){

		// 참조변수 생성
		_12_WooriBank woori = new _12_WooriBank();				//생성자명 오타
		_12_ShinhanBank shinhan = new _12_ShinhanBank();
	
		// setter()로 변수 값 지정 및 메서드 구현
		shinhan.setBankName("신한은행");
		shinhan.setAccountNum("456845656987");
		shinhan.setRate(1.21);
		shinhan.setEvent("금리인하");
		
		shinhan.printInfo();
		shinhan.excuteLoan();
		
		System.out.println("---------------------------------");
	
		woori.setBankName("우리은행");
		woori.setAccountNum("1002000000000");
		woori.setRate(1.34);
		woori.setVipMember("VIP");
		
		woori.printInfo();
		woori.makeWooriProduct();
	}

}