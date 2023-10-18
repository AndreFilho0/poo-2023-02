package teste;

public class Sapato {
	double valor ;
	String marca;
	int tamanho;
	public Sapato (double valor, String marca , int tamanho){
		this.valor = valor;
		this.marca=marca;
		this.tamanho=tamanho;
	}
	
	public void getInfo() {
		System.out.println("valor= "+ valor+ " marca= " +marca+ " tamanho= "+tamanho);
		
	}

}
