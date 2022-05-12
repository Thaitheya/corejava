package com.chainsys.variables;
/***
 * @author thai3141
 * created on : 25 march 2022
 */
public class Calculator {
/**
 * Add method: Will take 2  values using the following parameters and 
 * will add the values.The result of totaling will be returned back to the caller.
 * This is a static method object reference is not required.
 * 
 * @param param1 of type int 
 * @param param2 of type int 
 * @return type in 
 */
	public int add(int param1, int param2) {
		
		int result = param1 + param2;
		return result;
		
	}
	/**
	 * Multiple method: Will take 2  values using the following parameters and 
	 * will add the values.The result of totaling will be returned back to the caller.
	 * This is a static method object reference is not required.
	 * 
	 * @param param1 of type int 
	 * @param param2 of type int 
	 * @return type in 
	 */
	public  int multiple(int param1, int param2) {
		int result = param1 * param2;
		
		return result;
		
	}
	/**
	 * Divide method: Will take 2  values using the following parameters and 
	 * will add the values.The result of totaling will be returned back to the caller.
	 * This is a static method object reference is not required.
	 * 
	 * @param param1 of type int 
	 * @param param2 of type int 
	 * @return type in 
	 */
	public static  int divide(int param1, int param2) {
		int result = param1 / param2;
		return result;
	}
	/**
	 * Subtract method: Will take 2  values using the following parameters and 
	 * will add the values.The result of totaling will be returned back to the caller.
	 * This is a static method object reference is not required.
	 * 
	 * @param param1 of type int 
	 * @param param2 of type int 
	 * @return type in 
	 */
	public int subtract(int param1, int param2) {
		int result = param1 - param2;
		return result;
	}
}
