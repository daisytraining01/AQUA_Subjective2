package selenium;

public class fundtransfer {
	
	public class Transactions
	{
	
	   public static void main (String[] args)
	   {
	      Account acct1 = new Account ("labuser", 72354, 102.56);
	      
	      acct1.deposit (25.85);
	 
	      double smithBalance = acct2.deposit (500.00);
	      System.out.println ("labuser balance after deposit: " +
	                          smithBalance);
	 
	      System.out.println ("labuser balance after withdrawal: " + 
	                          acct2.withdraw (430.75, 1.50));
	 
	      acct1.addInterest();
	      acct2.addInterest();
	      
	      System.out.println ();
	      System.out.println (acct1);
	      
	   }
	}

}
