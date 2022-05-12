package com.chainsys.Arrays;

public class Dimension {
    

	public static void creatingTwoDintArray() {
    	int twod[][] = new int [4][5];
    	int rowIndex, colIndex = 0;
    	int data = 0;
    	for(rowIndex=0;colIndex<4;colIndex++) {
    		for(colIndex = 0; colIndex<5;colIndex++) {
    			twod[rowIndex][colIndex] = data;
    			data++;
    			
    		}
    	}
    	for(rowIndex = 0; rowIndex<4;rowIndex++) {
    		for(colIndex= 0;colIndex<5;colIndex++) {
    			System.out.println(twod[rowIndex][colIndex]);
    		}
    		System.out.println();
    	}
    }
	public static void calculateTotalAndAverage() {
		int marks[][] = new int[][] {
			{83,42,24,54,51,0},
			{84,49,53,12,82,0},
			{85,10,91,92,93,0},
			{75,64,23,12,13,0},
			{85,45,72,12,4,0}};
			int rowIndex, colIndex, sum = 0,avg = 0;
			int data = 0;
			for(rowIndex = 0; rowIndex < 5; rowIndex++) {
				for(colIndex = 0;colIndex < 7; colIndex++) {
					sum += marks[rowIndex][colIndex];
				}
				marks[rowIndex][5] = sum;
				marks[colIndex][5] = sum/5;
		    }
			int subjectNo = 1;
			for(subjectNo = 1;subjectNo<=5;subjectNo++) {
				System.out.println("Sub" + (subjectNo) + "-");
			}
			System.out.println("Total -");
			System.out.println("AVG");
			System.out.println("-----------------------------");
			String output = " ";
			for(rowIndex = 0; rowIndex <5;rowIndex++) {
				for(colIndex = 0; colIndex<7;colIndex++) {
					int mark = marks[rowIndex][colIndex];
					if(mark < 100)
					{
						output = String.format("0%d -", mark);
					}
					else 
						output = String.format("%d -", mark);
					System.out.print(output);
					
				}
				System.out.println();
			}
	}
	
	public static void fewOtherWaysOfCreatingTwoDinArray() {
		int[]a[] = new int[4][4];// col for all the rows are equal
		int a1[][] = new int [4][4];
//		int a2[][] = new int [][4]; Wrong
		int []a3[] = new int[4][];//Uneven 2DArrays - the col for all the rows are equal
		int[][] a4 = new int [4][4];//col for all the rows  are equal
		int [] i [] = {{1,2},{3,4},{5,6}};//col for all the rows are equal
		int k[][] = new int [][] {{1,2,3},{4,5,6}};//col for all the rows are equal
		
		}
		
		
	public static void unevenTwoArray() {
		int uneventword[][] = new int [4][];
		 uneventword[0] = new int [1];
		 uneventword[1] = new int [4];
		 uneventword[2] = new int [3];
		 uneventword[3] = new int [2];
		 int rowIndex,colIndex,rowlength = 0,data = 100;
		 for(rowIndex = 0;rowIndex <5;rowIndex++) {
			 rowlength = uneventword[rowIndex].length;
			 for(colIndex = 0;colIndex < rowlength;colIndex++) {
				 uneventword[rowIndex][colIndex] = data;
				 data++;
			 }
		 }
		 for(rowIndex = 0; rowIndex < 4;rowIndex++) {
			 rowlength = uneventword[rowIndex].length;
			 for(colIndex = 0;colIndex <rowlength;colIndex++) {
				 System.out.println(uneventword[rowIndex][colIndex]+ " ");
			 }
			 System.out.println();
		 }
		 
		
	}
	}

