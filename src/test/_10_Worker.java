package test;

public class _10_Worker{

	// 멤버변수
	public String workerName;
	public int money;

	// 생성자
	public _10_Worker(){}

	// 매개변수 생성자
	public _10_Worker(String workerName, int money){
		this.workerName = workerName;
		this.money = money;
	}
		
	// 멤버 메서드	
	public void buyNotebook(_10_ElectronicShop notebook){
		notebook.buy(15000);
		this.money -= 15000;
	}

	public void takeoutStake(_10_Emart stake ){
		stake.buy(1000);
		this.money -= 1000;
	}

	public void printWorkerInfo(){
		System.out.println(workerName + "은 " + money + "만큼의 잔액을 가지게 되었다.");
	}
	
}