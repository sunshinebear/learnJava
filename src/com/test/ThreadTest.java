package com.test;


class Logger {
    static void info(String a){
        System.out.println(a);
    }
}

class UrlThread implements Runnable{
    private String name;
    UrlThread(String a){
        this.name = a;
    }
    public void run(){
        Logger.info("run:"+this.name);
    }
}
public class ThreadTest {
    public static  void main(String[] args){
        UrlThread ut = new UrlThread("1");
        UrlThread ut1 = new UrlThread("2");
        UrlThread ut2 = new UrlThread("3");
        ut.run();
        ut1.run();
        ut2.run();
        Logger.info("here");
    }
}
