package teste.threads;

public class TesteTiqueTaque {
    public static void main(String[] args) {
        TiqueTaque tt = new TiqueTaque();
        ThreadTiqueTaque tique = new ThreadTiqueTaque("tique",tt);
        ThreadTiqueTaque taque = new ThreadTiqueTaque("taque",tt);

        try {
            tique.t.join();
            taque.t.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
