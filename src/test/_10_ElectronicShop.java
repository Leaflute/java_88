package test;

public class _10_ElectronicShop {
	
	// 멤버변수
	public String brandName;
	public int buyer;
	public int money;
	
	// 디폴트 생성자
	public _10_ElectronicShop(){}

	// 매개변수 생성자
	public _10_ElectronicShop(String brandName, int buyer, int money){
		this.brandName = brandName;
		this.buyer = buyer;
		this.money = money;
	}
	
	// 생성자 오버로드
	public _10_ElectronicShop(String brandName){
		this.brandName = brandName;
	}

	// 멤버메서드 - 물건을 사다, buy(int money);
	public void buy(int money){
		this.money += money;
		this.buyer++;
	}

	//printShopInfo();
	public void printShopInfo(){
		System.out.println("일렉트론마트에서는 "  + buyer + "명 만큼의 고객에게서 " + brandName + "을 팔아, " + money + "만큼의 수익을 올렸다.");
	}
}
