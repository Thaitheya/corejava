package com.chainsys.tomtest;
import com.chainsys.tomtest.*;
public class BankTest {
	
	public void TestUniqueid() {
		CountTheCharacters TestUniqueid = new  CountTheCharacters();
		 System.out.println(CountTheCharacters.getUniqueid());
	 }
	public static void TestCustomerName1(String Customer) {
		CountTheCharacters TestCustomerName = new CountTheCharacters();
		Customer = TestCustomerName.setCustomerName("Thaitheyasudan");
		System.out.println(Customer);
	}
	public static void TestAccountNumber1(long Account) {
		CountTheCharacters TestAccountNumber = new CountTheCharacters();
		Account = (long) TestAccountNumber.setAccountNumber(9342379);
		System.out.println(Account);
	}
	public static void TestAddressNumber(String Address) {
		CountTheCharacters TestAddress = new CountTheCharacters();
		Address = (String) TestAddress.setAddressNumber("17 Dubai main road");
		System.out.println(Address);
	}
	public  BankTest(long number) {
		CountTheCharacters TestCustomerName = new CountTheCharacters();
		number = (long) CountTheCharacters.setPhoneNumber(92873287);
		System.out.println(number);
	}
	public static void TestEMail(String mail) {
		CountTheCharacters TestEmail = new CountTheCharacters();
		 mail = (String) CountTheCharacters.setE_Mail_id("Thaitheyasudan@12131.com");
		System.out.println(mail);
	}
}
