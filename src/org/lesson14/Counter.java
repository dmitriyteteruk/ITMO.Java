package org.lesson14;

public class Counter {

    int count = 0;

    public void increment() {
        count = count + 1;
    }
    public int getCount() {
        return count;
    }
}

class ThreadWithCounter extends Thread {
    Counter counter;
    public ThreadWithCounter(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();}
    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            ThreadWithCounter thread = new ThreadWithCounter(counter);
            thread.start();
            try {
                thread.join();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Count равен: " + counter.getCount());
    }



}
