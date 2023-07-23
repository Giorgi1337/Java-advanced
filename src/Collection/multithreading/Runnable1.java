package Collection.multithreading;


class Ex5 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable1());
        Thread thread2 = new Ex5();
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("End");
    }
}

public class Runnable1 implements  Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
