package exe1_4;

public class TesteAnimal {

	public static void main(String[] args) {
		Boi b1 = new Boi();
		Cachorro c1 = new Cachorro();
		Sapo s1 = new Sapo();
		
		Animal[] animais = new Animal[3];
		
		animais[0]=b1;
		animais[1]=c1;
		animais[2]=s1;
		
		for (int i=0;i<animais.length;i++) {
			System.out.println(animais[i].som());
		}
		
		
	}

}
