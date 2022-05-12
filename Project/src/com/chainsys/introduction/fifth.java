package com.chainsys.introduction;

public class fifth {
    public static void main(String[] args) {
    	
    	
    	
    	printTriangleC();
    	
    }
    public static void numberOneToHundred() {
    	int count  = 0;
    	for(count = 0; count <= 100; count++) {
    		System.out.println(count + " ");
    	}
    }
    public static void numberHundredToOne() {
    	int count = 10;
    	for(count = 10; count >= 1; count--) {
    		System.out.println(count + " ");
    	}
    	
    }
    public static void printMatrix() {
    	int countA = 0;
    	for( countA = 1;countA<=10;countA++) {
    		for(int countB = 11;countB<=20;countB++) {
    			System.out.println(countA + " ");
    			
    		}
    		System.out.println();
    	}
    }
    public static void printTriangleA() {
    	int countA = 0;
    	for(countA =10;countA > 1;countA--) {
    		for(int countB = 1;countB < countA;countB++) {
    			System.out.print("." + " ");
    			
    		}
//    		for(int countC = 1;countC<=countA;countC++) {
//    			System.out.print(countC + " ");
//    		}
    		System.out.println();
    	}
    
    }
    public static void printTriangleB() {
    	int countA = 0;
    	for(countA =1;countA<=10;countA++) {
    		for(int countB = 1;countB < countA;countB++) {
    			System.out.print(".");
    			
    		}
    		for(int countC = 10;countC>=countA;countC--) {
    			System.out.print(countC);
    		}
    		System.out.println();
    	}
    
    }
  
    
    
    
    
    
    
    public static void printTriangleC() {
    	
       int countA = 0;
       for( countA = 1; countA<=9;countA++) {
    	   for(int countB = 9; countB > countA; countB--) {
    		   System.out.print(" ");
    	   }
    	   for(int countC = countA; countC >=1; countC--) {
    		   System.out.print("-" + countC + "-");
    	   }
    	   for(int countD = 2; countD<=countA;countD++) {
    		   System.out.print("-" + countD + "-");
    	   }
    	   System.out.println();
       }
       for(int countE = 8; countE >=1; countE--) {
    	   
    	   for(int countF = 9; countF > countE; countF--) {
    		   System.out.print(" ");
    	   }
    	   for(int countH = countE;countH >= 1; countH--) {
    		   System.out.print("-" +countH + "-");
    	   }
    	   for(int countG = 2;countG <=countE;countG++) {
    		   System.out.print("-" + countG + "-");
    	   }
    	   
    	   System.out.println();
       }
       
       
    	
    }
    
    
}
	
