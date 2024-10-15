package exercicioslist;



import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

	/**Attributes**/
	private Set<Convidado> setConvidado;
	
	/**Constructors**/
	public ConjuntoConvidado() {
		setConvidado = new HashSet<>();		
	}
	
	/**Adicionar Convidado**/
	/**Add Guest**/
	public void adcionarConvidado(String name, int invitationCode) {
		setConvidado.add(new Convidado(name, invitationCode));
	}
	
		
	/**Remover Convidade Por Codigo do Convite**/
	/**remove Guest By Invite Code**/
	public void removerConvidadoPorCodigoConvite(int invitationCode) {
		Convidado convidadoParaRemover = null;
		for(Convidado objConvidado : setConvidado) {
			if(objConvidado.getInvitationCode() == invitationCode) {
				convidadoParaRemover = objConvidado;
				break;
			}
		}
		setConvidado.remove(convidadoParaRemover);
	}
	
	/**Contar Convidados**/
	/**Count Guests**/
	public int contarConvidado() {
		return setConvidado.size();
	}
	
	/**Exibir Convidados**/
	/**Display Guests**/
	public void exibirConvidados() {
		System.out.println(setConvidado);
	}
	
}
