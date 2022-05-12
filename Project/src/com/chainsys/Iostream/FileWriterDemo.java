package com.chainsys.Iostream;

import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String args[]) throws Exception {
	java.util.Scanner scanner=new java.util.Scanner (System.in);
	String fname=null;
	String source = " ";
	try {
	System.out.println("Enter FileName with full path"); 
	fname = scanner.nextLine();
	source = scanner.nextLine();
	System.out.println("Enter Data");
	} finally {
	scanner.close();
	}
	char buffer[] = new char [source.length ()]; 
	source.getChars (0, source.length(), buffer, 0); 
	FileWriter fw =null;
	try
	{
	fw = new FileWriter (fname);
	for (int i=0; i < buffer.length; i++) {
		
		fw.write(buffer[i]);
		}
		System.out.println("Data Saved");
		} catch (Exception err)
		{
		err.printStackTrace();
		}
		finally
		{
		fw.close();
		}
	}
}
