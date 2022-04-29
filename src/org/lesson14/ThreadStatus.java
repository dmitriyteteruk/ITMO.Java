package org.lesson14;

public class ThreadStatus extends Thread {
    @Override
    public void run() {

    }
    public static void main(String[] args) {
            ThreadStatus thread = new ThreadStatus();
            System.out.println("До выполнения: " + thread.getName() + " " + thread.getState());
            thread.start();
            System.out.println("В процессе выполнения: " + thread.getName()+ " " + thread.getState());
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("После выполнения: " + thread.getName()+ " " + thread.getState());
        }
    }