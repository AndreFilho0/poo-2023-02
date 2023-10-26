package exe1_6;

public class Retangulo extends Quadrado implements Desenho{
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

    @Override
    public String desenhar(){
        return "desenhando a figura retangulo";
    }
}
