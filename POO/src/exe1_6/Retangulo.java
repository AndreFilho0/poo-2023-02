package exe1_6;

public class Retangulo extends Quadrado{
    private double altura;

    public Retangulo(){

    }

    public Retangulo(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return getLado()*altura;
    }

    @Override
    public double calculaPerimetro() {
        return (2*getLado()+2*altura);
    }


}
