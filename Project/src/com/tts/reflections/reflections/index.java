package com.tts.reflections.reflections;

public class index {
    public static void main(String[] args) {
        try {
            index Index = new index();
            Class<?> obj  = Index.getClass();

            System.out.println(obj.getModifiers());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
