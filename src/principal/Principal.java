package principal;

import exercicioslist.AgendaContato;
import exercicioslist.ConjuntoConvidado;
import exercicioslist.Contato;
import operacoesbasicas.CarrinhoDeCompras;
import operacoesbasicas.CatalogoLivros;
import operacoesbasicas.ListaTarefa;
import ordenacao.OrdenacaoPessoa;

public class Principal {

	public static void main(String[] args) {		
		
		/**Teste da lista de tarefas**/
		/**Instanciando a classe lista de tarefas**/
		/*ListaTarefa listaTarefa = new ListaTarefa();		
		
		System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefa());
		
		listaTarefa.adcionarTarefa("Tarefa 1");
		listaTarefa.adcionarTarefa("Tarefa 1");
		listaTarefa.adcionarTarefa("Tarefa 2");
		listaTarefa.adcionarTarefa("Tarefa 3");
		listaTarefa.adcionarTarefa("Tarefa 4");		
		System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefa());
		
		listaTarefa.removerTarefa("Ta'refa3");
		System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefa());
		
		listaTarefa.obterDescricaoTarefas();*/
		
		/***********************************************************************************************/
		
		/**Teste do Catálogo de Livros**/
		/**Book Catalog Test**/
		
		/**Instanciando a classe catalogo de livros**/
		/**Instantiating the book catalog class**/		
		//CatalogoLivros objCatalogoLivros = new CatalogoLivros();
		
		/**Adicionando a livros**/
		/**Adding to books**/
		/*objCatalogoLivros.adicionarLivro("Livro 1", "Autor1", 1990);
		objCatalogoLivros.adicionarLivro("Livro 1", "Autor2", 1997);
		objCatalogoLivros.adicionarLivro("Livro 2", "Autor2", 2000);
		objCatalogoLivros.adicionarLivro("Livro 3", "Autor3", 1971);
		objCatalogoLivros.adicionarLivro("Livro 4", "Autor4", 2023);
		objCatalogoLivros.adicionarLivro("Livro 5", "Autor4", 2017);
		objCatalogoLivros.adicionarLivro("Livro 6", "Autor6", 2013);
		*/
		
		/**Pesquisar livros por autor**/
		/**Searching for books by author**/
		//System.out.println(objCatalogoLivros.pesquisarPorAutor("Autor4"));
		
		/**Pesquisar por intervalo de ano**/
		/**Searching by year range**/
		//System.out.println(objCatalogoLivros.pesquisarPorIntervaloDeAno(1971, 1997));
		
		/**Pesquisar por título**/
		/** Search By Title **/
		//System.out.println(objCatalogoLivros.pesquisarLivroPorTitulo("Livro1"));
		
		/**********************************************************************************************/
		 
		/**Teste  de Comparacao de pessoa por altura**/
		/**Person by Height Comparison Test**/
		
		/**Intanciando a classe ordenacao pessoa**/
		/**Instantiating the person ordering class**/
		//OrdenacaoPessoa objOrdenacaoPessoa = new OrdenacaoPessoa();
		
		/**Adicionando Pessoa**/
		/**Adding Person**/
		/*objOrdenacaoPessoa.adicionarPessoa("Name 1", 23, 1.75);
		objOrdenacaoPessoa.adicionarPessoa("Name 2", 18, 1.80);
		objOrdenacaoPessoa.adicionarPessoa("Name 3", 13, 1.75);
		objOrdenacaoPessoa.adicionarPessoa("Name 4", 25, 1.65);
		objOrdenacaoPessoa.adicionarPessoa("Name 5", 23, 1.90);
		objOrdenacaoPessoa.adicionarPessoa("Name 6", 30, 1.70);*/
		
		/**Ordenar por idade**/
		/**Sort by age**/
		//System.out.println(objOrdenacaoPessoa.ordenarPorIdade());
		
		/**Ordenar por altura**/
		/**Sort by height**/
		//System.out.println(objOrdenacaoPessoa.ordenarPorAltura());
		
		/*********************************************************************************/
		
		/**Instanciando a classe catalogo de livros**/
		/**Instanciando a classe CarrinhoDeCompas**/
		//CarrinhoDeCompras objCarrinhoDeCompras = new CarrinhoDeCompras();
		
		/**Adicionando Itens**/
		/**Adding Itens**/
		/**objCarrinhoDeCompras.adicionarItem("Item 1", 12.00, 1);
		objCarrinhoDeCompras.adicionarItem("Item 2", 9.00, 2);
		objCarrinhoDeCompras.adicionarItem("Item 3", 2.00, 1);
		objCarrinhoDeCompras.adicionarItem("Item 4", 10.00, 3);**/
		
		/**Removendo Item do Carrinho**/
		/**Remove Item**/
		//objCarrinhoDeCompras.removerItem("Item3");
		//objCarrinhoDeCompras.exibirItens();
		
		/**Exibindo Itens do Carrinho**/
		/**Displaying Cart Items**/
		//objCarrinhoDeCompras.exibirItens();
		
		/***********************************************************************************/
		
		/**collections-java-api-2023 - Collectin Framework - Set**/
		
		/**Implementacao exercicio convidado**/
		//ConjuntoConvidado objConjuntoConvidado = new ConjuntoConvidado();
		//System.out.println("Existem " + objConjuntoConvidado.contarConvidado() + " convidado(s) no set de convidados");
		
		/**Adicionando Convidado**/
		/**Adding Guest**/
		/*objConjuntoConvidado.adcionarConvidado("Convidado 1", 1231);
		objConjuntoConvidado.adcionarConvidado("Convidado 2", 1234);
		objConjuntoConvidado.adcionarConvidado("Convidado 3", 1341);
		objConjuntoConvidado.adcionarConvidado("Convidado 4", 1342);
		System.out.println("Existem " + objConjuntoConvidado.contarConvidado() + " convidado(s) no set de convidados");*/
		
		/**Exibindo Convidados**/
		/**Displaying Guests**/
		//objConjuntoConvidado.exibirConvidados();
		
		/**Contando Convidados**/
		/**Counting Guests**/
		//objConjuntoConvidado.contarConvidado();
		
		/**Removendo Convidado Pelo Código do Convite**/
		/**Removing Guest by Invitation Code**/
		/*objConjuntoConvidado.removerConvidadoPorCodigoConvite(1341);
		System.out.println("Existem " + objConjuntoConvidado.contarConvidado() + " convidado(s) no set de convidados");
		objConjuntoConvidado.exibirConvidados();*/
		
		/************************************************************************************************************/
		
		/**collections-java-api-2023 - Collectin Framework - Set**/
		
		/**Implementacao exercicio agenda contatos**/
		AgendaContato objAgenda = new AgendaContato();
		
		/**Adicionando Contato**/
		/**Adding Contact**/
		objAgenda.adicionarContato("Contato 1", 999910015);
		objAgenda.adicionarContato("Contato 2", 999920011);
		objAgenda.adicionarContato("Contato 3", 999930012);
		objAgenda.adicionarContato("Contato 4", 999940013);
		
		
		/**Exibindo Contato**/
		/**Displaying Contact**/
		objAgenda.exibirContato();
		
		/**Pesquesando Contato Por Nome**/
		/**Searching By Contact Name**/
		System.out.println(objAgenda.pesquisarPorNomeContato("Contato 4"));
		
		/**Atualizando Numero do Contato**/
		/**Updating Contact Number**/
		System.out.println("Contato Atualizado: " + objAgenda.atualizarNumeroContato("Contato 1", 999900016));
		
		
		/*********************************************************************************************/
		
	}

}
