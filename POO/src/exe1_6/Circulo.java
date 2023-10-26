package exe1_6;

public class Circulo extends Figura{
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return  Math.PI * raio * raio;
    }

    @Override
    public double calculaPerimetro() {
        return 2*Math.PI*raio;
    }
}
