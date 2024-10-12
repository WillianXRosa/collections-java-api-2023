package operacoesbasicas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CatalogoLivros {

	/** Attributes **/
	private List<Livro> listLivro;

	/** Constructors **/
	public CatalogoLivros() {
		this.listLivro = new ArrayList<>();
	}

	/**
	 * Implementation of methods (Add Book, Search By Author, Search By Year Range,
	 * Search By Title)
	 **/
	/** Add Book **/
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		listLivro.add(new Livro(titulo, autor, anoPublicacao));
	}

	/** Search By Author **/
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livroPorAutor = new ArrayList<>();
		if (!listLivro.isEmpty()) {
			for (Livro livro : listLivro) {
				if (livro.getAutor().equalsIgnoreCase(autor)) {
					livroPorAutor.add(livro);
				}
			}
		}
		return livroPorAutor;
	}

	/** Search By Year Range **/
	public List<Livro> pesquisarPorIntervaloDeAno(int anoInicial, int anoFinal) {
		List<Livro> livroPorIntervaloDeAno = new ArrayList<>();
		if (!listLivro.isEmpty()) {
			for (Livro livro : listLivro) {
				if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
					livroPorIntervaloDeAno.add(livro);
				}
			}
		}
		return livroPorIntervaloDeAno;

	}

	/** Search By Title **/
	public Livro pesquisarLivroPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if (!listLivro.isEmpty()) {
			for (Livro livro : listLivro) {
				if (livro.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = livro;
					break;
				}
			}
		}
		return livroPorTitulo;
	}

}
