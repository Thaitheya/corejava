package com.chainsys.tomtest;
import java.util.*;
public class ManagementSystem {
  
private static final String ID = null;
public static String name;
private static int date_Of_Birth;
private static String bloodGroup;
private static float height;
private static int Mark;

//private static String customerName;
//private static int accountNumber;
//private static String addressNumber;
//private static long phoneNumber;
//private static String e_Mail_id;


//private static final String UniqueId = null;
//public static String customerName;
//public static int  accountNumber;
//public static String addressNumber;
//public static long phoneNumber;
//public static String e_Mail_id;
public static void count() {
	   String s2 = "Tom and jerry are good friends";
	   String[] c = s2.split(" ");
	   int count = c.length;
	   System.out.println(count);
   }
   public static void reverse() {
	   String s3 = "Tom and jerry are good friends";
	   char[] c =  s3.toCharArray();
	   for(int count = c.length-1;count >= 0; count--) {
		    System.out.print(c[count]);
	   }   
   }


   public static  void Equation() {
	   System.out.println("Enter the value of X: ");
	    Scanner se1 = new Scanner(System.in);
	    int X = se1.nextInt();
	    se1.close();
	    int num = 10;
	    for(int i = 5; i < num - i+1; i++) {
	    	int eqns = 2 * 2 + X + 5;
	        System.out.println(eqns);
	    }
   }
   
   public static void answer() {
	  Scanner se = new Scanner(System.in);
	  int user = se.nextInt();
	  se.close();
	  
	  int weather = 50;
	  for(int i = 0 ;i < weather; i++) {
	     if(user == i) {
	    	 System.out.println("Get an Umbrella");
	    	 break;
	     }
	     else if(user == 32){
	    	System.out.println("Bring Heavy Jacket");
	    	break;
	     }
	     for(int j = 0 ;j <=weather;) {
	         if(user >= 32 && user <= 50 ){
	    	   System.out.println("Light jacket");
	    	   break;
	         }
	     }
	  }
   }
 
   public static void alphaName() {
	   Scanner sc=new Scanner(System.in);
       char ch;  
      
       System.out.println("Enter the character ");
       ch=sc.next().charAt(1);
       for(int i =0 ;i<=ch; i++) {
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
       {
            System.out.print(ch+" is an Alphabet ");
            break;
       }
       else
       {
            System.out.print(ch+" is not an Alphabet ");
            break;
       }
       }
   }
   
   public static void Triangle() {
	   int count1 = 0;
       for( count1 = 1; count1<=9;count1++) {
    	   for(int count2 = 9; count2 > count1; count2--) {
    		   System.out.print(".");
    	   }
    	   for(int count3 = count1; count3 >=1; count3--) {
    		   System.out.print(count3);
    	   }
    	   for(int count4 = 2; count4<=count1;count4++) {
    		   System.out.print(count4);
    	   }
    	   System.out.println();
       }
       
   }
//   public static void BankOfficeServices() {
//	  
//   }
//public static String getUniqueid() {
//	return getUniqueid();
//}
//public static String getCustomerName() {
//	return getCustomerName();
//}
//public String getname;
//public String setCustomerName(String customerName) {
//	return CountTheCharacters.customerName = customerName;
//}
//public static long getAccountNumber() {
//	return getAccountNumber();
//}
//public  long setAccountNumber(long i) {
//	CountTheCharacters.accountNumber = (int) i;
//	return i;
//}
//public static String getAddressNumber() {
//	return getAddressNumber();
//}
//public String setAddressNumber(String addressNumber) {
//	return CountTheCharacters.addressNumber = addressNumber;
//}
//public static long getPhoneNumber() {
//	return getPhoneNumber();
//}
//public static long setPhoneNumber(long phoneNumber) {
//	CountTheCharacters.phoneNumber = phoneNumber;
//	return phoneNumber;
//}
//public static String getE_Mail_id() {
//	return getE_Mail_id();
//}
//public static String setE_Mail_id(String e_Mail_id) {
//	return CountTheCharacters.e_Mail_id = e_Mail_id;
//}
//	

public ManagementSystem() {
	
}
public static String getId() {
	return ID;


}
public static String getName() {
	return name;
}
public void setName(String name) {
	ManagementSystem.name = name;
}
public static int getDate_Of_Birth() {
	return date_Of_Birth;
}
public static void setDate_Of_Birth(int date_Of_Birth) {
	ManagementSystem.date_Of_Birth = date_Of_Birth;
}
public static String getBloodGroup() {
	return bloodGroup;
}
public static void setBloodGroup(String bloodGroup) {
	ManagementSystem.bloodGroup = bloodGroup;
}
public static float getHeight() {
	return height;
}
public static void setHeight(float height) {
	ManagementSystem.height = height;
}
public static int getMark() {
	return Mark;
}
public static void setMark(int mark) {
	Mark = mark;
}

}

