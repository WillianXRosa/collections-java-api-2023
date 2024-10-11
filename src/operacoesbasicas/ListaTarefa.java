package operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	/**Atributo**/
	private List<Tarefa>tarefaList;
	
	/**Construtor**/
	public ListaTarefa() {
		super();
		this.tarefaList = new ArrayList<>();
		
	}
	
	/**Implementando Métodos para adcionar, remover, numero de tarefas, listar por descricao**/
	
	public void adcionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefaParaRemover = new ArrayList<>();
		for(Tarefa objtarefa : tarefaList) {
			if (objtarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover.add(objtarefa);
				
			}
		}
		
		tarefaList.removeAll(tarefaParaRemover);
	}
	
	public int obterNumeroTotalTarefa() {
		return tarefaList.size();
		
	}
	
	public void obterDescricaoTarefas() {
		System.out.println(tarefaList);
	}
	
	
}
