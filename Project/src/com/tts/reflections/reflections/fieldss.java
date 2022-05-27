package com.tts.reflections.reflections;

import java.lang.module.ModuleDescriptor.Modifier;
import java.lang.reflect.Field;

public class fieldss {
    private String color;
    
}

class Main{
    public static void main(String[] args)  {
        try{
       fieldss field = new fieldss();

       Class obj = field.getClass();

       Field field2 = obj.getDeclaredField("color");
       
       field2.setAccessible(true);

       field2.set(field, "brown");
       String colorValue = (String)field2.get(field);

       System.out.println(colorValue);

       int  mod2 = field2.getModifiers();
      String modifier2 = Modifier.toString(mod2);
      System.out.println("Modifier: " + modifier2);
    
        }catch(Exception err){
            err.printStackTrace();
        }
    }
}

