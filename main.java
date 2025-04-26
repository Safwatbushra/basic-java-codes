package bankaccount;

public class main {

	public static void main(String[] args) {
		bankacc account = new bankacc();
		account.setAccount_no("acc-1068");
		account.setBalance(5000000);
		System.out.println("Account number : " + account.getAccount_no()+ "\n"+ 
		"balance: " + account.getBalance());
		

	}

}
