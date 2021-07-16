package ch06;

public class _05_Main {
	public static void main(String[] args) {
		
		// 인스턴스 생성
		_05_GoldMember gold = new _05_GoldMember("abcde", "qewr1234", "김정호", "goldMember event");
		_05_VipMember vip = new _05_VipMember("xyz", "qwer!@#$", "장영실", "VIP");
		
		System.out.println("---- 골드 ----");
		gold.showInfo();
		System.out.println("---- VIP ----");
		vip.showInfo();
		
	}
}
