package com.chainsys.reflection;



public class ConstantsUtil {

    public static String getModifierName(int value,Class<?> c1)
   {
	   java.lang.reflect.Field[] flist = c1.getFields();
	   String fieldName="";
	   for (java.lang.reflect.Field f : flist) 
	   {
		   try
 	      {
		   if((int)f.get(null)==value)
			   fieldName=f.getName();
		   break;
 	      } catch (IllegalAccessException e) 
 	      {
 	        e.printStackTrace();
 	      }
	   }
	   return fieldName;
   }
}

