package test;

public class _09_Bank {
	
	// 멤버 변수
	private int balance;
	private String name;
	private String accountNum;

	// private 생성자
	private _09_Bank(){}
	
	// static instance 생성
	private static _09_Bank instance = new 	_09_Bank();
	
	// instance 반환 메서드
	public static _09_Bank getInstance(){
		if (instance == null) {
			instance = new _09_Bank();
		}
		return instance;
	}
	
	// setName(String name); , getName();
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}	

	// setDeposit(int balance); , getDeposit();
	public void setDeposit(int balance){
		this.balance = balance;
	}
	public int getDeposit(){
		return balance;
	}	

	// setAccountNum(int accountNum); , getAccountNum();
	public void setAccountNum(String accountNum){
		this.accountNum = accountNum;
	}
	public String getAccountNum(){
		return accountNum;
	}

	// printBankInfo();
	public void printBankInfo(){
		System.out.println("계좌번호: " + accountNum);
		System.out.println("이름: " + name);
		System.out.println("잔액: " + balance);
	}

}