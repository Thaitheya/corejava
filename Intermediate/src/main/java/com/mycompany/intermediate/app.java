package com.mycompany.intermediate;



class  myTask extends Thread{

    public void executeTask() {
        for(int i = 0;i < 10; i++){
        System.out.println("run this 2" + i);
        }
    }
   
 }
public class app{
    

    public static void main(String[] args) {
        System.out.println("--Application Started--");
        myTask task = new myTask();

        task.executeTask();

        for (int i2 = 0; i2<=10; i2++) {
            System.out.println("run this 1" + i2);
        }





        System.out.println("--Application is Stopped--");
    }
}