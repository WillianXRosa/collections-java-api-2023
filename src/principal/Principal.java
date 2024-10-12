package principal;

import operacoesbasicas.CatalogoLivros;
import operacoesbasicas.ListaTarefa;

public class Principal {

	public static void main(String[] args) {		
		
		/**Teste da lista de tarefas**/
		/**Instanciando a classe lista de tarefas**/
		/*ListaTarefa listaTarefa = new ListaTarefa();		
		
		System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefa());
		
		listaTarefa.adcionarTarefa("Tarefa1");
		listaTarefa.adcionarTarefa("Tarefa1");
		listaTarefa.adcionarTarefa("Tarefa2");
		listaTarefa.adcionarTarefa("Tarefa3");
		listaTarefa.adcionarTarefa("Tarefa4");		
		System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefa());
		
		listaTarefa.removerTarefa("Tarefa3");
		System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefa());
		
		listaTarefa.obterDescricaoTarefas();*/
		
		
		/**Teste do Catálogo de Livros**/
		/**Book Catalog Test**/
		
		/**Instanciando a classe catalogo de livros**/
		/**Instantiating the book catalog class**/
		
		CatalogoLivros objCatalogoLivros = new CatalogoLivros();
		
		/**Adicionando a livros**/
		/**Adding to books**/
		objCatalogoLivros.adicionarLivro("Livro1", "Autor1", 1990);
		objCatalogoLivros.adicionarLivro("Livro1", "Autor2", 1997);
		objCatalogoLivros.adicionarLivro("Livro2", "Autor2", 2000);
		objCatalogoLivros.adicionarLivro("Livro3", "Autor3", 1971);
		objCatalogoLivros.adicionarLivro("Livro4", "Autor4", 2023);
		objCatalogoLivros.adicionarLivro("Livro5", "Autor4", 2017);
		objCatalogoLivros.adicionarLivro("Livro6", "Autor6", 2013);
		
		/**Pesquisar livros por autor**/
		/**Searching for books by author**/
		System.out.println(objCatalogoLivros.pesquisarPorAutor("Autor4"));
		
		/**Pesquisar por intervalo de ano**/
		/**Searching by year range**/
		System.out.println(objCatalogoLivros.pesquisarPorIntervaloDeAno(1971, 1997));
		
		/**Pesquisar por título**/
		/** Search By Title **/
		System.out.println(objCatalogoLivros.pesquisarLivroPorTitulo("Livro1"));
		
		
		
	}

}
