public class thread1  implements   Runnable{
    public static void main(String[] args) {
        thread1 th  = new thread1();
       Thread t = new Thread(th);

        t.start();
        t.setDaemon(true);
    }

    @Override
    public void run() {
        System.out.println("thread sayin hi!");
    }
}

