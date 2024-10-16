package exercicios.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

	/**Attributes**/
	private Map<String, Integer> agendaContatoMap;
	
	/**Constructor**/
	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	/**Add Contact**/
	public void adcionarContato(String nome, Integer phoneNumber) {
		agendaContatoMap.put(nome, phoneNumber);
	}
	
	/**Remove Contact By Name**/
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
		
	}
	
	/**Display Contact By Name**/
	public void exibirContato() {
		System.out.println(agendaContatoMap);
	}
	
	/**search contact by name**/
	public Integer pesquisaContatoPorNome(String nome) {
		Integer numeroPorNome = null;
		if (!agendaContatoMap.isEmpty()) {
			 numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	
	
	
}
