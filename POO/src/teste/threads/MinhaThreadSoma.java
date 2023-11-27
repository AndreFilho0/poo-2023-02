package teste.threads;

public class MinhaThreadSoma implements Runnable {
    private String nome;
    private int[] nums;
    private static Calculadora cal = new Calculadora();

    public MinhaThreadSoma(String nome, int[] nums) {
        this.nome = nome;
        this.nums = nums;
        new Thread(this,nome).start();
    }

    @Override
    public void run() {
        System.out.println("iniciada: "+this.nome);
        int soma = cal.somaArray(this.nums);
        System.out.println("terminou: "+this.nome+" resultado: --"+soma);
    }
}
