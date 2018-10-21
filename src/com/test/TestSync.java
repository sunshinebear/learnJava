package com.test;

import sun.nio.ch.ThreadPool;

public class TestSync {
    private int i =0;

    private void runThread(){
        ChildThread t1= new ChildThread("t1");
        t1.run();
        ChildThread t2= new ChildThread("t2");
        t2.run();
        ChildThread t3= new ChildThread("t3");
        t3.run();
        ChildThread t4= new ChildThread("t4");
        t4.run();
        ChildThread t5= new ChildThread("t5");
        t5.run();
    }


    public static void main(String[] args){
        TestSync ts = new TestSync();
        ts.runThread();

    }

    class ChildThread implements Runnable{
        String name;
        synchronized void addI(){
            i++;
            i++;
            i++;
            i++;
            System.out.println(this.name + ":"+i);
            i++;
            i++;
            i++;
            i++;
        }
        ChildThread(String name){
            this.name = name;
        }

        @Override
        public void run() {
            addI();
        }
    }

}
