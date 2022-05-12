package com.chainsys.unittest;
import com.chainsys.variables.Calculator;
/**
 * @author thai3141
 * Date : 25 MAR 2022
 */
public class CalculatorTest {
  
	
	public static void testAdd() {
		Calculator firstObject = new Calculator();
		System.out.println(firstObject.add(12, 23));
	}
	
	public static void testMultiple() {
		Calculator firstObject = new Calculator();
		System.out.println(firstObject.multiple(12, 23));
	}
	public static void testSubtract() {
		Calculator firstObject = new Calculator();
		System.out.println(firstObject.subtract(12, 23));
	}
	public static void testDivide() {
		Calculator firstObject = new Calculator();
		System.out.println(firstObject.divide(12, 23));
	}
}
