package exer1_5;

public class Circulo extends FormaGeometrica {
	private double raio;
	
	

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}



	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return  Math.PI * raio * raio;
	}

}
