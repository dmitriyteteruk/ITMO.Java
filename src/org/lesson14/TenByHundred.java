package org.lesson14;

public class TenByHundred {
    public static void main(String[] args) {

        // запускаем десять потоков - задача 1
        new NewThread("Один");
        new NewThread("Два");
        new NewThread("Три");
        new NewThread("Четыре");
        new NewThread("Пять");
        new NewThread("Шесть");
        new NewThread("Семь");
        new NewThread("Восемь");
        new NewThread("Девять");
        new NewThread("Десять");
        }
    }

class NewThread implements Runnable{
    String name;
    Thread t;

    NewThread(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start();
    }

    @Override
    public void run() {
        // в каждом потоке печатаем числа от 0 до 99
        for(int i = 0; i < 100; i++){
            System.out.println(i);
        }
    }
}
