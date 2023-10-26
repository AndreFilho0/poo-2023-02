package exe1_6;

public class Quadrado extends Figura implements Desenho{
    private double lado;

    public Quadrado() {
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado*lado;
    }

    @Override
    public double calculaPerimetro() {
        return 4*lado;
    }


    public String desenhar() {
        return "desenhando a figura quadrado";
    }
}
