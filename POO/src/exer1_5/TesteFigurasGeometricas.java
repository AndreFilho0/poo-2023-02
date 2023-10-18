package exer1_5;

public class TesteFigurasGeometricas {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(2);
		Retangulo r1 = new Retangulo(5);
		Triangulo t1 = new Triangulo(5, 5);
		CalculadoraArea somaTotal = new CalculadoraArea();
		
		System.out.println(somaTotal.calcularAreaTotal(c1, r1, t1));
		

	}

}
