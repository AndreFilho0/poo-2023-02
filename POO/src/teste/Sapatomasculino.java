package teste;

public class Sapatomasculino extends Sapato {
	String nomeSapato;
	
	public Sapatomasculino(double valor, String marca , int tamanho, String nomeSapato) {
		super(valor,marca,tamanho);
		this.nomeSapato=nomeSapato;
	}
public void getInfo() {
	super.getInfo();
	
	System.out.println("nome do sapato: " + nomeSapato);
}
}

