package principal;

import operacoesbasicas.CatalogoLivros;
import operacoesbasicas.ListaTarefa;

public class Principal {

	public static void main(String[] args) {		
		
		/**Teste da lista de tarefas**/
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
		/**Instanciando a classe catalogo de livros**/
		CatalogoLivros objCatalogoLivros = new CatalogoLivros();
		
		/**Adicionando a livros**/
		objCatalogoLivros.adicionarLivro("A Giripoca vai piar", "Mané", 1990);
		objCatalogoLivros.adicionarLivro("Aprendendo Java", "José", 1995);
		
		
		
	}

}
