package com.chainsys.miniproject.commonutil;

public class ExceptionManager {
      public static String handleException(Exception err,String source, String msg) {
    	    LogManager.logException(err, source,msg);
			String errorPage = HTMLHelper.getHTMLTemplate("ERROR",msg);
			return errorPage;
      }
}
