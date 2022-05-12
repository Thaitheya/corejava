package JDBC;

import java.io.FileInputStream;
import java.io.InputStream;

public class Iostreams {
   public static void main(String[] args) {
       byte[] array = new byte[100];
       try {
    	   InputStream input = new FileInputStream("C:\\JavaPorjects\\records.txt");
    	   System.out.println(input.available());
    	   input.read(array);
    	   System.out.println("Data read from the file:");
    	   String data = new String(array);
    	   System.out.println(data);
    	   input.close();
    	   
       }catch(Exception err) {
    	   err.getStackTrace();
       }
   }
}
