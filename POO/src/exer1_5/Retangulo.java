package exer1_5;

public class Retangulo extends FormaGeometrica{
	private double largura ;
	

	public Retangulo(double largura) {
		super();
		this.largura = largura;
	}


	@Override
	public double calcularArea() {
		
		return largura*largura;
	}

}
