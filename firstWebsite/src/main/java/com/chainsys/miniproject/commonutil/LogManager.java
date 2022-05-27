package com.chainsys.miniproject.commonutil;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class LogManager {
     public static void logException(Exception err,String source,String exMessage) {
    	 Calendar vCalendar = Calendar.getInstance();
         String logDate = vCalendar.get(Calendar.DATE )+ "_" +  (vCalendar.get(Calendar.MONTH) +1)+
                 "_" + vCalendar.get(Calendar.YEAR)+ "_"+vCalendar.get( Calendar.MINUTE);
    	 if(source == null) {
    		 source = "Source not provided";
    	 }
    	 if(exMessage == null) {
    		 exMessage = "Custom message not provided";
    	 }
    	 @SuppressWarnings("unused")
		String message= "Exception: " + logDate + " Message:" + err.getMessage();
    	 message += "\n Source: " + source + "CustomMessage: " + exMessage;
    	 String fileName = "ExceptionMessages" + logDate + ".log";
         writeToFile(fileName,message);
     }
     public static void logException(Exception err,String source) {
//    	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH mm");	   
    	 Calendar vCalendar = Calendar.getInstance();
         String logDate = vCalendar.get(Calendar.DATE )+ "_" +  (vCalendar.get(Calendar.MONTH) +1)+
         "_" + vCalendar.get(Calendar.YEAR)+ "_"+vCalendar.get( Calendar.MINUTE);
         String logDateTime = vCalendar.get(Calendar.YEAR)+"_"+(vCalendar.get(Calendar.MONTH) +1)+
                 "_" + vCalendar.get(Calendar.YEAR)+ "_"+vCalendar.get( Calendar.MINUTE);
    	 if(source == null) {
    		 source = "Source not provided";
    	 }
    	 String message= "Exception: " + logDate + " Message:" + err.getMessage();
    	 String fileName = "ExceptionMessages" + logDate + ".log";
         writeToFile(fileName,message);

     }
     private static void writeToFile(String fileName,String message) {
          // TODO 
    	 
    	 fileName = "D://LogManager//" + fileName +".txt" ;
    	 FileWriter filewriter = null;
    	 try {
    		 filewriter = new FileWriter(fileName);
    		 filewriter.write(message);    	 
           }catch(IOException err) {
    	      err.printStackTrace();
           }finally {
        	   try {
				filewriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
           }
}
}
