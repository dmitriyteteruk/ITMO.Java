package org.lesson14;

public class NameShow {

}

class CallMe{
    void call (String msg){
        System.out.println("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable{
    String msg;
    CallMe target;
    Thread t;

    public Caller(CallMe targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run(){
        synchronized (target){
            target.call(msg);
        }
    }
}

class Synch1{
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller ob1 = new Caller(target, "Один");
        Caller ob2 = new Caller(target, "Два");

        try {
            ob1.t.join();
            ob2.t.join();

        }catch (InterruptedException e){
            System.out.println("Прервано");
        }
    }
}