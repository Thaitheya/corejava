package com.chainsys.Arrays;

public class ArraySolutions {
   public static void  findSumandAverageOfAFloatArray(float[] nums) {
	   double result = nums[0];
	   int count =nums.length;
	   for(int I = 1;I < count;I++) {
		   if(result < nums[I])
		      result = nums[I];
	   }
	   System.out.println("The largest No is: " + result);
   }
   public static void bubblesort() {
	   int[] nos = {11,23,4,56,43,42,332,76,8,54,56};
	   System.out.println("Original Values Before: ");
	   for(int index = 0; index < nos.length;index++) {
		   System.out.println(nos[index] + ",");
	   
	   }
	   System.out.println();
	   int count = nos.length;
	   int temp =0;
	   for(int i = 0; i < count;i++) {
		   for(int j = 0; j < (count -1); j++) {
			   if(nos[j+ 1] < nos[j]) {
				   temp = nos[j];
				   nos[j] = nos[j+ 1];
				   nos[j +1] = temp;
				   temp = 0;
			   }
		   }
	   }
	   System.out.println("Values after Sort");
	   for(int index1 = 0 ; index1 < nos.length;index1++) {
		   System.out.println(nos[index1] + ",");
	   }
   }
}
