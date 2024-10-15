package ordenacao.set;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{

	/**Attributes**/
	private Long codigo;
	private String nome;
	private double valor;
	private int quantidade;
	
	/**Getter and Setters**/
	public Long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	} 
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	/**Constructors**/
	public Produto(Long codigo, String nome, double valor, int quantidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	
	/**To String**/
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", valor=" + valor + ", quantidade=" + quantidade + "]";
	}
	
	/**Compare To**/
	@Override
	public int compareTo(Produto produto) {
		// TODO Auto-generated method stub
		return nome.compareToIgnoreCase(produto.getNome());
	}
	
	
	/**HashCode and Equals**/
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}


}
