package com.chainsys.bank;
/**
 * 
 * @author thai3141
 * Date: 25 March 2022
 */
public class Bank {
      public static int currentBalance;
      public static String customerName;
      public static int customerAccountNumber;
      
	  
	  public   int   deposit(int amount) {	
		 return currentBalance = currentBalance + amount;
		
	  }
	  
	  public int withdraw(int amount) {

		currentBalance = currentBalance - amount;
		 return currentBalance;
	  }
	  
	  public static void openAccount(String name,int accountNumber) {
		   customerName = name;
		   customerAccountNumber = accountNumber;
		
	  }
	  
	  public void  totalBalance() {
		  
		
	  }

	
}
