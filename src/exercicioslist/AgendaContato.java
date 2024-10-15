package exercicioslist;

import java.util.HashSet;
import java.util.Set;

	/** Attibutes **/
	public class AgendaContato {
	private Set<Contato> setContato;

	/** Constructors **/
	public AgendaContato() {
		this.setContato = new HashSet();		
				
	}
	
	/**Adicionar Contato**/
	/**Add Contact**/
	public void adicionarContato(String name,int phoneNumber ){
		setContato.add(new Contato(name, phoneNumber));
	}
	
	/**ExibirContato**/
	/**Display Contact**/
	public void exibirContato(){
		System.out.println(setContato);		
	}
	
	/**Pesquisa Por Name de Contato**/
	/**Search By Name**/
	public Set<Contato> pesquisarPorNomeContato(String name){
		Set<Contato> contatoPorNome = new HashSet();
		for(Contato objContato : setContato) {
			if(objContato.getName().startsWith(name)) {				
				contatoPorNome.add(objContato);
			}
		}
		
		return contatoPorNome;		
		
	}
	
	/**Atualizar Numero do Contato**/
	/**Update Contact Number**/
	public Contato atualizarNumeroContato(String name, int newNumber) {
		Contato contatoAtualizado = null;
		for(Contato objContato : setContato) {
			if(objContato.getName().equalsIgnoreCase(name)) {
				objContato.setPhoneNumber(newNumber);
				contatoAtualizado = objContato;
				break;
			}
		}
		return contatoAtualizado;
	}
}