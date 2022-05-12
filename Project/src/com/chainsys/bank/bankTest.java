package com.chainsys.bank;

/**
 * @author thai3141
 * Date: 24 March 2022
 */
public class bankTest {
       
	public static void testDeposit() {
		
	     Bank TestDesposit = new Bank();
	     System.out.println("Deposit Amount: " +TestDesposit.deposit(10000));
	}
	public static void testWithdraw() {
		Bank TestWithdraw = new Bank();
		System.out.println("Withdraw Amount: " + TestWithdraw.withdraw(1000));
	}
	
    public static  void  testOpenAccount() {
        Bank.openAccount("Thaitheyasudan", 121823);
       System.out.println("CustomerName: " + Bank.customerName);
       System.out.println("CustomerAccountNumber: " + Bank.customerAccountNumber);
    }
	
}
