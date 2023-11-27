package teste.threads;

public class TiqueTaque {
    boolean tique;

    synchronized void tique(boolean estaExecutando){
        if(!estaExecutando){
            tique=true;
            notify();
            return;

        }
        System.out.print("tique ");
        tique=true;

        notify();

        while (tique){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }


    synchronized void taque(boolean estaExecutando){
        if(!estaExecutando){
            tique=false;
            notify();
            return;

        }
        System.out.print("taque ");
        tique=false;

        notify();

        while (!tique){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
