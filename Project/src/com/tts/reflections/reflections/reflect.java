package com.tts.reflections.reflections;

import java.lang.reflect.Constructor;

class reflect {
    public reflect(){

    }

    public reflect(int age,String name){

    }

    class Main{
        public static void main(String[] args) {
            reflect r1 = new reflect();
            Class obj = r1.getClass();


            Constructor[] constructors = obj.getDeclaredConstructors();

            for (Constructor constructor : constructors) {
                  System.out.println(constructor.getName());

                  int modifier = constructor.getModifiers();

                  String mod = java.lang.reflect.Modifier.toString(modifier);

                  System.out.println(mod);

                  System.out.println(constructor.getParameterCount());
            }
        }
    }
}
