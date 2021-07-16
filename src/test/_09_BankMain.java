package test;

public class _09_BankMain{
	public static void main(String[] args){
	
		// wooriBank 를 참조변수로 은행을 이용하게 하기
		
		_09_Bank wooriBank = _09_Bank.getInstance();

		// setter 값 설정
		wooriBank.setAccountNum("010000000");
		wooriBank.setName("김복자");
		wooriBank.setDeposit(90000);
		wooriBank.printBankInfo();
		
		// shinhanBank 를 참조변수로 은행을 이용하게 하기
		_09_Bank shinhanBank = _09_Bank.getInstance();
		
		// setter 값 설정
		shinhanBank.setAccountNum("010000000");
		shinhanBank.setName("김복자");
		shinhanBank.setDeposit(90000);
		shinhanBank.printBankInfo();		
	}
}