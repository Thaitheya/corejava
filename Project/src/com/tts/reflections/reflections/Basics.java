package com.tts.reflections.reflections;

import java.lang.reflect.Constructor;

import javax.lang.model.element.Name;

public class Basics {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        // Class dogClass = dog.class;

        // System.out.println(dogClass.getName());
        // System.out.println(dogClass.getSimpleName());

          dog Dog = new dog("Bob", 6);
          Class dogClass = Dog.getClass();

          System.out.println(dogClass.getName());
          System.out.println(dogClass.isInterface());
        Constructor[] constructors = dogClass.getConstructors();
        for(Constructor constructor: constructors){
            System.out.println(constructor.getName());
        }
    }
}
