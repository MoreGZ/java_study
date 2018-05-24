package java_study;

import  java.lang.*;
public class Thread1 {
    public static void main(String[] args) {
//        try{
//            Thread.sleep(1000);
//        }catch (InterruptedException ex){
////            throw ex;
//        }

        RunnableDemo run1 = new RunnableDemo("thread1");
        run1.start();

        RunnableDemo run2 = new RunnableDemo("thread2");
        run2.start();
    }
}

class RunnableDemo extends Thread{
    private Thread t;
    private String threadName;

    public RunnableDemo(String name){
        this.threadName = name;
        System.out.println("Create "+threadName);
    }

    public void run(){
        System.out.println("Running " +  threadName );
        try{
            for(int i=0;i<5;i++){
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException ex){
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start(){
        System.out.println("Start "+threadName);
        if(t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}

class RunnableDemo1 implements Runnable{
    private Thread t;
    private String threadName;

    public RunnableDemo1(String name){
        this.threadName = name;
        System.out.println("Create "+threadName);
    }

    public void run(){
        System.out.println("Running " +  threadName );
        try{
            for(int i=0;i<5;i++){
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException ex){
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start(){
        System.out.println("Start "+threadName);
        if(t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}