package oopsConcepts;

public class Account {
	
	private long accountNum;
	private String type;
	private String bankName;
	private float balance;
	public Account(long accountNum, String type, String bankName, float balance) {
		super();
		this.accountNum = accountNum;
		this.type = type;
		this.bankName = bankName;
		this.balance = balance;
	}
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNum=" + accountNum + ", type=" + type + ", bankName=" + bankName + ", balance="
				+ balance + "]";
	}
	
	public String getData(long number, float balance) {
		if(this.accountNum == number) {
			return this.accountNum+ " : " +this.balance;
		}
		
		else {
			return "Account number does not exist";
		}
		
	}
	
	public String getData(String str) {
		return this.bankName;
	}

}
