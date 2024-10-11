package principal;

import operacoesbasicas.ListaTarefa;

public class Principal {

	public static void main(String[] args) {		
				
		ListaTarefa listaTarefa = new ListaTarefa();
		
		System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefa());
		
		listaTarefa.adcionarTarefa("Tarefa1");
		listaTarefa.adcionarTarefa("Tarefa1");
		listaTarefa.adcionarTarefa("Tarefa2");
		listaTarefa.adcionarTarefa("Tarefa3");
		listaTarefa.adcionarTarefa("Tarefa4");		
		System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefa());
		
		listaTarefa.removerTarefa("Tarefa3");
		System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefa());
		
		listaTarefa.obterDescricaoTarefas();
		
	}

}
