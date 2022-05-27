package com.tts.reflections;

public class RefDemo {
    public RefDemo(String string, int i) {
    }

    public static void main(String[] args) {
        RefDemo r = new RefDemo("Thaitheyasudan", 6000);
        Class cls = r.getClass();

        System.out.println(cls.getName());

        System.out.println(r);
    }
}
        