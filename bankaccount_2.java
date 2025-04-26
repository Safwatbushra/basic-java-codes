package bankaccount;

public class bankaccount_2 {
	private String account_no;
	 private double balance ;
	 public String account_name;
	 private String dob;
	 public  bankaccount_2( String account_name , String account_no,String dob)
	 { 
	this .account_name = account_name;
	 this.account_no=  account_no;
	 this.dob= dob;
	 
	 }
	 public void withdraw (double amount)
	 {
	 balance -= amount;
	 }
	 
	 public void deposit (double amount)
	 {
	 balance += amount;
	 }
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	 
	 
	 

}
