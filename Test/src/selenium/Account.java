package selenium;

public class Account {
	
	
	   private long acctNumber;
	   private double balance;
	   private String name;
	
	   public Account (String owner, long accountNum, double initial)
	   {
	      this.name = owner;
	      this.acctNumber = accountNum;
	      this.balance = initial;
	   } 
	 
	
	   public double deposit (double amount)
	   {
	      this.balance = this.balance + amount;
	 
	      return this.balance;
	   } 
	 

	   public double withdraw (double amount, double fee)
	   {
	      this.balance = this.balance - amount - fee;
	 
	      return this.balance;
	   } 
	 
	
	   public double addInterest ()
	   {
	      this.balance += (this.balance * RATE);
	 
	      return this.balance;
	   }
	 
	   public double getBalance ()
	   {
	      return this.balance;
	   

	   }  
	 
}



