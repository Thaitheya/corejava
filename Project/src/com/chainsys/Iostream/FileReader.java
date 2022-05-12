package com.chainsys.Iostream;
import java.io.FileInputStream;
import java.io.FileNotFoundException; 
import java.io.IOException;
public class FileReader{
public static void main(String args[]) {
int charfromfile;
FileInputStream fin=null;
String fname="d:\\temp\\JavaProjects.txt";
try {
fin = new FileInputStream (fname);
}
catch (FileNotFoundException e) {
System.out.println("File Not Found"); 
return;
}
try
{
	System.out.println("IsData Available "+fin.available());
}
	catch (IOException e) {
	System.out.println("File is Closed " + e.getMessage());
}
finally {
	try {
		if(null!=fin) {
			fin.close();
		}
	}
		catch(IOException e1) {
			System.out.println(e1.getMessage());
		}
	}

}
}