package exe13;

import livros.livro;

public class TesteLivro {

	public static void main(String[] args) {
		livro l1 = new livro("É a ales","Jon Fonseca",23,"literatura mundial");
		
		livro l2= new livro ("a biblioteca da meia noite","Matt Haig",2021,"Bertrand");
		
		livro l3 = new livro ("imperfeito","Christiana Lauren",2022,"Foro editora");
		
		System.out.println(l1.toString());
		System.out.println();
		System.out.println(l2.toString());
		System.out.println();
		System.out.println(l3.toString());
	}

}
