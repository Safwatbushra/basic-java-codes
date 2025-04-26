package bankaccount;

public class main_bankacc_2 {

	public static void main(String[] args) {
		
		bankaccount_2 bankacc =new bankaccount_2("mickey mouse", "Acc-1121068", " 11 october 1837");
		System.out.println("\nAccount Name: "+ bankacc.getAccount_name()+ "\nAccount number : " + bankacc.getAccount_no()+ "\n"+ "date of birth:"+ bankacc.getDob() +"\n" 	);
		bankacc.deposit(300);
		bankacc.withdraw(200);
		bankacc.deposit(10000);
		System.out.println(" new balance : " + bankacc.getBalance());
	

}
}