package exe13;

public class Livro {
		public String titulo;
		private String autor;
		private int ano;
		private String editora;
		
		public Livro(String titulo, String autor , int ano , String editora){
			this.titulo=titulo;
			this.autor=autor;
			this.ano=ano;
			this.editora=editora;
					
			
		}
		public String toString() {
			return "livro : " + titulo + "\nautor: " + autor + "\nano: " + ano + "\neditora: " + editora ;
		}
		void setTitulo(String novoTitulo){
			titulo=novoTitulo;
		}
		void setAutor1(String novoAutor){
			titulo=novoAutor;
	}
		void setAno(int novoAno){
			ano=novoAno;
		
		}
		void setEditora(String novaEditora) {
			editora=novaEditora;
		}
		
		String getTitulo() {
			return titulo;
		}
		String getAutor() {
			return autor ;
		}
		int getAno() {
			return ano;
		}
		String getEditora() {
			return editora;
		}
}


