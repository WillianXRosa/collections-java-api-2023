package ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	
	/**Attributes**/
	private List<Pessoa>pessoaList;
	
	/**Constructors**/
	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList<>();
	}
	
	/**Add person**/
	public void adicionarPessoa(String name, int age, double height){
		pessoaList.add(new Pessoa(name, age, height));				
		
	}
	
	/**Sort by age**/
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorIdade);		
		return pessoaPorIdade;
		
	}
	
	/**Sort by height**/
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
		return pessoaPorAltura;
	}
	

}
