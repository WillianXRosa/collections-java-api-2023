package exercicioslist;

import java.util.Objects;

public class Convidado {

	/**Attributes**/
	private String name;
	private int invitationCode;
	
	/**Getters and Setters**/
	public String getName() {
		return name;
	}
	
	public int getInvitationCode() {
		return invitationCode;
	}
	
	/**Constructors**/
	public Convidado(String name, int invitationCode) {
		super();
		this.name = name;
		this.invitationCode = invitationCode;
	}
	
	/**ToString**/
	@Override
	public String toString() {
		return "Convidado [name=" + name + ", invitationCode=" + invitationCode + "]";
	}
	
	/**Equals and HashCode**/
	@Override
	public int hashCode() {
		return Objects.hash(invitationCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return invitationCode == other.invitationCode;
	}
	
	
	
}
