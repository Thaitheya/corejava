package com.tts.reflections.reflections;

import java.lang.reflect.Field;



 class fields {
  private String type;

}

class Main{
    public static void main(String[] args) {
        try {
            fields f1 = new fields();

            Class obj  = f1.getClass();

            Field field1 = obj.getField("type");

            field1.set(f1, " labrator");

            String typeValue = (String)field1.get(f1);
            System.out.println("Value" + typeValue);

            int mode = field1.getModifiers();

            System.out.println(mode);
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
}
