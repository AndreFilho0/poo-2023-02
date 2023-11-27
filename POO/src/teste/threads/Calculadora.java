package teste.threads;

public class Calculadora {
    private int soma;
    public synchronized int somaArray(int[] array){
        soma=0;
        for (int i=0;i<array.length;i++){
            soma+=array[i];

            System.out.println("Executando a soma pelo: "+Thread.currentThread().getName());
            System.out.println("somando o valor: "+array[i]+"com o total de: "+soma);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }return soma;
    }

}
