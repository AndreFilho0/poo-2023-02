package teste.threads;

public class ThreadTiqueTaque  implements Runnable {
    TiqueTaque tt;
    Thread t;

    final int num = 5;

    public ThreadTiqueTaque(String nome,TiqueTaque tt){
        this.tt = tt;
        t=new Thread(this,nome);
        t.start();

    }



    @Override
    public void run() {
        if(t.getName().equalsIgnoreCase("tique")){
            for (int i =0;i<num;i++){
                tt.tique(true);

            }tt.tique(false);

        }else {
            for (int i =0;i<num;i++){
                tt.taque(true);

            }tt.taque(false);

        }

    }


}
