package exercicioslist;

import java.util.Objects;

public class Contato {

	/**Attributes**/
	private String name;
	private int phoneNumber;
	
	/**Getters**/
	public String getName() {
		return name;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**Constructors**/
	public Contato(String name, int phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	/**ToString**/
	@Override
	public String toString() {
		return "Contato [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	/**Equals and HashCode**/
	@Override
	public int hashCode() {
		return Objects.hash(name, phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(name, other.name) && phoneNumber == other.phoneNumber;
	}
	
	
	
	
}
