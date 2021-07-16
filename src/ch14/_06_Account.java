package ch14;

// 계좌정보
public class _06_Account {
	
	// 매개변수
	private String AccountNum;	// 계좌번호
	private String ownerName;	// 예금주 이름
	private int balance;			// 잔액
	
	// 디폴트 생성자
	public _06_Account() {}
	
	// 매개변수 생성자
	public _06_Account(String AccountNum, String ownerName, int balance) {
		this.AccountNum = AccountNum;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// getter setter
	public String getAccountNum() {
		return AccountNum;
	}
	public void setAccountNum(String accountNum) {
		this.AccountNum = accountNum;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 입금
	public void deposit(int amount) {
		balance += amount;
	}
	
	// 인출
	public int withraw(int amount) {
		if (balance < amount) return 0;
		balance -= amount;
		return balance;
	}
}
