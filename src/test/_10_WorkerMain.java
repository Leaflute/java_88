package test;

public class _10_WorkerMain {
	public static void main(String[] args){
	
	// 매개변수 생성자로 초기화
	// 홍길동, 50000
	_10_Worker hong = new _10_Worker("홍길동", 50000);
	_10_ElectronicShop notebook  = new _10_ElectronicShop("LG Gram");
	_10_Emart stake = new _10_Emart("T-born Stake");

	// buyNotebook()
	hong.buyNotebook(notebook);
	// takeoutStake()
	hong.takeoutStake(stake);
	// printShopInfo()
	notebook.printShopInfo();
	// printEmartInfo()
	stake.printShopInfo();
	// printWorkerInfo()
	hong.printWorkerInfo();

	}
}
