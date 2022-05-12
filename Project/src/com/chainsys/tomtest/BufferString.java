package com.chainsys.tomtest;
import java.io.*;
public class BufferString {
    public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Rock");
		str.insert(4, "Roll");
		System.out.println(str);
		
		StringBuilder str1 = new StringBuilder("Rock");
		str1.reverse();
		System.out.println(str1);
		
		StringBuilder str2 = new StringBuilder("water");
	    System.out.println(str2.capacity());
	}
	
}
