package com.chainsys.tomtest;
import java.util.*;
public class Banking {
     private String accno;
     private String name;
     private String acc_type;
     private long balance;
     Scanner sc = new Scanner(System.in);
     public void openAccount() {
    	 System.out.println("Enter the Account no: ");
    	 accno = sc.next();
    	 System.out.println("Enter the Account Type: ");
    	 acc_type = sc.next();
    	 System.out.println("Enter the Name: ");
    	 name = sc.next();
    	 System.out.println("Enter the Balanace: ");
    	 balance = sc.nextLong();
     }
     public void showAccount() {
    	 System.out.println("Name of the account holder: " + name);
    	 System.out.println("Account no: " + accno);
    	 System.out.println("Account Type: " + acc_type);
    	 System.out.println("Balance: " + balance);
     }
     public void deposit() {
    	 long amt;
    	 System.out.println("Enter the amount you want to deposit: ");
    	 amt = sc.nextLong();
    	 balance = balance + amt; 
     }
     public void withdrawal() {
    	 long amt;
    	 System.out.println("Enter the amount you have to withdraw");
    	 amt = sc.nextLong();
    	 if(balance >= amt) {
    		 balance = balance - amt;
    		 System.out.println("Balance After Withdrawal: "+ balance);
    	 }
    	else {
    		 System.out.println("Your balance is less than" + amt + "Transaction Failed");   			 
    		 }
     }
    	 public boolean search(String ac_no) {
    		 if(accno.equals(ac_no)) {
    			 showAccount();
    			 return (true);
    		 }
    		 return (false);
    	 
    	 
         
    	 
