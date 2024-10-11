package operacoesbasicas;

public class Tarefa {

	/**Atributo**/
	private String descricao;
	
	/**Getters and Setters**/
	public String getDescricao() {
		return descricao;
	}
	
	public Tarefa(String descricao) {
		super();
		this.descricao = descricao;
		
	}

	@Override
	public String toString() {
		return  descricao;
	}

	
	
	
	
	
}
