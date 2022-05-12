package com.chainsys.Oops;

public class Phone {
  public void makeACall() {
	  System.out.println("Call made...");
	  
  }
  public final void sendSMS() {
	 System.out.println("SMS send..."); 
  }
  
}

class Nokia extends Phone{

	public void makeCall() {
		System.out.println("Call made from Nokia");
	}

////	public void sendSMS() {
//		System.out.println("send SMS");
//	}
}
