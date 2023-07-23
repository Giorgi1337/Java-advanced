package Collection.multithreading;

public class multithreadingEx1  extends  Thread{
    public void run() {
        for (int i =1; i <= 1000; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        multithreadingEx1 thread1 = new multithreadingEx1();
        thread1.start();

//        myThread1 myThread1 = new myThread1();
//        myThread1 myThread2 = new myThread1();
////        myThread2 myThread2 = new myThread2();
//        myThread1.start();
////        myThread2.start();
    }
}

//class myThread1 extends Thread {
//    public void run() {
//        for (int i =1; i <= 1000; i++){
//            System.out.println(i);
//        }
//    }
//}
//
//class myThread2 extends Thread {
//    public void run() {
//        for (int i = 1000; i > 0 ; i--){
//            System.out.println(i);
//        }
//    }
//}
