package principal;

import exercicios.map.AgendaContatos;
import exercicios.map.EstoqueProdutos;
import exercicioslist.AgendaContato;
import exercicioslist.ConjuntoConvidado;
import exercicioslist.Contato;
import operacoesbasicas.CarrinhoDeCompras;
import operacoesbasicas.CatalogoLivros;
import operacoesbasicas.ListaTarefa;
import ordenacao.OrdenacaoPessoa;
import ordenacao.set.CadastroProdutos;

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
		//AgendaContato objAgenda = new AgendaContato();
		
		/**Adicionando Contato**/
		/**Adding Contact**/
		/*objAgenda.adicionarContato("Contato 1", 999910015);
		objAgenda.adicionarContato("Contato 2", 999920011);
		objAgenda.adicionarContato("Contato 3", 999930012);
		objAgenda.adicionarContato("Contato 4", 999940013);*/
		
		
		/**Exibindo Contato**/
		/**Displaying Contact**/
		//objAgenda.exibirContato();
		
		/**Pesquisando Contato Por Nome**/
		/**Searching By Contact Name**/
		//System.out.println(objAgenda.pesquisarPorNomeContato("Contato 4"));
		
		/**Atualizando Numero do Contato**/
		/**Updating Contact Number**/
		//System.out.println("Contato Atualizado: " + objAgenda.atualizarNumeroContato("Contato 1", 999900016));
		
		
		/*********************************************************************************************/
		
		/**collections-java-api-2023 - Collectin Framework - Set**/
		
		/**Teste exercicio Cadastro de Produto**/
		/**Product Registration Exercise Test**/
		
		/**Implementation of the Product Registration Class**/
		//CadastroProdutos objCadastroProdutos = new CadastroProdutos();
		
		/**Adicionando produtos**/
		/**Adding Products**/
		/*objCadastroProdutos.adicionarProduto(1L, "Produto 5", 12, 3);
		objCadastroProdutos.adicionarProduto(2L, "Produto 6", 5, 2);
		objCadastroProdutos.adicionarProduto(3L, "Produto 0", 15, 7);
		objCadastroProdutos.adicionarProduto(4L, "Produto 9", 20, 10);*/
		
		//System.out.println(objCadastroProdutos.setProduto);
		
		/**Exibindo produto por nome**/
		/**Displaying product by name**/
		//System.out.println(objCadastroProdutos.exibirProdutosPorNome());
		
		/**Exibindo produto por valor**/
		/**Displaying product by value**/
		//System.out.println(objCadastroProdutos.exibirProdutosPorValor());
		
		
		/*******************************************************************************************/
		
		/**collections-java-api-2023 - Collectin Framework - Map**/
		
		/**Implementacao exercicio agenda contatos**/
		//AgendaContatos objAgenda = new AgendaContatos();
		
		/**Adicionando Contato**/
		/**Adding Contact**/
		/*objAgenda.adcionarContato("Contato 1", 999910015);
		objAgenda.adcionarContato("Contato 2", 999920011);
		objAgenda.adcionarContato("Contato 3", 999930012);
		objAgenda.adcionarContato("Contato 4", 999940013);
		
		objAgenda.removerContato("Contato 3");
		
		objAgenda.exibirContato();
		
		System.out.println("o numero é: " + objAgenda.pesquisaContatoPorNome("Contato 2"));**/
		
		/***************************************************************************************/
		
		/**collections-java-api-2023 - Collectin Framework - Map**/
		
		/**Implementacao exercicio estoque de produtos**/
		EstoqueProdutos objEstoque = new EstoqueProdutos();
		
		
		/**Adicionando produtos**/
		/**Adding Products**/
		objEstoque.adicionarProduto(1L, "Produto 5", 12d, 3);
		objEstoque.adicionarProduto(2L, "Produto 6", 5d, 2);
		objEstoque.adicionarProduto(3L, "Produto 0", 15d, 7);
		objEstoque.adicionarProduto(4L, "Produto 9", 20d, 10);
		
		objEstoque.exibirProdutos();
		
		/**Calculando o valor total do estoque**/
		/**Calculate Total Stock Value**/
		System.out.println("Valor total do estoque: " + objEstoque.calcularValorTotalEstoque());
		
		/**Obter produto mais caro**/
		/**Get Most Expensive Product**/
		System.out.println("Valor do produto mais caro: " + objEstoque.obterProdutoMaisCaro());
		
		
	}

}
