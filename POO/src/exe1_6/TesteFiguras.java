package exe1_6;

import exer1_5.FormaGeometrica;

public class TesteFiguras {
    public static void main(String[] args) {
        double soma=0;
        Circulo c1 = new Circulo(3);
        Triangulo t1 = new Triangulo(1,2,3,4);
        Quadrado q1 = new Quadrado(2);
        Retangulo r1 = new Retangulo(2,3);

        System.out.println("area do circulo :" + c1.calculaArea());
        System.out.println("perimetro total do circulo :" + c1.calculaPerimetro());


        System.out.println("area do triangulo: " + t1.calculaArea());
        System.out.println("perimetro do triangulo: " + t1.calculaPerimetro());

        System.out.println("area do quadrado : " + q1.calculaArea() );
        System.out.println("perimetro do quadrado: " + q1.calculaPerimetro());

        System.out.println("area do retangulo: " + r1.calculaArea());
        System.out.println("perimetro do retangulo: "+ r1.calculaPerimetro());

        Figura[] areas = new Figura[4];

        areas[0]=c1;
        areas[1]=r1;
        areas[2]=t1;

        for (int i =0 ; i< areas.length;i++ ) {
            soma+= areas[i].calculaArea();
        }

        System.out.println("a soma é : "+soma);







    }
}
