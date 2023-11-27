package teste.threads;

public class MinhaThread extends Thread{
    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo= tempo;
        start();
    }


    public void run(){
        System.out.println("executando a thread: "+nome);
        try{
            for (int i =0;i<10;i++){
                System.out.println("executando a thread: "+nome);
                sleep(tempo);
            }}catch (InterruptedException e) {
            System.out.printf(e.getMessage());
            }
        }

    }


