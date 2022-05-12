package JDBC;

import java.io.FileInputStream;

public class InputStream {
   public static void main(String[] args) {
	try {
		FileInputStream input = new FileInputStream("C:\\JavaPorjects\\records.txt");
	    System.out.println("Data in the file");	
	    int i = input.read();
	    while(i != -1) {
	    	System.out.print((char)i);
	    	
	    	i = input.read();
	    }
	    
	    input.close();
	}catch(Exception err) {
		err.getStackTrace();
		
	}
}
}
