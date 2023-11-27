package teste.threads;

public class Teste2 {
    public static void main(String[] args) {


        MinhaThreadRunnable tt1 = new MinhaThreadRunnable("thred#1", 900);
        Thread t = new Thread(tt1);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        MinhaThreadRunnable tt2 = new MinhaThreadRunnable("thred#2", 1000);
        Thread t2 = new Thread(tt2);
        t2.start();


        MinhaThreadRunnable tt3 = new MinhaThreadRunnable("thred#3", 400);
        Thread t3 = new Thread(tt3);
        t3.start();



    }
}
