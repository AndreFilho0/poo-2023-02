package exe13;

public class TesteLivro {

	public static void main(String[] args) {
		
        Livro l1 = new Livro("É a ales","Jon Fonseca",2023,"literatura mundial");
		
		Livro l2= new Livro ("a biblioteca da meia noite","Matt Haig",2021,"Bertrand");
		
		Livro l3 = new Livro ("imperfeito","Christiana Lauren",2022,"Foro editora");
		
		System.out.println(l1.toString());
		System.out.println();
		System.out.println(l2.toString());
		System.out.println();
		System.out.println(l3.toString());
	}

	}


