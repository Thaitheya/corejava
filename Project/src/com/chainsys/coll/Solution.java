package com.chainsys.coll;

import java.util.HashMap;
import java.util.Map;

public class Solution {
         public static void findPair(int[] nums, int target) {
        	 Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        	 
        	 for(int i = 0;i < nums.length;i++) {
        		 if(map.containsKey(target-nums[i])) {
        			 System.out.printf("Pair Found (%d,%d)",
        			 nums[map.get(target - nums[i])],nums[i]);
        			 return;
        		 }
        		 map.put(nums[i], i);
        	 }
        	 System.out.println("Pair not found");
         }
         
         public static void main(String[] args) {
			int[] nums = {8,7,2,5,3,1};
			int target = 20;
			findPair(nums, target);
		}
}