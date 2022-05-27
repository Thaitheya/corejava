package com.tts.reflections.reflections;

public class dog {
  private String name;
  private int age;


  public  dog(){
      this.name = "Bob";
      this.age = 6;

  }
  public dog(String name, int age){
    this.name = name;
    this.age = age;
  }
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
  
  
}