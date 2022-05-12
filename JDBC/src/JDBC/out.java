package JDBC;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class out {
    public static void main(String[] args) {
			String data = "I am good programmer in the world!!";
			
			try {
				OutputStream outs = new FileOutputStream("C:\\JavaPorjects\\records.txt");
				byte[] dataBytes = data.getBytes();
				
				outs.write(dataBytes);
				System.out.println("Data is written to the file");
				
				outs.close();
			}catch(Exception err) {
				err.printStackTrace();
			}
	}
}
