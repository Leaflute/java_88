package test;

// 부모클래스
public class _12_Bank {

	// 멤버변수
	private String bankName;
	private String accountNum;
	private  double rate;
	
	// 기본생성자
	public _12_Bank(){}
	
	// 매개변수 생성자
	public _12_Bank(String bankName, String accountNum, double rate){
		this.bankName = bankName;
		this.accountNum = accountNum;
		this.rate = rate;
	}
	
	// getter() setter()
	public void setBankName(String bankName){
		this.bankName = bankName;
	}
	public String getBankName(){
		return bankName;
	}
	public void setAccountNum(String accountNum){
		this.accountNum = accountNum;
	}
	public String getAccountNum(){
		return accountNum;
	}
	public void setRate(double rate){
		this.rate = rate;
	}
	public double getRate(){
		return rate;
	}
	
	// printInfo()
	public void printInfo(){
		System.out.println("은행명: " + bankName + "\n계좌번호: " + accountNum + "\n이자율: " + rate);
	}
	
	




}