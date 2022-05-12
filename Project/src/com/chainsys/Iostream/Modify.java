package com.chainsys.Iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Modify {
	public static void modifyDataInFile() throws IOException

	   {

	            FileOutputStream file = new FileOutputStream("C:\\JavaPorjects\\records.txt");

	            String modify = "Madurai.";

	            byte[] b = modify.getBytes();

	            file.write(b);

	            file.close();

	            System.out.println("Modification Complete");

	            FileInputStream file1 = new FileInputStream("C:\\JavaPorjects\\records.txt");

	            int i;

	            while((i=file1.read())!=-1)

	            {

	            System.out.print((char)i);

	            }

	            file1.close();

	      
	   }}
